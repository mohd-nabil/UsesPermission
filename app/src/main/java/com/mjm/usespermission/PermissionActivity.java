package com.mjm.usespermission;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


@TargetApi(Build.VERSION_CODES.M)
public class PermissionActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

    private static final int SETTINGS = 999;
    static PermissionHandler permissionHandler;

    private Permission permission = Permission.getInstance();
    private String[] permissionsAsked;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFinishOnTouchOutside(false);
        getWindow().setStatusBarColor(0);

        permissionsAsked = getIntent().getStringArrayExtra("permissions");
        if(permissionsAsked != null && permissionsAsked.length > 0) {
            permission.ask(this, permissionsAsked, 1);
        }else{
            Toast.makeText(this, "Provide atleast one permission.", Toast.LENGTH_LONG).show();
            finish();
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode <= 24){

            // If request is cancelled, the result arrays are empty.
            if (grantResults.length > 0) {

                boolean status = false;

                for(int index=0; index < grantResults.length; index++){
                    status = grantResults[index] == PackageManager.PERMISSION_GRANTED;
                    if(!status){
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(PermissionActivity.this, permissions[index])) {
                            // Provide an additional rationale to the user if the permission was not granted
                            // and the user would benefit from additional context for the use of the permission.
                            // For example if the user has previously denied the permission.
                            settings();
                            return;
                        }
                        break;
                    }
                }
                // permission was granted, yay! Do the
                // contacts-related task you need to do.
                permissionHandler.status(status);
                finish();
            } else {
                // permission denied, boo! Disable the
                // functionality that depends on this permission.

                permissionHandler.status(false);
                finish();
            }
        }

    }

    private void settings() {
        new AlertDialog.Builder(this).setTitle("Permissions Required")
                .setCancelable(false)
                .setMessage("Required permission(s) have been set not to ask again! Please provide them from settings.")
                .setPositiveButton("Allow", new DialogInterface.OnClickListener() {
                    @Override
                    @SuppressWarnings("InlinedAPI")
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.fromParts("package", getPackageName(), null));
                        startActivityForResult(intent, SETTINGS);
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).create().show();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SETTINGS && permissionHandler != null) {
            permission.ask(this, permissionsAsked, 1);
        }
//        super.finish();
    }
}

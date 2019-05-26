package com.mjm.usespermission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Sample extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sample();
            }
        });

    }

    private void sample(){
        /*
         * NOTE:
         * Before verifying or asking permission you must need to add those permission in AndroidManifest.xml
         *
         * */

        /*
         * *Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        permission.ask(this, "", new PermissionHandler() {
            @Override
            public void status(boolean status) {
                Toast.makeText(getApplicationContext(), String.format("%s", status), Toast.LENGTH_LONG).show();
            }
        });

        List<String> permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        permission.ask(this, permissionList, new PermissionHandler() {
            @Override
            public void status(boolean status) {
                Toast.makeText(getApplicationContext(), String.format("%s", status), Toast.LENGTH_LONG).show();

            }
        });
//
//
//
//
        /*
        * *Verifying Only particular permission*/
        boolean isVerified = permission.ACCESS_COARSE_LOCATION_V(this);

        /*
        * *Verifying and asking particular permission*/
        if(!permission.CAMERA_V(this)) {
            permission.ask(this, Permissions.CAMERA, 1);
        }
        /*
        * *Verifying Only List of permission*/
        permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        isVerified = permission.verify(this, permissionList);

        /*
        * *Verifying and asking List of permission*/
        permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        if(!permission.verify(this, permissionList)) {
            permission.ask(this, permissionList, 1);
        }

        /*
        * *Asking particular permission directly without verifying*/
        permission.ask(this, Permissions.ACCESS_COARSE_LOCATION, new PermissionHandler() {
            @Override
            public void status(boolean status) {

            }
        });

        /*
        * *Asking List of permission directly without verifying*/
        permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        permission.ask(this, permissionList, 1);


        /*
        * *Forcefully open setting to enable permission*/
        permission.forceFullOpenPermission(this);


    }
}

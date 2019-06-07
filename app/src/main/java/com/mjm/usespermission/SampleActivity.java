package com.mjm.usespermission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.singlePermissionBTN);
        findViewById(R.id.listPermissionsBTN);
        findViewById(R.id.arrayPermissionsBTN);
        findViewById(R.id.verifySinglePermissionBTN);
        findViewById(R.id.listPermissionsBTN);
        findViewById(R.id.verifyArrayOfPermissionsBTN);
        findViewById(R.id.forceFullPermissionBTN);
    }

    public void singlePermission(View view) {
        /*NOTE:  Before verifying or asking permission you must need to add those permission in AndroidManifest.xml */

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        permission.ask(this, Permissions.ACCESS_FINE_LOCATION, new PermissionHandler() {
            @Override
            public void status(boolean status) {
                Toast.makeText(getApplicationContext(), String.format("%s", status), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void arrayPermissions(View view) {
        /*NOTE:  Before verifying or asking permission you must need to add those permission in AndroidManifest.xml */

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        String[] permissionArray = {Permissions.ACCESS_FINE_LOCATION, Permissions.BODY_SENSORS};
        permission.ask(this, permissionArray, new PermissionHandler() {
            @Override
            public void status(boolean status) {
                Toast.makeText(getApplicationContext(), String.format("%s", status), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void listPermissions(View view) {
        /*NOTE:  Before verifying or asking permission you must need to add those permission in AndroidManifest.xml */

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        List<String> permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        permission.ask(this, permissionList, new PermissionHandler() {
            @Override
            public void status(boolean status) {
                Toast.makeText(getApplicationContext(), String.format("%s", status), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void verifySinglePermission(View view) {
        /*Verifying Only particular permission*/

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        boolean isVerified = permission.ACCESS_COARSE_LOCATION_V(this);
    }

    public void verifyListOfPermissions(View view) {
        /*Verifying Only List of permission*/

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        List<String> permissionList = new ArrayList<>();
        permissionList.add(Permissions.ACCESS_FINE_LOCATION);
        permissionList.add(Permissions.BODY_SENSORS);
        boolean isVerified = permission.verify(this, permissionList);
    }

    public void verifyArrayOfPermissions(View view) {
        /*Verifying Only List of permission*/

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        String[] permissionArray = {Permissions.ACCESS_FINE_LOCATION, Permissions.BODY_SENSORS};
        boolean isVerified = permission.verify(this, permissionArray);
    }

    public void forceFullPermission(View view) {
        /*Forcefully open setting to enable permission*/

        /*Get instance of Request Permissions class*/
        Permission permission = Permission.getInstance();
        permission.forceFullOpenPermission(this);
    }
}

package com.mjm.usespermission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * NOTE:
         * Before verifying or asking permission you must need to add those permission in AndroidManifest.xml
         *
         * */

        /**Verifying Only particular permission*/
        boolean isVerified = RequestPermission.ACCESS_COARSE_LOCATION_V(this);

        /**Verifying and asking particular permission*/
        if(!RequestPermission.ACCESS_COARSE_LOCATION_V(this)){
            RequestPermission.askPermission(this, Permission.ACCESS_COARSE_LOCATION, 1);
        }

        /**Verifying Only List of permission*/
        List<String> permissionList = new ArrayList<>();
        permissionList.add(Permission.ACCESS_FINE_LOCATION);
        permissionList.add(Permission.BODY_SENSORS);
        isVerified = RequestPermission.verifyPermission(this, permissionList);

        /**Verifying and asking List of permission*/
        permissionList = new ArrayList<>();
        permissionList.add(Permission.ACCESS_FINE_LOCATION);
        permissionList.add(Permission.BODY_SENSORS);
        if(!RequestPermission.verifyPermission(this, permissionList)) {
            RequestPermission.askPermission(this, permissionList, 1);
        }

        /**Asking particular permission directly without verifying*/
        RequestPermission.askPermission(this, Permission.ACCESS_COARSE_LOCATION, 1);

        /**Asking List of permission directly without verifying*/
        permissionList = new ArrayList<>();
        permissionList.add(Permission.ACCESS_FINE_LOCATION);
        permissionList.add(Permission.BODY_SENSORS);
        RequestPermission.askPermission(this, permissionList, 1);


        /**Forcefully open setting to enable permission*/
        RequestPermission.forceFullOpenPermission(this);


    }
}

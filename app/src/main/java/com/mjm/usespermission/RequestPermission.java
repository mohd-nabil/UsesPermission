package com.mjm.usespermission;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anusha.g on 12-06-2018.
 */
public class RequestPermission {

    /**
     * @param activity
     * @return true/false
     */
    public static boolean ACCESS_COARSE_LOCATION_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean ACCESS_FINE_LOCATION_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean ADD_VOICEMAIL_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ADD_VOICEMAIL);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean BODY_SENSORS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.BODY_SENSORS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean CALL_PHONE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean CAMERA_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean GET_ACCOUNTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.GET_ACCOUNTS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean PROCESS_OUTGOING_CALLS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.PROCESS_OUTGOING_CALLS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_CALENDAR_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALENDAR);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_CALL_LOG_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALL_LOG);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_CONTACTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CONTACTS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_EXTERNAL_STORAGE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_PHONE_STATE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_PHONE_STATE);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean READ_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_SMS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean RECEIVE_MMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_MMS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean RECEIVE_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_SMS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean RECEIVE_WAP_PUSH_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_WAP_PUSH);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean RECORD_AUDIO_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean SEND_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.SEND_SMS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean USE_SIP_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.USE_SIP);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean WRITE_CALENDAR_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALENDAR);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean WRITE_CALL_LOG_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALL_LOG);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean WRITE_CONTACTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CONTACTS);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @return true/false
     */
    public static boolean WRITE_EXTERNAL_STORAGE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        return verifyPermission(permissionStatus);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean ACCESS_COARSE_LOCATION(Activity activity){
        String permission = Manifest.permission.ACCESS_COARSE_LOCATION;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION);
        return verifyPermission(activity, permission, permissionStatus, 1);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean ACCESS_FINE_LOCATION(Activity activity){
        String permission = Manifest.permission.ACCESS_FINE_LOCATION;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
        return verifyPermission(activity, permission, permissionStatus, 2);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean ADD_VOICEMAIL(Activity activity){
        String permission = Manifest.permission.ADD_VOICEMAIL;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ADD_VOICEMAIL);
        return verifyPermission(activity, permission, permissionStatus, 3);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean BODY_SENSORS(Activity activity){
        String permission = Manifest.permission.BODY_SENSORS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.BODY_SENSORS);
        return verifyPermission(activity, permission, permissionStatus, 4);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean CALL_PHONE(Activity activity){
        String permission = Manifest.permission.CALL_PHONE;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
        return verifyPermission(activity, permission, permissionStatus, 5);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean CAMERA(Activity activity){
        String permission = Manifest.permission.CAMERA;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA);
        return verifyPermission(activity, permission, permissionStatus, 6);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean GET_ACCOUNTS(Activity activity){
        String permission = Manifest.permission.GET_ACCOUNTS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.GET_ACCOUNTS);
        return verifyPermission(activity, permission, permissionStatus, 7);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean PROCESS_OUTGOING_CALLS(Activity activity){
        String permission = Manifest.permission.PROCESS_OUTGOING_CALLS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.PROCESS_OUTGOING_CALLS);
        return verifyPermission(activity, permission, permissionStatus, 8);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_CALENDAR(Activity activity){
        String permission = Manifest.permission.READ_CALENDAR;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALENDAR);
        return verifyPermission(activity, permission, permissionStatus, 9);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_CALL_LOG(Activity activity){
        String permission = Manifest.permission.READ_CALL_LOG;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CALL_LOG);
        return verifyPermission(activity, permission, permissionStatus, 10);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_CONTACTS(Activity activity){
        String permission = Manifest.permission.READ_CONTACTS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_CONTACTS);
        return verifyPermission(activity, permission, permissionStatus, 11);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_EXTERNAL_STORAGE(Activity activity){
        String permission = Manifest.permission.READ_EXTERNAL_STORAGE;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);
        return verifyPermission(activity, permission, permissionStatus, 12);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_PHONE_STATE(Activity activity){
        String permission = Manifest.permission.READ_PHONE_STATE;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_PHONE_STATE);
        return verifyPermission(activity, permission, permissionStatus, 13);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean READ_SMS(Activity activity){
        String permission = Manifest.permission.READ_SMS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_SMS);
        return verifyPermission(activity, permission, permissionStatus, 14);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean RECEIVE_MMS(Activity activity){
        String permission = Manifest.permission.RECEIVE_MMS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_MMS);
        return verifyPermission(activity, permission, permissionStatus, 15);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean RECEIVE_SMS(Activity activity){
        String permission = Manifest.permission.RECEIVE_SMS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_SMS);
        return verifyPermission(activity, permission, permissionStatus, 16);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean RECEIVE_WAP_PUSH(Activity activity){
        String permission = Manifest.permission.RECEIVE_WAP_PUSH;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECEIVE_WAP_PUSH);
        return verifyPermission(activity, permission, permissionStatus, 17);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean RECORD_AUDIO(Activity activity){
        String permission = Manifest.permission.RECORD_AUDIO;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO);
        return verifyPermission(activity, permission, permissionStatus, 18);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean SEND_SMS(Activity activity){
        String permission = Manifest.permission.SEND_SMS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.SEND_SMS);
        return verifyPermission(activity, permission, permissionStatus, 19);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean USE_SIP(Activity activity){
        String permission = Manifest.permission.USE_SIP;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.USE_SIP);
        return verifyPermission(activity, permission, permissionStatus, 20);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean WRITE_CALENDAR(Activity activity){
        String permission = Manifest.permission.WRITE_CALENDAR;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALENDAR);
        return verifyPermission(activity, permission, permissionStatus, 21);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean WRITE_CALL_LOG(Activity activity){
        String permission = Manifest.permission.WRITE_CALL_LOG;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CALL_LOG);
        return verifyPermission(activity, permission, permissionStatus, 22);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean WRITE_CONTACTS(Activity activity){
        String permission = Manifest.permission.WRITE_CONTACTS;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_CONTACTS);
        return verifyPermission(activity, permission, permissionStatus, 23);
    }

    /**
     * @param activity
     * @dialog open a permission dialog
     * @return true/false
     */
    public static boolean WRITE_EXTERNAL_STORAGE(Activity activity){
        String permission = Manifest.permission.WRITE_EXTERNAL_STORAGE;
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        return verifyPermission(activity, permission, permissionStatus, 24);
    }

    private static boolean verifyPermission(int permissionStatus){
        if((permissionStatus != PackageManager.PERMISSION_GRANTED)){
            return false;
        }else{
            return true;
        }
    }

    private static boolean verifyPermission(Activity activity, String permission, int permissionStatus, int requestCode){
        if((permissionStatus != PackageManager.PERMISSION_GRANTED)){
            askPermission(activity, permission, requestCode);
            return false;
        }else{
            return true;
        }
    }

    /**
     * @param activity
     * @param permissions
     * @return true/false
     */
    public static boolean verifyPermission(Activity activity, List<String> permissions){
        for(String permission: permissions) {
            int permissionStatus = ActivityCompat.checkSelfPermission(activity, permission);
            if(permissionStatus != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }

    /**
     * @dialog open a permission dialog
     * @param activity
     * @param permission
     * @param requestCode
     */
    public static void askPermission(Activity activity, String permission, int requestCode){
        List<String> list = new ArrayList<>();
        list.add(permission);
        askPermission(activity, list, requestCode);
    }

    /**
     * @dialog open a permission dialog
     * @param activity
     * @param permissions
     * @param requestCode
     */
    public static void askPermission(Activity activity, List<String> permissions, int requestCode){
        ActivityCompat.requestPermissions(
                activity,
                permissions.toArray(new String[permissions.size()]),
                requestCode);
    }

    /**
     * @dialog open a permission dialog
     * @param activity
     * @param permission
     */
    public static void providePermission(Activity activity, String permission){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, permission);
        verifyPermission(activity, permission, permissionStatus, 1);
    }

    /**
     * @param activity
     * open setting screen
     */
    public static void forceFullOpenPermission(Activity activity){
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", activity.getPackageName(), null);
        intent.setData(uri);
        activity.startActivityForResult(intent, 1);
    }
}

package com.mjm.usespermission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anusha.g on 12-06-2018.
 */
public class Permission {

    @SuppressLint("StaticFieldLeak")
    private static Permission instance;

    static public Permission getInstance() {
        if (instance == null) {
            instance = new Permission();
            return instance;
        } else {
            return instance;
        }
    }


    public void ask(Context context, String permission, final PermissionHandler permissionHandler){
        check(context, new String[]{permission}, permissionHandler);
    }

    public void ask(Context context, String[] permissions, final PermissionHandler permissionHandler){
        check(context, permissions, permissionHandler);
    }

    public void ask(Context context, List<String> permissions, final PermissionHandler permissionHandler){
        check(context, permissions.toArray(new String[permissions.size()]), permissionHandler);
    }

    private void check(Context context, String[] permissions, PermissionHandler permissionHandler){
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M || verify((Activity) context, permissions)){
            permissionHandler.status(true);
            return;
        }
        PermissionActivity.permissionHandler = permissionHandler;
        context.startActivity(new Intent(context, PermissionActivity.class).putExtra("permissions", permissions));
    }

    /**
     *
     * @return true/false
     */
    public boolean ACCESS_COARSE_LOCATION_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.ACCESS_COARSE_LOCATION);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean ACCESS_FINE_LOCATION_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.ACCESS_FINE_LOCATION);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean ADD_VOICE_MAIL_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.ADD_VOICE_MAIL);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean BODY_SENSORS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.BODY_SENSORS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean CALL_PHONE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.CALL_PHONE);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean CAMERA_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.CAMERA);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean GET_ACCOUNTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.GET_ACCOUNTS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean PROCESS_OUTGOING_CALLS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.PROCESS_OUTGOING_CALLS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_CALENDAR_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CALENDAR);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_CALL_LOG_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CALL_LOG);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_CONTACTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CONTACTS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_EXTERNAL_STORAGE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_EXTERNAL_STORAGE);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_PHONE_STATE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_PHONE_STATE);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean READ_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.READ_SMS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean RECEIVE_MMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_MMS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean RECEIVE_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_SMS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean RECEIVE_WAP_PUSH_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_WAP_PUSH);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean RECORD_AUDIO_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.RECORD_AUDIO);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean SEND_SMS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.SEND_SMS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean USE_SIP_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.USE_SIP);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean WRITE_CALENDAR_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CALENDAR);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean WRITE_CALL_LOG_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CALL_LOG);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean WRITE_CONTACTS_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CONTACTS);
        return verify(permissionStatus);
    }

    /**
     *
     * @return true/false
     */
    public boolean WRITE_EXTERNAL_STORAGE_V(Activity activity){
        int permissionStatus = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_EXTERNAL_STORAGE);
        return verify(permissionStatus);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean ACCESS_COARSE_LOCATION(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.ACCESS_COARSE_LOCATION);
        return verify(activity, Permissions.ACCESS_COARSE_LOCATION, status, 1);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean ACCESS_FINE_LOCATION(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.ACCESS_FINE_LOCATION);
        return verify(activity, Permissions.ACCESS_FINE_LOCATION, status, 2);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean ADD_VOICE_MAIL(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.ADD_VOICE_MAIL);
        return verify(activity, Permissions.ADD_VOICE_MAIL, status, 3);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean BODY_SENSORS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.BODY_SENSORS);
        return verify(activity, Permissions.BODY_SENSORS, status, 4);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean CALL_PHONE(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.CALL_PHONE);
        return verify(activity, Permissions.CALL_PHONE, status, 5);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean CAMERA(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.CAMERA);
        return verify(activity, Permissions.CAMERA, status, 6);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean GET_ACCOUNTS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.GET_ACCOUNTS);
        return verify(activity, Permissions.GET_ACCOUNTS, status, 7);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean PROCESS_OUTGOING_CALLS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.PROCESS_OUTGOING_CALLS);
        return verify(activity, Permissions.PROCESS_OUTGOING_CALLS, status, 8);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_CALENDAR(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CALENDAR);
        return verify(activity, Permissions.READ_CALENDAR, status, 9);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_CALL_LOG(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CALL_LOG);
        return verify(activity, Permissions.READ_CALL_LOG, status, 10);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_CONTACTS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_CONTACTS);
        return verify(activity, Permissions.READ_CONTACTS, status, 11);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_EXTERNAL_STORAGE(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_EXTERNAL_STORAGE);
        return verify(activity, Permissions.READ_EXTERNAL_STORAGE, status, 12);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_PHONE_STATE(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_PHONE_STATE);
        return verify(activity, Permissions.READ_PHONE_STATE, status, 13);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean READ_SMS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.READ_SMS);
        return verify(activity, Permissions.READ_SMS, status, 14);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean RECEIVE_MMS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_MMS);
        return verify(activity, Permissions.RECEIVE_MMS, status, 15);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean RECEIVE_SMS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_SMS);
        return verify(activity, Permissions.RECEIVE_SMS, status, 16);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean RECEIVE_WAP_PUSH(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.RECEIVE_WAP_PUSH);
        return verify(activity, Permissions.RECEIVE_WAP_PUSH, status, 17);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean RECORD_AUDIO(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.RECORD_AUDIO);
        return verify(activity, Permissions.RECORD_AUDIO, status, 18);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean SEND_SMS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.SEND_SMS);
        return verify(activity, Permissions.SEND_SMS, status, 19);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean USE_SIP(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.USE_SIP);
        return verify(activity, Permissions.USE_SIP, status, 20);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean WRITE_CALENDAR(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CALENDAR);
        return verify(activity, Permissions.WRITE_CALENDAR, status, 21);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean WRITE_CALL_LOG(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CALL_LOG);
        return verify(activity, Permissions.WRITE_CALL_LOG, status, 22);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean WRITE_CONTACTS(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_CONTACTS);
        return verify(activity, Permissions.WRITE_CONTACTS, status, 23);
    }

    /**
     *
     * dialog <p>open a permission dialog</p>
     * @return true/false
     */
    public boolean WRITE_EXTERNAL_STORAGE(Activity activity){
        int status = ActivityCompat.checkSelfPermission(activity, Permissions.WRITE_EXTERNAL_STORAGE);
        return verify(activity, Permissions.WRITE_EXTERNAL_STORAGE, status, 24);
    }

    private boolean verify(int permissionStatus){
        if((permissionStatus != PackageManager.PERMISSION_GRANTED)){
            return false;
        }else{
            return true;
        }
    }

    private boolean verify(Activity activity, String permission, int status, int requestCode){
        if((status != PackageManager.PERMISSION_GRANTED)){
            ask(activity, permission, requestCode);
            return false;
        }else{
            return true;
        }
    }

    /**
     *
     * @param permissions <p>List of Marshmallow permission</p>
     * @return true/false
     */
    public boolean verify(Activity activity, List<String> permissions){
        for(String permission: permissions) {
            int permissionStatus = ActivityCompat.checkSelfPermission(activity, permission);
            if(permissionStatus != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param permissions <p>Array of Marshmallow permission</p>
     * @return true/false
     */
    public boolean verify(Activity activity, String[] permissions){
        for(String permission: permissions) {
            int permissionStatus = ActivityCompat.checkSelfPermission(activity, permission);
            if(permissionStatus != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }

    /**
     * dialog <p>open a permission dialog</p>
     *
     * @param permission @param permissions <p>A Marshmallow permission</p>
     * @param requestCode @param requestCode <p>Callback request code</p>
     */
    public void ask(Activity activity, String permission, int requestCode){
        List<String> list = new ArrayList<>();
        list.add(permission);
        ask(activity, list, requestCode);
    }

    /**
     * dialog <p>open a permission dialog</p>
     *
     * @param permissions <p>List of Marshmallow permission</p>
     * @param requestCode <p>Callback request code</p>
     */
    public void ask(Activity activity, List<String> permissions, int requestCode){
        ActivityCompat.requestPermissions(activity,  permissions.toArray(new String[permissions.size()]), requestCode);
    }

    public void ask(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }
    /**
     * dialog <p>open a permission dialog</p>
     *
     * @param permission <p>A Marshmallow permission</p>
     */
    public void providePermission(Activity activity, String permission){
        int status = ActivityCompat.checkSelfPermission(activity, permission);
        verify(activity, permission, status, 1);
    }

    /**
     *
     * open setting screen
     */
    public void forceFullOpenPermission(Activity activity){
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", activity.getPackageName(), null);
        intent.setData(uri);
        activity.startActivityForResult(intent, 1);
    }
}

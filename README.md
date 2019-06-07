# UsesPermission

1. Easy access of all Marshmallow permissions.
2. Verify single permission or array or list of permission at a time.
3. Ask single permission or array or list of permission at a time.
4. Permission callback with status(true[accept]/false[denied]).
5. Force full ask permission.
6. Application will stop if permission is not provided in AndroidManifest.xml file.
7. Below version of Marshmallow get direct status true.

# Handel all exception.
# Make your code clean.

--List of Marshmallow Permission--
* ACCESS_COARSE_LOCATION
* ACCESS_FINE_LOCATION
* ADD_VOICE_MAIL
* BODY_SENSORS
* CALL_PHONE
* CAMERA
* GET_ACCOUNTS
* PROCESS_OUTGOING_CALLS
* READ_CALENDAR
* READ_CALL_LOG
* READ_CONTACTS
* READ_EXTERNAL_STORAGE
* READ_PHONE_STATE
* READ_SMS
* RECEIVE_MMS
* RECEIVE_SMS
* RECEIVE_WAP_PUSH
* RECORD_AUDIO
* SEND_SMS
* USE_SIP
* WRITE_CALENDAR
* WRITE_CALL_LOG
* WRITE_CONTACTS
* WRITE_EXTERNAL_STORAGE

--Samples to call permission--
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
package org.tonimichel.sensorbridge;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class SensorBridge extends CordovaPlugin {
	
//	public static final String ACTION_CALL_ECHO = "echo";
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		//String message = args.getString(0);
		//String message = "this is a test";
		//this.echo( "this is a test", callbackContext );
		callbackContext.success();
		return true;
	}
	
/*	private void echo (String message, CallbackContext callbackContext) {
		callbackContext.success();
		
		if( message != null && message.length() > 0 ) {
			callbackContext.success( message );
		} else {
			callbackContext.error("Expected non-empty string argument.");
		}
	}
*/
}
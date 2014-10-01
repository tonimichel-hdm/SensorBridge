package org.tonimichel.sensorbridge;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;

public class SensorBridge extends CordovaPlugin {
	
	public static final String ACTION_CALL_ECHO = "echo";
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if(ACTION_CALL_ECHO.equals(action)) {
			String message = args.getString(0);
			String attachment = ": ... it really went full circle!";
			message += attachment;
			this.echo( message, callbackContext );
			return true;
		}
		return false;
	}
	
	private void echo (String message, CallbackContext callbackContext) {
		if( message != null && message.length() > 0 ) {
			callbackContext.success( message );
			return true;
		} else {
			callbackContext.error("Expected non-empty string argument.");
			return false;
		}
	}
	
}
package com.example.android.lifecycle.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class ActivityFinisher {

	private static Activity activity;
	private static String activityName;
	
	// Constructor
	// Parameters: a, an Activity, and name, a String
	public ActivityFinisher(Activity a, String name) {
		activity = a;
		activityName = name;
	}
	
	// Finish an Activity
	public static void finish() {
		// 1. Instantiate an AlertDialog.Builder with its constructor
	    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
	
	    // 2. Chain together various setter methods to set the dialog characteristics
	    builder.setMessage("Are you sure you want to finish " + activityName)
	           .setTitle("Finish " + activityName);
	
	    // Add the buttons
	    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int id) {
                   activity.finish();
               }
           });
	    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	        	   return;
	           }
	       });

	    
	    // 3. Get the AlertDialog from create()
	    AlertDialog dialog = builder.create();
		dialog.show();
		
	}


}
package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(this, "l0qDFxxVVxIZemBuNsvHGEmuVWhGBre47DDVBERW", "HbErHDh54o3KuzOsoQYDlBYyIfBfW7jfWC4KN4E1");
    ParseInstallation.getCurrentInstallation().saveInBackground();


    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}

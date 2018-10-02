package com.parseserverstarter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by ANISH on 02-10-2018.
 */
public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Create an instance first
        // Add your initialization code here
        // Replace serverURL/parse with serverURL/apps to access the parse dashboard
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("")      //enter the appID
                .clientKey("")          //enter the client/master key
                .server("")             //enter the server URL. Terminate the URL with /
                .build()
        );

        // To access the above IDs
        // In the ssh'ed terminal
        // $ cd apps/parse/htdocs
        // $ vi server.js

        // To get credentials for parse dashboard
        // In aws.amazon.com
        // Go to Services > EC2 > Running Instances > Actions > Instance Settings > Get System Logs
        // Scroll through to get username and password

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}

package com.parseserverstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //To save data on parse server
//      ParseObject score = new ParseObject("Score");
//      score.put("username", "Anish");
//      score.put("score", 100);
//      score.saveInBackground(new SaveCallback() {
//        @Override
//        public void done(ParseException e) {
//
//          if(e==null) {
//              Log.i("Saving in background", "successful");
//          }
//          else {
//            Log.i("Saving in background", "Failed. Error "+e.toString() );
//          }
//        }
//      });


//To retrieve data entry from parse server by ID
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//    query.getInBackground("T4KHx37r8U", new GetCallback<ParseObject>() {
//      @Override
//      public void done(ParseObject object, ParseException e) {
//
//        if(e==null && object!=null){
//            Log.i("ObjectValue", object.getString("username"));
//            Log.i("ObjectValue",Integer.toString(object.getInt("score")));
//        }
//        else {
//            Log.i("Retrieval", "Falied");
//        }
//      }
//    });


//To update data entry on parse server by ID
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//    query.getInBackground("T4KHx37r8U", new GetCallback<ParseObject>() {
//      @Override
//      public void done(ParseObject object, ParseException e) {
//
//        if(e==null && object!=null){
//
//          object.put("score", 150);
//          object.saveInBackground();
//
//          Log.i("ObjectValue", object.getString("username"));
//          Log.i("ObjectValue",Integer.toString(object.getInt("score")));
//        }
//        else {
//          Log.i("Retrieval", "Falied");
//        }
//      }
//    });




// Practice Section
//    ParseObject tweet = new ParseObject("Tweet");
//    tweet.put("username", "Anish");
//    tweet.put("content", "This is my first tweet");
//
//    tweet.saveInBackground(new SaveCallback() {
//      @Override
//      public void done(ParseException e) {
//        if(e==null) {
//          Log.i("Tweet","successful");
//        }
//        else {
//          Log.i("Tweet", "failed");
//        }
//      }
//    });
//
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Tweet");
//    query.getInBackground("9DN8laMYQx", new GetCallback<ParseObject>() {
//      @Override
//      public void done(ParseObject object, ParseException e) {
//        if(e==null && object!=null) {
//          Log.i("Tweet","successful");
//          object.put("content", "I updated my tweet again");
//          object.saveInBackground();
//        }
//        else {
//          Log.i("Tweet", "failed");
//        }
//      }
//    });




// To scan all entries and retrieve a specific entry by username
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//    query.whereEqualTo("username","Roger");
//    query.setLimit(1);
//
//    query.findInBackground(new FindCallback<ParseObject>() {
//      @Override
//      public void done(List<ParseObject> objects, ParseException e) {
//        if(e==null) {
//          Log.i("Find in background", "Retrieved "+ objects.size() + " objects");
//          if(objects.size()>0) {
//            for(ParseObject object :  objects) {
//              Log.i("FindInbackgroundResult", object.getString("username") + " has score of " + Integer.toString(object.getInt("score")));
//            }
//          }
//        }
//      }
//    });


//To scan all entries and update specific entries by value inequality
//    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//    query.whereLessThanOrEqualTo("score", 100 );
//
//    query.findInBackground(new FindCallback<ParseObject>() {
//      @Override
//      public void done(List<ParseObject> objects, ParseException e) {
//        if(e==null) {
//          Log.i("Find in background", "Retrieved "+ objects.size() + " objects");
//          if(objects.size()>0) {
//            for(ParseObject object :  objects) {
//                object.put("score",object.getInt("score")+30);
//                object.saveInBackground();
//            }
//          }
//        }
//      }
//    });




//To register a user
//    ParseUser user = new ParseUser();
//    user.setUsername("anishsamant");
//    user.setPassword("myPass");
//
//    user.signUpInBackground(new SignUpCallback() {
//      @Override
//      public void done(ParseException e) {
//        if(e==null) {
//          Log.i("Signup","successful");
//        }
//        else {
//          Log.i("Signup","failed");
//        }
//      }
//    });


//To log in a user
//    ParseUser.logInInBackground("anishsamant", "myPass", new LogInCallback() {
//      @Override
//      public void done(ParseUser user, ParseException e) {
//        if(user!=null) {
//          Log.i("Log in ", "successful");
//        }
//        else {
//          Log.i("Log in ", "failed " + e.toString());
//        }
//      }
//    });


//To logout user
        //ParseUser.logOut();


//To check is user is already logged In
//        if(ParseUser.getCurrentUser().getUsername()!=null) {
//            Log.i("currentUser ", "User Logged In: " + ParseUser.getCurrentUser().getUsername());
//        }
//        else {
//            Log.i("CurrentUser ", "User not logged In");
//        }





        ParseAnalytics.trackAppOpenedInBackground(getIntent());

    }
}

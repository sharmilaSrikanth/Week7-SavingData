package com.example.shrisharmi.savingdata;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shrisharmi on 1/3/2016.
 */
public class SecondActivity extends Activity {
    public static final String PREFS="sharedPrefs";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textv = (TextView)findViewById(R.id.textView3);
        SharedPreferences example = getSharedPreferences(PREFS, 0);
        String userString = example.getString("sendMessage", "No Message");
        textv.setText(userString);
    }
}

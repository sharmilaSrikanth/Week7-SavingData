package com.example.shrisharmi.savingdata;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    public static final String PREFS="sharedPrefs";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText)findViewById(R.id.editText);
        Button nextAct = (Button)findViewById(R.id.button);
        nextAct.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v) {
                String  message;
                message = et.getText().toString();
                SharedPreferences Prefs = getSharedPreferences(PREFS, 0);
                SharedPreferences.Editor editor = Prefs.edit();
                editor.putString("sendMessage", message);
                editor.commit();
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}

package com.yamenrbdgmail.buttonclick;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button my_btn1;
    private TextView my_text1;
    int sum=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        my_btn1 = (Button) findViewById(R.id.btn1);
        my_text1 = (TextView) findViewById(R.id.my_text1);
        final Toast m =Toast.makeText(this , "hello",Toast.LENGTH_LONG);
        View.OnClickListener my_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_text1.setText("the button have been cliked for "+sum+" times");
                sum=sum+1;
                m.show();

            }
        };


        my_btn1.setOnClickListener(my_listener);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast mess = Toast.makeText(this,"hello world"+sum ,Toast.LENGTH_LONG);
            sum=sum+1;
            mess.show();


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

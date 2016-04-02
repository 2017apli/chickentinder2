package net.chickentinder.chickentinder2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.util.Log;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button chickenButton, settingButton, dnutsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i("MainActivity", "ON CREATE METHOD .");
        this.initializeWidgets();
        this.setButtonListeners();
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initializeWidgets() {
        Log.i("MainActivity", "WIDGETS ARE INITIALIZED.");
        this.chickenButton = (Button) this.findViewById(R.id.button);
        this.dnutsButton = (Button) this.findViewById(R.id.button2);
        this.settingButton = (Button) this.findViewById(R.id.button3);
    }


    private void setButtonListeners() {

        this.chickenButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChickenMapsActivity.class);
                Log.i("MainActivity", "Chicken button is pressed.");
                MainActivity.this.startActivity(intent);
                Log.i("MainActivity", "chickenButton Listener works, moving to ChickenMapActivity");
            }
        });
        Log.i("MainActivity", "chicken button listener set");

        this.dnutsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChickenMapsActivity.class);
                Log.i("MainActivity", "Chicken button is pressed.");
                MainActivity.this.startActivity(intent);
                Log.i("MainActivity", "chickenButton Listener works, moving to ChickenMapActivity");


            }
        });

        this.settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChickenMapsActivity.class);
                Log.i("MainActivity", "Chicken button is pressed.");
                MainActivity.this.startActivity(intent);
                Log.i("MainActivity", "chickenButton Listener works, moving to ChickenMapActivity");
            }
        });


    }
}

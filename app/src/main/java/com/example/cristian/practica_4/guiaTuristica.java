package com.example.cristian.practica_4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class guiaTuristica extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urrao_main_menu);
    }

    public void onHclicked(View view){
        Intent l = new Intent (this, Activity_hotels.class);
        startActivity(l);
    }

    public void onBclicked(View view){
        Intent n = new Intent (this, Activity_bar.class);
        startActivity(n);
    }

    public void onSclicked(View view){
        Intent o = new Intent (this, Activity_tourism.class);
        startActivity(o);
    }

    public void onIclicked(View view){
        Intent p = new Intent (this, Activity_info.class);
        startActivity(p);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guia_turistica, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hotel_menu) {
            Intent l = new Intent (this, Activity_hotels.class);
            startActivity(l);
            return true;
        }

        if (id == R.id.bars_menu) {
            Intent n = new Intent (this, Activity_bar.class);
            startActivity(n);
            return true;
        }

        if (id == R.id.tourism_menu) {
            Intent o = new Intent (this, Activity_tourism.class);
            startActivity(o);
            return true;
        }

        if (id == R.id.info_menu) {
            Intent p = new Intent (this, Activity_info.class);
            startActivity(p);
            return true;
        }

        if (id == R.id.about) {
            Intent m = new Intent (this, Activity_About.class);
            startActivity(m);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

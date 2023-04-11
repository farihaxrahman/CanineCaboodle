package edu.stevens.cs545.caninecaboodle;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class Menu extends AppCompatActivity implements android.view.Menu {
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.breed_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.breed1:
                // Launch an activity or perform some other action for breed 1
                return true;
            case R.id.breed2:
                // Launch an activity or perform some other action for breed 2
                return true;
            case R.id.breed3:
                // Launch an activity or perform some other action for breed 3
                return true;
            case R.id.breed4:
                // Launch an activity or perform some other action for breed 4
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

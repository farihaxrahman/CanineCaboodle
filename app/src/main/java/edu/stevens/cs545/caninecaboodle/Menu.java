package edu.stevens.cs545.caninecaboodle;

import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    @Override
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


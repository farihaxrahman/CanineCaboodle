package edu.stevens.cs545.caninecaboodle;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import edu.stevens.cs545.caninecaboodle.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public HashMap<String, Object> dog1 = new HashMap<String, Object>();
    public int currentDog = 0;

    //HashMap<String, Object> dog2 = new HashMap<String, Object>();
    //HashMap<String, Object> dog3 = new HashMap<String, Object>();
    //HashMap<String, Object> dog4 = new HashMap<String, Object>();


    public void setDog1(Boolean unlocked) {
        dog1.put("unlocked", unlocked);
    }

    public void setDog1(int newScore) {
        dog1.put("score", newScore);
    }

    public void setCurrentDog(int dogId) {
       currentDog = dogId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog1.put("unlocked", false);
        dog1.put("score", 0);
    }


}


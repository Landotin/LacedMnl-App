package com.example.lacedmnlapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);  // Your main layout

        // Initialize BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Set a listener for menu item clicks
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();

                // Handle item selection
                if (id == R.id.home_nav) {
                    // Navigate to Home Activity
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (id == R.id.discover_nav) {
                    // Navigate to Discover Activity
                    Intent intent = new Intent(MainActivity.this, DiscoverActivity.class);
                    startActivity(intent);
                    return true;
                } else if (id == R.id.cart) {
                    // Navigate to Cart Activity
                    Intent intent = new Intent(MainActivity.this, CartActivity.class);
                    startActivity(intent);
                    return true;
                } else if (id == R.id.user_nav) {
                    // Navigate to User Profile Activity
                    Intent intent = new Intent(MainActivity.this, UserProfileActivity.class);
                    startActivity(intent);
                    return true;
                }

                return false;
            }
        });
    }
}

package com.example.class_276_bottom_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    Button buttonSet, buttonClear;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        buttonSet = findViewById(R.id.buttonSet);
        buttonClear = findViewById(R.id.buttonClear);

        buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomNavigationView.getOrCreateBadge(R.id.home).setNumber(10);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomNavigationView.getOrCreateBadge(R.id.home).clearNumber();
            }
        });

        bottomNavigationView.getOrCreateBadge(R.id.notification).setNumber(25);
//        bottomNavigationView.getOrCreateBadge(R.id.notification).clearNumber();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.home) {
                    Toast.makeText(getApplicationContext(), "This is home", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId() == R.id.notification) {
                    Toast.makeText(getApplicationContext(), "This is Notification bar", Toast.LENGTH_SHORT).show();
                }


                else if (item.getItemId() == R.id.search) {
                    Toast.makeText(getApplicationContext(), "This is Search bar", Toast.LENGTH_SHORT).show();
                }


                return true;
            }
        });
    }
}
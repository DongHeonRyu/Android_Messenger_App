package com.mycompany.messengerproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemReselectedListener(navigationItemReselectedListener);


    }

    private BottomNavigationView.OnNavigationItemReselectedListener navigationItemReselectedListener =
            new BottomNavigationView.OnNavigationItemReselectedListener() {
                @Override
                public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {

                        case R.id.navigation_home:
                            Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(mainIntent);
                            break;
                        case R.id.navigation_Settings:
                            Intent settingsIntent = new Intent(MainActivity.this, SettingActivity.class);
                            startActivity(settingsIntent);
                            break;
                        case R.id.navigation_Notification:
                            Intent notificationIntent = new Intent(MainActivity.this, NotificationActivity.class);
                            startActivity(notificationIntent);
                            break;
                        case R.id.navigation_logout:
                            Intent logoutIntent = new Intent(MainActivity.this, RegistrationActivity.class);
                            startActivity(logoutIntent);
                            finish();
                            break;


                    }


                }
            };
}
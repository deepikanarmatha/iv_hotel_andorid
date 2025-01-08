package com.example.iv_hotel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private Fragment activeFragment;


    private final Fragment hotelListFragment = new HotelListFragment();
    private final Fragment carBookingFragment = new CarBookingFragment();
    private final Fragment carWashingFragment = new CarWashingFragment();
    private final Fragment profileFragment = new ProfileFragment();
    private final Fragment settingsFragment = new SettingsFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fragmentManager = getSupportFragmentManager();


        fragmentManager.beginTransaction().add(R.id.frameLayout, settingsFragment, "5").hide(settingsFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, profileFragment, "4").hide(profileFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, carWashingFragment, "3").hide(carWashingFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, carBookingFragment, "2").hide(carBookingFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, hotelListFragment, "1").commit();


        activeFragment = hotelListFragment;

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.nav_rooms) {
                    switchFragment(hotelListFragment);
                    return true;
                } else if (itemId == R.id.nav_car_booking) {
                    switchFragment(carBookingFragment);
                    return true;
                } else if (itemId == R.id.nav_car_washing) {
                    switchFragment(carWashingFragment);
                    return true;
                } else if (itemId == R.id.nav_profile) {
                    switchFragment(profileFragment);
                    return true;
                } else if (itemId == R.id.nav_settings) {
                    switchFragment(settingsFragment);
                    return true;
                } else {
                    return false;
                }
            }
        });

    }

    private void switchFragment(Fragment fragment) {
        if (activeFragment != fragment) {
            fragmentManager.beginTransaction()
                    .hide(activeFragment)
                    .show(fragment)
                    .commit();
            activeFragment = fragment;
        }
    }


}
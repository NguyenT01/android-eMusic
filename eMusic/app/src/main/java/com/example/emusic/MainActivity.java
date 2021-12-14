package com.example.emusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startInit();

    }

    public void startInit()
    {
        // HAM KHOI TAO TAT CA
        bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnNavigationItemSelectedListener(this);
        bottomNav.setSelectedItemId(R.id.home);

        // CODE HERE

    }

    FragmentHome fHome = new FragmentHome();
    FragmentSearch fSearch = new FragmentSearch();
    FragmentMyAccount fMyAccount = new FragmentMyAccount();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,fHome).commit();
                return true;
            case R.id.search:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,fSearch).commit();
                return true;
            case R.id.my_account:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,fMyAccount).commit();
                return true;
        }


        return false;
    }
}
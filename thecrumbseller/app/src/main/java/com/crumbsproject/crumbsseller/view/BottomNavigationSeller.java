package com.crumbsproject.crumbsseller.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.crumbsproject.crumbsseller.R;
import com.crumbsproject.crumbsseller.view.fragment.SellerHistory;
import com.crumbsproject.crumbsseller.view.fragment.SellerLandingPage;
import com.crumbsproject.crumbsseller.view.fragment.SellerProfile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomNavigationSeller extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_seller);




        getFragmentPage(new SellerLandingPage());




        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                //Menantukan halaman Fragment yang akan tampil
                switch (item.getItemId()){
                    case R.id.items_btm_nav:
                        fragment = new SellerLandingPage();
                        break;

                    case R.id.items_sold_btm_nav:
                        fragment = new SellerHistory();
                        break;

                    case R.id.profile_btm_nav:
                        fragment = new SellerProfile();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

    }


    //Menampilkan halaman Fragment
    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
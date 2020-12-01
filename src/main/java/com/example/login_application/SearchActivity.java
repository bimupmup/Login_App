package com.example.login_application;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.google.android.material.navigation.NavigationView;

public class SearchActivity extends MainActivity2 {

    public Menu menuList;
    public MenuItem item1, item2, itemMain;
    private DrawerLayout drawer;
    TextView user_name,pass_word;
    Button info,list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toast.makeText(SearchActivity.this,"cmmmmm", Toast.LENGTH_SHORT).show();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        user_name = headerView.findViewById(R.id.nav_user);
        pass_word = headerView.findViewById(R.id.nav_pass);
        info = headerView.findViewById(R.id.btn_info);
        Toolbar toolbar = findViewById(R.id.toolbar);
        list = (Button) toolbar.getChildAt(0);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        user_name.setText(userName);
        pass_word.setText(pass);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        info.setOnClickListener(v->{
            Intent intent = new Intent(this,InfoActivity.class);
            startActivity(intent);
        });

        list.setOnClickListener(v->{
            Intent i = new Intent(this,FilterCityActivity.class);
            startActivity(i);
        });
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START))
            {

                drawer.closeDrawer(GravityCompat.START);

            }
        else
            {
                super.onBackPressed();
            }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_racket:
                navRacket();
                return true;
            case R.id.nav_training:
                navTraining();
                return true;
            case R.id.nav_athlete:
                navAthlete();
                return true;
            case R.id.nav_comment:
                navComment();
                return true;
            case R.id.nav_setting:
                navSetting();
                return true;
            case R.id.nav_rating:
                navRating();
                return true;
            case R.id.nav_info:
                navInfo();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void navRacket()
    {

    }
    private void navSetting()
    {

    }

    private void navComment() {
    }

    private void navAthlete() {
    }

    private void navRating() {
    }

    private void navTraining() {
    }

    private void navInfo() {
    }

    

}

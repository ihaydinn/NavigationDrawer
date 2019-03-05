package com.ismailhakkiaydin.navigationdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();

        setUpDrawer();


    }

    private void setUpToolbar(){

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("NavDrawer Örnek");
        toolbar.setSubtitle("Örnek uygulama");


    }

    private void setUpDrawer(){

        NavigationDrawerFragment navFragment= (NavigationDrawerFragment) getFragmentManager().findFragmentById(R.id.fragment);
        DrawerLayout drawerLayout= (DrawerLayout) findViewById(R.id.drawerLayout);

        navFragment.setUpNavigationDrawer(drawerLayout, toolbar);



    }

}

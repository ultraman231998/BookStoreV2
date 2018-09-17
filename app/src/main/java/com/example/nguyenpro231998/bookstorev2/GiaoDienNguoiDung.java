package com.example.nguyenpro231998.bookstorev2;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class GiaoDienNguoiDung extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien_nguoi_dung);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        action = new ActionBarDrawerToggle(GiaoDienNguoiDung.this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(action);
        action.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(action.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    }


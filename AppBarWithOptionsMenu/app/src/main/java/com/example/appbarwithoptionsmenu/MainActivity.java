package com.example.appbarwithoptionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Res --> to access into java file then we should use R.java
        //Res --> to access into xml file then we should use (@-symbol)
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.profile:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.contact:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.name:
                Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }

}
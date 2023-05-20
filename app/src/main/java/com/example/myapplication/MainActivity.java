package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1(View view){
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
    public void button2(View view){
        Intent i = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void  abrirNav(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onu.com"));
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.action_mensaje:
                Toast.makeText(this, "mensaje", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_profile:
                Toast.makeText(this, "perfil", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_salir:
                Toast.makeText(this, "salir", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
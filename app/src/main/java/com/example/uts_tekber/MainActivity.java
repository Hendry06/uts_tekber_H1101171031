package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Aktivitas(View view) {
        Intent intent = new  Intent(MainActivity.this,Aktivitas.class);
        startActivity(intent);
    }

    public void Penerima(View view) {
        Intent intent = new Intent(MainActivity.this,Penerima.class);
        startActivity(intent);
    }

    public void Penyedia(View view) {
        Intent intent = new Intent(MainActivity.this,Penyedia.class);
        startActivity(intent);
    }


    public void Layanan(View view) {
        Intent intent = new Intent(MainActivity.this,Layanan.class);
        startActivity(intent);
    }


    public void Aplikasi(View view) {
        Intent intent = new Intent(MainActivity.this, Aplikasi.class);
        startActivity(intent);
    }
}

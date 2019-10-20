package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Layanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);
    }

    public void Syntax(View view) {
        Intent intent = new Intent(Layanan.this, SyntaxLayanan.class);
        startActivity(intent);
    }

    public void LinkLayanan(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(link);
    }
}

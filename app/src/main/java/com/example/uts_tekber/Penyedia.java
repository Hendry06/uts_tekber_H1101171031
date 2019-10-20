package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Penyedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyedia);
    }

    public void Syntax(View view) {
        Intent intent = new Intent(Penyedia.this, SyntaxPenyedia.class);
        startActivity(intent);
    }

    public void LinkPenyedia(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(link);
    }


}

package com.example.user.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book extends AppCompatActivity {
    PDFView b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        b1=(PDFView)findViewById(R.id.bk1);
        b1.fromAsset("vedic.pdf").load();
    }
}

package com.example.kuliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Pembahasan extends AppCompatActivity {

    ImageView imagePembahasan;
    TextView namePembahasan, deskripsiPembahasan, tipePembahasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembahasan);

        imagePembahasan = findViewById(R.id.imagePembahasan);
        namePembahasan = findViewById(R.id.namePembahasan);
        deskripsiPembahasan = findViewById(R.id.deskripsiPembahasan);
        tipePembahasan = findViewById(R.id.tipePembahasan);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String tipe = intent.getStringExtra("tipe");
        String imageUrl = intent.getStringExtra("image");
        String deskripsi = intent.getStringExtra("deskripsi");

        namePembahasan.setText(name);
        tipePembahasan.setText(tipe);
        deskripsiPembahasan.setText(deskripsi);
        Glide.with(this).load(imageUrl).into(imagePembahasan);
    }
}
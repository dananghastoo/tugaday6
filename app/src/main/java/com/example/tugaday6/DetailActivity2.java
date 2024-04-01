package com.example.tugaday6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        String namanegara = getIntent().getStringExtra("nama_negara");
        int logoBendera = getIntent().getIntExtra("logo_bendera", R.drawable.ic_launcher_background);
        String desc = getIntent().getStringExtra("desc_negara");

        TextView namaTextView = findViewById(R.id.judul);
        ImageView gambarImageView = findViewById(R.id.image1);
        TextView desTextView = findViewById(R.id.descripsi);
        Button shareButton = findViewById(R.id.share);

        namaTextView.setText(namanegara);
        gambarImageView.setImageResource(logoBendera);
        desTextView.setText(desc);


            shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = "";
                String shareSub = "Your Subject here";
                intent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(intent, "share using"));
            }
        });

    }
}
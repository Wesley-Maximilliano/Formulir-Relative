package com.if3a1.formulirrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNpm, tvNama, tvJk, tvProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvNpm = findViewById(R.id.tv_npm);
        tvNama = findViewById(R.id.tv_nama);
        tvJk = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);

        // tangkap intent dari main activity
        Intent intent = getIntent();
        tvNpm.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvJk.setText(intent.getStringExtra("varJk"));
        tvProdi.setText(intent.getStringExtra("varProdi"));

    }
}
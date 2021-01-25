package com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.riteshcodejava.programminglanguage.R;

import java.util.Objects;

public class CProgramming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_programming);
        TextView cprogram = findViewById(R.id.cprogrammingTextView);
        cprogram.setText(R.string.cprogramming);
        Objects.requireNonNull(getSupportActionBar()).setTitle("CProgram");
    }
}
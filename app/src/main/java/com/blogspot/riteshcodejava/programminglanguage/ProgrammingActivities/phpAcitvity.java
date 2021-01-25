package com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.riteshcodejava.programminglanguage.R;

import java.util.Objects;

public class phpAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_acitvity);

        TextView php  = findViewById(R.id.phpTextViewTextView);
        php.setText(R.string.phpString);

        Objects.requireNonNull(getSupportActionBar()).setTitle("PHP");
    }
}
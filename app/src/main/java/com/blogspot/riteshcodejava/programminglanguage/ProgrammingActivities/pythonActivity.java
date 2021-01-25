package com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.riteshcodejava.programminglanguage.R;

import java.util.Objects;

public class pythonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        TextView php  = findViewById(R.id.pythonTextView);
        php.setText(R.string.pythonString);

        Objects.requireNonNull(getSupportActionBar()).setTitle("PYTHON");
    }
}
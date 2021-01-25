package com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.riteshcodejava.programminglanguage.R;

import java.util.Objects;

public class cplusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus);

        TextView cplus = findViewById(R.id.cplusTextView);
        cplus.setText(R.string.cplus);

        Objects.requireNonNull(getSupportActionBar()).setTitle("C++");
    }
}
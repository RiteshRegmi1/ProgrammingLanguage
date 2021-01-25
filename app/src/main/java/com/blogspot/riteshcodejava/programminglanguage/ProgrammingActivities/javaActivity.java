package com.blogspot.riteshcodejava.programminglanguage.ProgrammingActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.riteshcodejava.programminglanguage.R;

import org.w3c.dom.Text;

import java.util.Objects;

public class javaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        TextView java = findViewById(R.id.javaTextView);
        java.setText(R.string.javaString);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Java");
    }
}
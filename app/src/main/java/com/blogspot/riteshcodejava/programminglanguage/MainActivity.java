package com.blogspot.riteshcodejava.programminglanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.blogspot.riteshcodejava.programminglanguage.Adapters.programmingAdapters;
import com.blogspot.riteshcodejava.programminglanguage.Models.programmingModels;
import com.blogspot.riteshcodejava.programminglanguage.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        ArrayList<programmingModels> list = new ArrayList<>();
        list.add(new programmingModels(R.drawable.cprogramming,"CProgramming"));
        list.add(new programmingModels(R.drawable.cplus,"C++"));
        list.add(new programmingModels(R.drawable.java,"java"));
        list.add(new programmingModels(R.drawable.php,"php"));
        list.add(new programmingModels(R.drawable.python,"python"));

        programmingAdapters adapters = new programmingAdapters(this,list);
        binding.recyclerView.setAdapter(adapters);
    }
}
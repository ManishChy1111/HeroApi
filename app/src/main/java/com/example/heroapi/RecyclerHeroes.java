package com.example.heroapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class RecyclerHeroes extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_heroes);
        recyclerView=findViewById(R.id.recyclerView);

    }
}

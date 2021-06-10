package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            RecyclerView recyclerView = findViewById(R.id.recycler_list);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            String [] data ={"Manager","Amazon","06/06/20","08/07/20"};
            recyclerView.setAdapter(new Adapter(data));

    }
}
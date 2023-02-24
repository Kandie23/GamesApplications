package com.example.gamesapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1- Data
    ArrayList<GameModel> gamesList;

    //2- AdapterVIew
    RecyclerView recyclerView;

    //3- Adapter

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        gamesList = new ArrayList<>();
        gamesList.add(new GameModel("Mortal Kombat", R.drawable.card1));
        gamesList.add(new GameModel("Grand Theft Auto", R.drawable.card2));
        gamesList.add(new GameModel("Dream League Soccer", R.drawable.card3));
        gamesList.add(new GameModel("Call of Duty", R.drawable.card4));
        gamesList.add(new GameModel("God of War", R.drawable.card5));
        gamesList.add(new GameModel("Need for Speed", R.drawable.card6));

        adapter = new MyAdapter(this, gamesList);

        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);




    }
}
package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Card> card = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_recyclerview);
        recyclerView.setHasFixedSize(true);

        card.addAll(CardData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardAdapter listHeroAdapter = new CardAdapter(card,this);
        recyclerView.setAdapter(listHeroAdapter);
    }

}

package com.bprats;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bprats.mascotitas.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<mascota> pets;
    private RecyclerView listaMascotas;

    public TextView textToolbar;
    public Typeface typo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String fuente1 = "fonts/Panters.ttf";
        this.typo1 = Typeface.createFromAsset(getAssets(), fuente1);

        textToolbar = (TextView) findViewById(R.id.tvTitle);
        textToolbar.setTypeface(typo1);


        listaMascotas = (RecyclerView) findViewById(R.id.rvListPets);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        startListPets();
        startAdapter();


    }

    public void irSegundaActividad(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    public AdaptadorMascotas adapter;
    public void startAdapter() {
        adapter = new AdaptadorMascotas(pets, this);
        listaMascotas.setAdapter(adapter);

    }

    public void startListPets() {

        pets = new ArrayList<mascota>();

        pets.add(new mascota(R.drawable.cat_0, "Ojitos", "4"));
        pets.add(new mascota(R.drawable.cat_1, "Rayitas", "2"));
        pets.add(new mascota(R.drawable.cat_2, "Mishifu", "1"));
        pets.add(new mascota(R.drawable.cat_3, "Negrito", "3"));
        pets.add(new mascota(R.drawable.cat_4, "Minina", "6"));
        pets.add(new mascota(R.drawable.cat_5, "Pulgosa", "9"));
        pets.add(new mascota(R.drawable.cat_6, "Pompita", "8"));

    }
}

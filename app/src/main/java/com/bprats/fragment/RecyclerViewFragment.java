package com.bprats.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bprats.adapter.AdaptadorMascotas;
import com.bprats.mascotitas.R;
import com.bprats.pojo.mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    ArrayList<mascota> pets;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvListPets);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        startListPets();
        startAdapter();

        return v;

    }

    public AdaptadorMascotas adapter;
    public void startAdapter() {
        adapter = new AdaptadorMascotas(pets, getActivity());
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


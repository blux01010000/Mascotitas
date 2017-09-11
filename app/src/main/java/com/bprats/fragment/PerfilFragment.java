package com.bprats.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bprats.adapter.AdaptadorProfile;
import com.bprats.mascotitas.R;
import com.bprats.pojo.mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class PerfilFragment extends Fragment {

    ArrayList<mascota> pictures;
    private RecyclerView listaPictures;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaPictures = (RecyclerView) v.findViewById(R.id.rvListPics);

        GridLayoutManager llg = new GridLayoutManager(getActivity(),3);
        llg.setOrientation(LinearLayoutManager.VERTICAL);

        listaPictures.setLayoutManager(llg);
        startListPictures();
        startAdapterProfile();

        return v;
}

    public AdaptadorProfile adapter;
    public void startAdapterProfile() {
        adapter = new AdaptadorProfile(pictures, getActivity());
        listaPictures.setAdapter(adapter);

    }

    public void startListPictures() {

        pictures = new ArrayList<mascota>();

        pictures.add(new mascota(R.drawable.cat_black, "Negrito", "3"));
        pictures.add(new mascota(R.drawable.cat_black_1, "Negrito", "10"));
        pictures.add(new mascota(R.drawable.cat_black_2, "Negrito", "8"));
        pictures.add(new mascota(R.drawable.cat_black_3, "Negrito", "15"));
        pictures.add(new mascota(R.drawable.cat_black_4, "Negrito", "6"));
        pictures.add(new mascota(R.drawable.cat_black_5, "Negrito", "9"));
        pictures.add(new mascota(R.drawable.cat_black_6, "Negrito", "22"));
        pictures.add(new mascota(R.drawable.cat_black_7, "Negrito", "17"));
        pictures.add(new mascota(R.drawable.cat_black_8, "Negrito", "4"));


        }

}

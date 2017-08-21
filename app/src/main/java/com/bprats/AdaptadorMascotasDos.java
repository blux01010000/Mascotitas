package com.bprats;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bprats.mascotitas.R;

import java.util.ArrayList;

/**
 * Created by bprats on 21/8/17.
 */

public class AdaptadorMascotasDos extends RecyclerView.Adapter<AdaptadorMascotasDos.MascotasViewHolder> {

    ArrayList<mascota> pets;
    Activity actividad;

    public AdaptadorMascotasDos(ArrayList<mascota> pets, Activity actividad) {
        this.pets = pets;
        this.actividad = actividad;
    }

    @Override
    public AdaptadorMascotasDos.MascotasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas_ultimos, parent, false);

        return new AdaptadorMascotasDos.MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdaptadorMascotasDos.MascotasViewHolder mascotaVH, int position) {
        final mascota pet = pets.get(position);
        mascotaVH.imgFoto.setImageResource(pet.getImage());
        mascotaVH.tvNamePet.setText(pet.getName());
        mascotaVH.tvTotalLikes.setText(pet.getVotos());
        mascotaVH.btnHuesoLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(actividad, "Te gusta " + pet.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }


    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private ImageButton btnHuesoLike;
        private TextView tvNamePet;
        private TextView tvTotalLikes;
        private ImageView imgTotalLikes;

        public MascotasViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            btnHuesoLike = (ImageButton) itemView.findViewById(R.id.btnHuesoLike);
            tvNamePet = (TextView) itemView.findViewById(R.id.tvNamePet);
            tvTotalLikes = (TextView) itemView.findViewById(R.id.tvTotalLikes);
            imgTotalLikes = (ImageView) itemView.findViewById(R.id.imgTotalLikes);

        }

    }
}

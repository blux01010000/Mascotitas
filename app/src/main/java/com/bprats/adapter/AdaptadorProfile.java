package com.bprats.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bprats.mascotitas.R;
import com.bprats.pojo.mascota;

import java.util.ArrayList;

/**
 * Created by bprats on 10/9/17.
 */

public class AdaptadorProfile extends RecyclerView.Adapter<AdaptadorProfile.PicturesViewHolder> {

    ArrayList<mascota> pictures;
    Activity activity;

    public AdaptadorProfile (ArrayList<mascota> pictures, Activity activity) {
        this.pictures = pictures;
        this.activity = activity;
    }

    @Override
    public PicturesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_profile, parent, false);

        return new PicturesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PicturesViewHolder pictureVH, int position) {
        final mascota picture = pictures.get(position);
        pictureVH.imgvProfile.setImageResource(picture.getImage());
        pictureVH.tvTotalLikesProfile.setText(picture.getVotos());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public static class PicturesViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgvProfile;
        private TextView tvTotalLikesProfile;


        public PicturesViewHolder (View itemView) {
            super(itemView);

            imgvProfile = (ImageView) itemView.findViewById(R.id.imgvProfile);
            tvTotalLikesProfile = (TextView) itemView.findViewById(R.id.tvTotalLikesProfile);
        }


    }
}

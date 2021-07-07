package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CelibrityAdapter extends RecyclerView.Adapter<CelibrityHolder>{
    ArrayList<Celibrity> clib;
    public CelibrityAdapter(ArrayList<Celibrity> celibrities){
        clib=celibrities;

    }
    @NonNull

    @Override
    public CelibrityHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new CelibrityHolder(view);
    }

    @Override
    public void onBindViewHolder(CelibrityHolder holder, int position) {
        Celibrity celibrity=clib.get(position);
        holder.setData(celibrity);

    }

    @Override
    public int getItemCount() {
        return clib.size();
    }
}

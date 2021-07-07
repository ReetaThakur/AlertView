package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CelibrityHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView mtvCompany;
    private TextView mtvName;
    private TextView mtvAge;

    public CelibrityHolder(View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        imageView=itemView.findViewById(R.id.bill);
        mtvAge=itemView.findViewById(R.id.billage);
        mtvName=itemView.findViewById(R.id.billname);
        mtvCompany=itemView.findViewById(R.id.microsoft);
    }
    public void setData(Celibrity clib){
        mtvCompany.setText(clib.getCompany());
        imageView.setImageResource(clib.getImage());
        mtvName.setText(clib.getName());
        mtvAge.setText(clib.getAge()+"");

    }

}

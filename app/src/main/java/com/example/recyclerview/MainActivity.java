package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Celibrity> celibList=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recylerView);
        buildRecyclerViewData();
        setRecyclerViewAdaptor();
    }
    private void buildRecyclerViewData(){

        celibList.add(new Celibrity(R.drawable.bill,"Bill Gate",65,"Microsoft"));
        celibList.add(new Celibrity(R.drawable.jeff,"Jeff Bezos",54,"Amazon"));
        celibList.add(new Celibrity(R.drawable.prateek,"Prateek Shukla",31,"Masai School"));
        celibList.add(new Celibrity(R.drawable.bill,"Bill Gate",65,"Microsoft"));
        celibList.add(new Celibrity(R.drawable.jeff,"Jeff Bezos",54,"Amazon"));
        celibList.add(new Celibrity(R.drawable.prateek,"Prateek Shukla",31,"Masai School"));
        celibList.add(new Celibrity(R.drawable.bill,"Bill Gate",65,"Microsoft"));
        celibList.add(new Celibrity(R.drawable.jeff,"Jeff Bezos",54,"Amazon"));
        celibList.add(new Celibrity(R.drawable.prateek,"Prateek Shukla",31,"Masai School"));
        celibList.add(new Celibrity(R.drawable.bill,"Bill Gate",65,"Microsoft"));

    }
    private void setRecyclerViewAdaptor(){
        CelibrityAdapter clibAdapter=new CelibrityAdapter(celibList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(clibAdapter);
    }
}
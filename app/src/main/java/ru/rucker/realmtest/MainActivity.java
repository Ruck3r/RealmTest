package ru.rucker.realmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Adapter listadapter;
    RecyclerView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setuplist();
    }

    public void setuplist() {
        listview = findViewById(R.id.List);
        listadapter = new Adapter();
        listadapter.setContext(this);
        ArrayList<Item> itemlist = new ArrayList<>();
        itemlist.add(new Item("список"));
        listadapter.setList(itemlist);
        listview.setLayoutManager(new LinearLayoutManager(this));
        listview.setAdapter(listadapter);
    }
}

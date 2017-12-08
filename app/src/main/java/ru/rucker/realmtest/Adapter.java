package ru.rucker.realmtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rucker on 08.12.2017.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    ArrayList<Item> list;
    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View item = LayoutInflater.from(context).inflate(R.layout.itemlist,parent,false); // R.layout.itemlist переводим в java класс, т.к. не можем работать напрямую с разметкой.
     return new ItemView(item); // создаем из java класса^ "наследника" который работает с полями, определенными в разметке.

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemView itemviewholder = (ItemView) holder;
        Item item = list.get(position);
        itemviewholder.setText(item.name);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void setList(ArrayList<Item> list){
        this.list = list;

    }
    public class ItemView extends RecyclerView.ViewHolder{

        public TextView textView;

        public ItemView(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);

        }
        public void setText(String name){
            textView.setText(name);
        }
    }
}

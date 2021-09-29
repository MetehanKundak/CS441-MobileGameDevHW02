package com.example.cs441_mobilegamedevhw02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyleViewAdapter extends RecyclerView.Adapter<RecyleViewAdapter.MyViewHolder> {
    List<items>itemsList;
    Context context;

    public RecyleViewAdapter(List<items> itemsList, Context context) {
        this.itemsList = itemsList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_itemName.setText(itemsList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_itemName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_itemName = itemView.findViewById(R.id.tv_itemName);
        }
    }

}

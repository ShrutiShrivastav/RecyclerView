package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder> {

    //our constructor
    private  String[] data;
    public Adapter(String[] data)
 {
     this.data = data;
 }

    @NonNull

    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.recycler_items, parent,false);
        return  new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.RecyclerViewHolder holder, int position) {
        String title=data[position];

        holder.et_title.setText(title);
        holder.et_compName.setText(title);
        holder.et_dateFrom.setText(title);
        holder.et_dateTo.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    // our viewHolder class
    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        EditText et_title,et_compName,et_dateFrom,et_dateTo;
        public RecyclerViewHolder(@NonNull  View itemView) {
            super(itemView);

            et_title = itemView.findViewById(R.id.et_title);
            et_compName=itemView.findViewById(R.id.et_compName);
            et_dateFrom=itemView.findViewById(R.id.et_dateFrom);
            et_dateTo=itemView.findViewById(R.id.et_dateTo);
        }
    }

}

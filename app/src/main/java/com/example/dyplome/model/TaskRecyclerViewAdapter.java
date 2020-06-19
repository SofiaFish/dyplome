package com.example.dyplome.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;

import java.util.ArrayList;

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter<TaskRecyclerViewAdapter.MyViewHolder> {

    private ArrayList<TaskRecyclerItem> mData;

    public TaskRecyclerViewAdapter(ArrayList<TaskRecyclerItem> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public TaskRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_rw_item, parent, false);
        return new TaskRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String task = mData.get(position).getTask();
        holder.myTextView.setText(task);

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myTextView;
        CheckBox isPassed;

        MyViewHolder(final View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.task1);
            isPassed = itemView.findViewById(R.id.cb_completed);
        }
    }
}
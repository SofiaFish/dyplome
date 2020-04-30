package com.example.dyplome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.model.TestRecyclerItem;

import java.util.ArrayList;

public class TestRecycleViewAdapter extends RecyclerView.Adapter<TestRecycleViewAdapter.MyViewHolder> {

    private ArrayList<TestRecyclerItem> mData;
//    private ItemClickListener mClickListener;

    public TestRecycleViewAdapter(ArrayList<TestRecyclerItem> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rw_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String tests = mData.get(position).getName();
//        boolean isPassed = mData.get(position).isPassed();
        boolean isPassed = mData.get(position).isPassed() == 1;
        holder.myTextView.setText(tests);
        holder.isPassed.setChecked(isPassed);

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
            myTextView = itemView.findViewById(R.id.test1);
            isPassed = itemView.findViewById(R.id.cb_completed);
        }
    }
}




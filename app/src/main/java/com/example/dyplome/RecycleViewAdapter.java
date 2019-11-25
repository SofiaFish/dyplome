package com.example.dyplome;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private ArrayList<String> mData;
//    private ItemClickListener mClickListener;

    public RecycleViewAdapter(ArrayList<String> mData) {
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
        String tests = mData.get(position);
        holder.myTextView.setText(tests);

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myTextView;

        MyViewHolder(final View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.test1);
        }

//        @Override
//        public void onClick(View v) {
//            if(mClickListener != null)
//                mClickListener.onItemClick(v, getAdapterPosition());
//        }
    }

    String getItem(int id){
        return mData.get(id);
    }

//    void setClickListener(ItemClickListener itemClickListener) {
//        this.mClickListener = itemClickListener;
//    }
//
//
//    public interface ItemClickListener {
//        void onItemClick(View view, int position);
//    }

}




package com.example.asus.ohjooyeo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {

    Context mContext;
    List<WorshipData> mData;

    public RecyclerViewAdapter(Context mComtext, List<WorshipData> mData) {
        this.mContext = mComtext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.post_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text1.setText(mData.get(position).getTitle());
        holder.text2.setText(mData.get(position).getText22());
        holder.text3.setText(mData.get(position).getText33());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class  MyViewHolder extends RecyclerView.ViewHolder {

        private TextView text1;
        private TextView text2;
        private TextView text3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text1 = (TextView)  itemView.findViewById(R.id.text1);
            text2 = (TextView)  itemView.findViewById(R.id.text2);
            text3 = (TextView)  itemView.findViewById(R.id.text3);

        }
    }
}

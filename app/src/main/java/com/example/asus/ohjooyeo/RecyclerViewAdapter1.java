package com.example.asus.ohjooyeo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/// TableView Delegate
public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.MyviewHolder> {

    Context mContext;
    List<Recyclerview2> mData;

    public RecyclerViewAdapter1(Context mContext, List<Recyclerview2> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.post_item1,parent,false);
        MyviewHolder vHolder = new MyviewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holer, int position) {

            holer.name_1.setText(mData.get(position).getText1());
            holer.image1.setImageResource(mData.get(position).getImage1());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    /// TableViewCell = ViewHolder
    public static class MyviewHolder extends  RecyclerView.ViewHolder{
            private TextView name_1;
            private  ImageView image1;


        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            name_1 = (TextView) itemView .findViewById(R.id.name_1);
            image1 = (ImageView) itemView.findViewById(R.id.image1);
        }
    }
}

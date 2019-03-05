package com.ismailhakkiaydin.navigationdrawer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    LayoutInflater inflater;
    ArrayList<NavigationDrawerItem> mDataList;


    CustomAdapter(Context c, ArrayList<NavigationDrawerItem> data){

        this.context=c;
        this.inflater=LayoutInflater.from(context);
        mDataList=data;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v=inflater.inflate(R.layout.tek_satir, parent, false);
        MyViewHolder holder=new MyViewHolder(v);

        return holder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        NavigationDrawerItem tiklanilan=mDataList.get(position);
        holder.setData(tiklanilan, position);

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView baslik;
        ImageView resim;

        public MyViewHolder(View itemView) {
            super(itemView);
            baslik= (TextView) itemView.findViewById(R.id.title);
            resim= (ImageView) itemView.findViewById(R.id.imgIcon);


        }

        public void setData(NavigationDrawerItem tiklanilan, int position) {
            this.baslik.setText(tiklanilan.getBaslik());
            this.resim.setImageResource(tiklanilan.getResimID());

        }
    }
}
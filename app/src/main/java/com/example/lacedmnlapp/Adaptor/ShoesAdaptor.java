package com.example.lacedmnlapp.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lacedmnlapp.R;
import com.example.lacedmnlapp.ShoesDomain;

import java.util.ArrayList;
import java.util.Locale;

public class ShoesAdaptor extends RecyclerView.Adapter<ShoesAdaptor.ViewHolder> {
    ArrayList<ShoesDomain> ShoesDomains;

    public ShoesAdaptor(ArrayList<ShoesDomain> shoesDomains) {
        this.ShoesDomains = shoesDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent,false));
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ShoesName.setText(ShoesDomains.get(position).getTitle());
        String picUrl = "";
        switch (position){
            case 0: {
                picUrl = "shoes_1";
                holder
            }
        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ShoesName;
        TextView ShoePrice;
        ImageView ShoesPic;
        ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ShoesName=itemView.findViewById(R.id.shoename);
            ShoePrice=itemView.findViewById(R.id.shoeprice);
            ShoesPic=itemView.findViewById(R.id.shoepic);
            mainLayout=itemView.findViewById(R.id.mainlayout);


        }
    }
}

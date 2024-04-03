package com.example.kuliner;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView nameView;
    ImageView imageView;
    private Context context;
    private Items_rv currentItem;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        nameView = itemView.findViewById(R.id.tvName);
        imageView = itemView.findViewById(R.id.imageView);
        context = itemView.getContext();
        itemView.setOnClickListener(this);
    }

    public void bind(Items_rv item){
        currentItem = item;
        nameView.setText(item.getName());
        Glide.with(itemView.getContext())
                .load(item.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(imageView);
    }


    @Override
    public void onClick(View v) {
                Intent intent1 = new Intent(context, Pembahasan.class);

                intent1.putExtra("name", currentItem.getName());
                intent1.putExtra("tipe", currentItem.getTipe());
                intent1.putExtra("image", currentItem.getImage());
                intent1.putExtra("deskripsi", currentItem.getDeskripsi());

                context.startActivity(intent1);
    }
}

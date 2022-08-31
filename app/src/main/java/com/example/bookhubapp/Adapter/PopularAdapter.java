package com.example.bookhubapp.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bookhubapp.Activity.ShowDetailActivity;
import com.example.bookhubapp.Domain.BookDomain;
import com.example.bookhubapp.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<BookDomain> popularBook;

    public PopularAdapter(ArrayList<BookDomain> bookDomains){
        this.popularBook = bookDomains;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder,int position) {
        holder.title.setText(popularBook.get(position).getTitle());
        holder.fee.setText(String.valueOf(popularBook.get(position).getFee().intValue()/1000) + ",000");

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(popularBook.get(position).getPic(), "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);

        holder.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), ShowDetailActivity.class);
                intent.putExtra("object",popularBook.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return popularBook.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, fee;
        ImageView pic;
        TextView addBtn;
        //ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            fee = itemView.findViewById(R.id.fee);
            pic = itemView.findViewById(R.id.pic);
            addBtn = itemView.findViewById(R.id.addBtn);
            //mainLayout = itemView.findViewById(R.id.popularLayout);
        }
    }
}









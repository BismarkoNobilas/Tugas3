package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private ArrayList<Card> cards;
    private Context context;


    public CardAdapter(ArrayList<Card> cards, Context context) {
        this.cards = cards;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_desc, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Card card = cards.get(position);
        Glide.with(holder.itemView.getContext())
                .load(card.getsPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.ivPhoto);
        holder.tvName.setText(card.getsName());
        holder.tvDetail.setText(card.getsDetail());

        holder.cvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", card.getsName());
                intent.putExtra("detail", card.getsDetail());
                intent.putExtra("photo", card.getsPhoto());
                context.startActivity(intent);
            }
        });

        holder.ivLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(card.getsLink()));
                    context.startActivity(intent);
                }catch (Exception e)
                {
                    Toast.makeText(context.getApplicationContext(),"Url Kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }


    @Override
    public int getItemCount() {
        return cards.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;
        ImageView ivPhoto;
        CardView cvCardView;
        LinearLayout llLinearLayout;
        Button ivLink;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            ivPhoto = itemView.findViewById(R.id.iv_photo);
            cvCardView = itemView.findViewById(R.id.cv_cardview);
            llLinearLayout = itemView.findViewById(R.id.ll_linear);
            ivLink = itemView.findViewById(R.id.iv_link);;

        }
    }

}

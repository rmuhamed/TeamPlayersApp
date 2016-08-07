package com.iscoresports.teamplayersapp.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.iscoresports.teamplayersapp.R;

/**
 * Created by rmuhamed on domingo.
 */
public class TeamPlayerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final OnAdapterItemClick itemClickListener;
    public ImageView playerPictureIv;
    public TextView playerNameTv;
    public TextView playerJerseyNumberTv;

    public TeamPlayerHolder(View itemView, OnAdapterItemClick itemClickListener) {
        super(itemView);

        this.playerNameTv = (TextView) itemView.findViewById(R.id.team_player_item_name);
        this.playerJerseyNumberTv = (TextView) itemView.findViewById(R.id.team_player_item_jersey_number);
        this.playerPictureIv = (ImageView) itemView.findViewById(R.id.team_player_item_picture);

        this.itemClickListener = itemClickListener;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onAdapterItemClicked(this.getAdapterPosition());
    }
}

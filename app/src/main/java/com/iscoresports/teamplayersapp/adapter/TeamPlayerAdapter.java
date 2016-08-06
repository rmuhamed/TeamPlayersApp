package com.iscoresports.teamplayersapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.iscoresports.teamplayersapp.R;
import com.iscoresports.teamplayersapp.adapter.viewholder.TeamPlayerHolder;
import com.iscoresports.teamplayersapp.model.Player;

import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public class TeamPlayerAdapter extends RecyclerView.Adapter<TeamPlayerHolder> {
    private List<Player> items;

    public TeamPlayerAdapter(List<Player> players) {
        this.items = players;
    }

    @Override
    public TeamPlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_player_item, parent, false);
        return new TeamPlayerHolder(v);
    }

    @Override
    public void onBindViewHolder(TeamPlayerHolder holder, int position) {
        Player somePlayer = this.items.get(position);

        holder.playerNameTv.setText(somePlayer.getPerson().toString());

        Glide.with(holder.playerPictureIv.getContext())
                .load(somePlayer.getPerson().getImageUrl())
                .asBitmap()
                .centerCrop()
                .into(holder.playerPictureIv);
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;
        if (this.items != null) {
            itemCount = this.items.size();
        }

        return itemCount;
    }

    public void setItems(List<Player> players) {
        this.items = players;
        this.notifyDataSetChanged();
    }
}

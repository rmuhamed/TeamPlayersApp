package com.iscoresports.teamplayersapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iscoresports.teamplayersapp.R;
import com.iscoresports.teamplayersapp.adapter.viewholder.OnAdapterItemClick;
import com.iscoresports.teamplayersapp.adapter.viewholder.TeamPlayerHolder;
import com.iscoresports.teamplayersapp.model.Player;
import com.iscoresports.teamplayersapp.widget.remoteimage.RemoteImageView;
import com.iscoresports.teamplayersapp.widget.remoteimage.SimpleRemoteImageBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public class TeamPlayerAdapter extends RecyclerView.Adapter<TeamPlayerHolder> implements OnAdapterItemClick {
    private final OnPlayerSelected onPlayerSelectedListener;
    private List<Player> items;

    /**
     * Construct Adapter instance with an empty collection of players
     * @param onPlayerSelectedListener
     */
    public TeamPlayerAdapter(OnPlayerSelected onPlayerSelectedListener) {
        this.items = new ArrayList<>();
        this.onPlayerSelectedListener = onPlayerSelectedListener;
    }

    @Override
    public TeamPlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_player_item, parent, false);
        return new TeamPlayerHolder(v, this);
    }

    @Override
    public void onBindViewHolder(TeamPlayerHolder holder, int position) {
        Player somePlayer = this.items.get(position);

        holder.playerNameTv.setText(somePlayer.getPerson().toString());
        holder.playerJerseyNumberTv.setText(somePlayer.getJerseyNumber());

        RemoteImageView remoteImageView =
                new SimpleRemoteImageBuilder(holder.playerPictureIv, somePlayer.getPerson().getImageUrl()).build();
        remoteImageView.load();
    }

    @Override
    public int getItemCount() {
    int itemCount = 0;
    if (this.items != null) {
        itemCount = this.items.size();
    }

    return itemCount;
    }

    @Override
    public void onAdapterItemClicked(int position) {
        Player aPlayer = this.items.get(position);

        this.onPlayerSelectedListener.onSomePlayerClicked(aPlayer);
    }

    /**
     * Fill adapter with remote items data (a player's collection)
     * @param players
     */
    public void setItems(List<Player> players) {
        this.items = players;
        this.notifyDataSetChanged();
    }
}

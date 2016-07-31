package com.iscoresports.teamplayersapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.iscoresports.teamplayersapp.activity.TeamPlayersActivity;
import com.iscoresports.teamplayersapp.adapter.viewholder.TeamPlayerHolder;
import com.iscoresports.teamplayersapp.model.Team;

import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public class TeamPlayerAdapter extends RecyclerView.Adapter<TeamPlayerHolder> {
    private final List<Team> items;

    public TeamPlayerAdapter(TeamPlayersActivity teamPlayersActivity, List<Team> players) {
        this.items = players;
    }

    @Override
    public TeamPlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TeamPlayerHolder(parent);
    }

    @Override
    public void onBindViewHolder(TeamPlayerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        int itemCount = 0;
        if (this.items != null) {
            itemCount = this.items.size();
        }

        return itemCount;
    }
}

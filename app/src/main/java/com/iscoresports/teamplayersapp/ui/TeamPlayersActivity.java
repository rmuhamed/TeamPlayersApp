package com.iscoresports.teamplayersapp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.iscoresports.teamplayersapp.R;
import com.iscoresports.teamplayersapp.adapter.OnPlayerSelected;
import com.iscoresports.teamplayersapp.adapter.TeamPlayerAdapter;
import com.iscoresports.teamplayersapp.controller.TeamController;
import com.iscoresports.teamplayersapp.model.Player;


public class TeamPlayersActivity extends MyAppBaseActivity implements OnPlayerSelected {
    public static final int SPAN_COUNT = 2;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inject this
        new TeamPlayersViewModel().fetchData();
    }

    @Override
    protected void setupLayout() {
        this.recyclerView = (RecyclerView) this.findViewById(R.id.team_player_recycler);
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, SPAN_COUNT));
        this.recyclerView.setAdapter(new TeamPlayerAdapter(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        this.recyclerView.setItemAnimator(itemAnimator);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_team_players;
    }

    @Override
    public void onSomePlayerClicked(Player aPlayer) {

    }
}

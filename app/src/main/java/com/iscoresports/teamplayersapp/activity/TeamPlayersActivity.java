package com.iscoresports.teamplayersapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.iscoresports.teamplayersapp.R;
import com.iscoresports.teamplayersapp.adapter.TeamPlayerAdapter;
import com.iscoresports.teamplayersapp.api.APIResultListener;
import com.iscoresports.teamplayersapp.api.RestAPIImpl;
import com.iscoresports.teamplayersapp.model.Team;

import java.util.ArrayList;

public class TeamPlayersActivity extends MyAppBaseActivity {
    public static final int SPAN_COUNT = 3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.fetchData();
    }

    @Override
    protected void setupLayout() {
        RecyclerView recyclerView = (RecyclerView) this.findViewById(R.id.team_player_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, SPAN_COUNT));

        recyclerView.setAdapter(new TeamPlayerAdapter(this, new ArrayList<Team>()));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_team_players;
    }

    private void fetchData() {
        RestAPIImpl restImpl = new RestAPIImpl(new APIResultListener<Team>() {
            @Override
            public void onSuccess(Team result) {
                Toast.makeText(TeamPlayersActivity.this, result.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError() {
                Toast.makeText(TeamPlayersActivity.this, "SOME ERROR", Toast.LENGTH_SHORT).show();
            }
        });

        restImpl.getTeam();
    }
}

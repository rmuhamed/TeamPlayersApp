package com.iscoresports.teamplayersapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.iscoresports.teamplayersapp.R;
import com.iscoresports.teamplayersapp.api.APIResultListener;
import com.iscoresports.teamplayersapp.api.RestAPIImpl;
import com.iscoresports.teamplayersapp.model.Team;

public class TeamPlayersActivity extends MyAppBaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.fetchData();
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

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_team_players;
    }
}

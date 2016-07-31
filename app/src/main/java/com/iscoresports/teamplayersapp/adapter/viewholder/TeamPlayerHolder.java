package com.iscoresports.teamplayersapp.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.iscoresports.teamplayersapp.R;

/**
 * Created by rmuhamed on domingo.
 */
public class TeamPlayerHolder extends RecyclerView.ViewHolder{
    public ImageView playerPictureIv;
    public TextView playerNameTv;

    public TeamPlayerHolder(View itemView) {
        super(itemView);

        this.playerNameTv = (TextView) itemView.findViewById(R.id.team_player_item_name);
        this.playerPictureIv = (ImageView) itemView.findViewById(R.id.team_player_item_picture);
    }
}

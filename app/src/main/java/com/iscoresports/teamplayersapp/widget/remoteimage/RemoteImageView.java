package com.iscoresports.teamplayersapp.widget.remoteimage;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.StringLoader;

/**
 * Created by rmuhamed on domingo.
 */
public class RemoteImageView {
    private final String remoteUrl;
    private ImageView imageView;

    RemoteImageView(ImageView anImageView, String remoteUrl) {
        this.imageView = anImageView;
        this.remoteUrl = remoteUrl;
    }

    public void load() {
        Glide.with(this.imageView.getContext())
                .load(this.remoteUrl)
                .asBitmap()
                .centerCrop()
                .into(this.imageView);
    }
}

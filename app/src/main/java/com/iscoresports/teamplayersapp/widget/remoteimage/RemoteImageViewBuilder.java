package com.iscoresports.teamplayersapp.widget.remoteimage;

import android.widget.ImageView;

/**
 * Created by rmuhamed on domingo.
 */
public abstract class RemoteImageViewBuilder {
    private RemoteImageView aRemoteImageView;

    RemoteImageViewBuilder(ImageView anImageView , String remoteUrl) {
        this.aRemoteImageView = new RemoteImageView(anImageView, remoteUrl);
    }

    public RemoteImageView build(){
        return this.aRemoteImageView;
    }
}

package com.iscoresports.teamplayersapp.widget.remoteimage;

import android.widget.ImageView;

/**
 * Created by rmuhamed on domingo.
 */
public abstract class RemoteImageViewBuilder {
    private ImageView imageView;
    private String remoteUrl;

    private RemoteImageView aRemoteImageView;

    RemoteImageViewBuilder(ImageView anImageView , String remoteUrl) {
        this.aRemoteImageView = new RemoteImageView(anImageView, remoteUrl);
    }

    public RemoteImageViewBuilder setImageView(ImageView anImageView) {
        this.imageView = anImageView;
        return this;
    }

    public RemoteImageViewBuilder setUrl(String url) {
        this.remoteUrl = url;
        return this;
    }

    public RemoteImageView build() {
        return new RemoteImageView(this.imageView, this.remoteUrl);
    }
}

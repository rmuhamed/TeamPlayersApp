package com.iscoresports.teamplayersapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by rmuhamed on viernes.
 */
public abstract class MyAppBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(this.getLayoutResourceId());

        this.setupLayout();
    }

    protected abstract void setupLayout();

    protected abstract int getLayoutResourceId();
}

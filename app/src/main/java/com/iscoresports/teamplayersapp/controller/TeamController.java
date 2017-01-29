package com.iscoresports.teamplayersapp.controller;

import com.iscoresports.teamplayersapp.model.Team;

import java.util.List;


/**
 * Created by rmuhamed on domingo.
 */
public class TeamController implements AbstractController<Team> {

    /**
     * Retrieve Team data from some kind of repository, such us DB or WS
     * @return
     */
    @Override
    public List<Team> getAll() {
        //TODO: RM - Invoke according repository to fetch data
        return null;
    }

    @Override
    public Team get() {
        return null;
    }
}

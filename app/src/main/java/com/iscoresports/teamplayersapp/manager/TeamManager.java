package com.iscoresports.teamplayersapp.manager;

import com.iscoresports.teamplayersapp.model.Team;
import com.iscoresports.teamplayersapp.repository.IRepository;

import java.util.List;


/**
 * Created by rmuhamed on domingo.
 */
public class TeamManager implements IManager {

    /**
     * Retrieve Team data from some kind of repository, such us DB or WS
     * @return
     */
    @Override
    public List<Team> getAll() {
        //TODO: RM - Invoke according repository to fetch data
        return null;
    }
}

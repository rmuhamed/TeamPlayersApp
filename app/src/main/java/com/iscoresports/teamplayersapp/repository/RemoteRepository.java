package com.iscoresports.teamplayersapp.repository;

import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public class RemoteRepository<T> implements IRepository<T> {
    @Override
    public List<T> getAll() {
        //TODO: Invoke @RestAPIImpl to recover data from Server
        return null;
    }
}

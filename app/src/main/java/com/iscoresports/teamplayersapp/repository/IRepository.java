package com.iscoresports.teamplayersapp.repository;

import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public interface IRepository<T> {

    List<T> getAll();
}

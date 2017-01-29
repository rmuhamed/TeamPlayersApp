package com.iscoresports.teamplayersapp.controller;

import java.util.List;

/**
 * Created by rmuhamed on domingo.
 */
public interface AbstractController<T> {
    List<T> getAll();

    T get();
}

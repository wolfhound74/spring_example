package ru.example.model.dao;

import ru.example.model.entity.Persistent;

import java.util.List;

public interface Dao<T extends Persistent> {
    void saveOrUpdate(T persistent);

    void delete(Long id);

    void delete(T persistent);

    T get(Long id);

    List<T> getAll();
}

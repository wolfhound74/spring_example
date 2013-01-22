package ru.example.model.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.example.model.dao.Dao;
import ru.example.model.entity.Persistent;

public abstract class AbstractHibernateDao<T extends Persistent> implements Dao<T> {
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

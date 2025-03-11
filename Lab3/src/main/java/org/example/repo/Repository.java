package org.example.repo;

public interface Repository {
    void add(Object entity);
    void delete(Object entity);
    void update(Object entity);
    Object findById(Object id);
    Iterable<Object> findAll();
}

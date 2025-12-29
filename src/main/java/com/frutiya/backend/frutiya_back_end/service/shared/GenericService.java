package com.frutiya.backend.frutiya_back_end.service.shared;

import java.util.List;

public interface GenericService<T, ID> {
    T save(T entity);
    T findById(ID id);
    List<T> findAll();
    void delete(ID id);
}

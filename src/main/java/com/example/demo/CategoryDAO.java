package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Category DAO
 *
 * @author taehi
 */
public interface CategoryDAO extends CrudRepository<CategoryEntity, String> {
    public List<CategoryEntity> findAllByOrderByOrder();
}



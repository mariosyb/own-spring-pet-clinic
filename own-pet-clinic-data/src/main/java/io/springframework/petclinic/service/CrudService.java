/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.service;

import java.util.Set;

/**
 * 
 * @author msulbara
 * @param <T> : object type
 * @param <ID> : id type
 * this interface mimics SpringFramerok's CrudRepository
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}

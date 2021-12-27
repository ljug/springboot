/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.pascalfares.DaoDto.DAO;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Pascal Fares
 */
public interface GenericDAO<T> {

    Optional<T> get(long id);
    
    List<T> getAll();
    
    void save(T t);
    
    void update(T t, String[] params);
    
    void delete(T t);
}

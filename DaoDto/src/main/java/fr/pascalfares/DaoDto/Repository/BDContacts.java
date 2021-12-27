/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.pascalfares.DaoDto.Repository;

import fr.pascalfares.DaoDto.DAO.GenericDAO;
import fr.pascalfares.DaoDto.DTO.Contact;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pascal Fares
 */
@Component
public class BDContacts implements GenericDAO<Contact> {

    LinkedList<Contact> allContacts = new LinkedList<>();

    @Override
    public Optional<Contact> get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Contact> getAll() {
        return allContacts;
    }

    @Override
    public void save(Contact t) {
        if (!allContacts.contains(t)) {
            allContacts.add(t);
        }
    }

    @Override
    public void update(Contact t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Contact t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

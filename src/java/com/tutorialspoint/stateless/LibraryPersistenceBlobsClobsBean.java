/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import com.tutorialspoint.entity.Books;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tiago.lucas
 */
@Stateless
public class LibraryPersistenceBlobsClobsBean implements LibraryPersistenceBlobsClobsBeanRemote {

    @PersistenceContext(unitName="LibraryPersistenceBlobsClobsPU")
    private EntityManager entityManager;
    
    public void addBook(Books book) {
        entityManager.persist(book);
    }

    public List<Books> getBooks() {
        return entityManager.createQuery("From Books").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocks.imsofa.jpasample2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author lendle
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager em=Persistence.createEntityManagerFactory("database_systems").createEntityManager();
        
        em.getTransaction().begin();
        //remove the newly created bar
        //////////////////////////////
        Bar bar=em.find(Bar.class, "xxx");
        em.remove(bar);
        em.getTransaction().commit();
        em.close();
        System.exit(0);
    }
    
}

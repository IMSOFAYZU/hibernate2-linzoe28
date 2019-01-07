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
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager em=Persistence.createEntityManagerFactory("database_systems").createEntityManager();
        
        em.getTransaction().begin();
        //create a new bar, add employees to the new bar
        Bar bar=new Bar();
        bar.setName("xxx");
        bar.setAddr("addr");
        bar.setLicense("1232");
        em.persist(bar);
        
        Employee employee=new Employee("123","aaa","1235");
        employee.setBar(bar);
        em.persist(employee);
        ////////////////////////////////////////////////
        em.getTransaction().commit();
        em.close();
        System.exit(0);
    }
    
}

package dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;


import model.User;
import util.HibernateUtil;

public class UserDao {

    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }      
    }
    
    @SuppressWarnings("unchecked")
    public List < User > getAllUsers() {

        List < User > listOfUser = new ArrayList<User>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            listOfUser = session.createQuery("FROM User").getResultList();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listOfUser;
    }	
    	
  
    public User getUser(int id) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = session.get(User.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }
    
    public void deleteUser(int id) {
    	
    	Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        	transaction = session.beginTransaction();
            // get an user object
        	User user = session.get(User.class, id);
            session.delete(user);
                        // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        	
        } 
    }
}
package com.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class DeleteStudent{
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student s = session.get(Student.class, 2);
        if(s != null){
            session.delete(s);
        }
        tx.commit();
        session.close();
        System.out.println("Student deleted successfully");
    }
}
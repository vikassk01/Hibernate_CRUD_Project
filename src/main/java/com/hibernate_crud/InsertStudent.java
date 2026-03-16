package com.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class InsertStudent{
    public static void main(String[] args){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s1 = new Student();
        s1.setName("Vikas");
        s1.setMarks(70);

        Student s2 = new Student();
        s2.setName("Ajay");
        s2.setMarks(85);

        session.save(s1);
        session.save(s2);

        tx.commit();
        session.close();

        System.out.println("Students inserted successfully");
    }
}
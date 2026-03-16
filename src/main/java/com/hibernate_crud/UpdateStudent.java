package com.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class UpdateStudent{
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student s = session.get(Student.class, 1);
        if(s != null){
            s.setMarks(85);
            session.update(s);
        }
        tx.commit();
        session.close();
        System.out.println("Student updated successfully");
    }
}
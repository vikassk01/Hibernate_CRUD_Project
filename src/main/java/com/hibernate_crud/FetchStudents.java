package com.hibernate_crud;

import java.util.List;
import org.hibernate.Session;
public class FetchStudents{
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        for(Student s : students){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }
        session.close();
    }
}
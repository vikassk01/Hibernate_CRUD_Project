package com.hibernate_crud;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int marks;
	
	public Student(){
	}
	
	public Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setMarks(int marks){
		this.marks=marks;
	} 
}

package com.demo.beans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Person98")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="persontable",discriminatorType = DiscriminatorType.STRING)
public class Person {
@Id
private int id;
private String name;
private String mob;
public Person() {
	super();
}
public Person(int id, String name, String mob) {
	
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", mob=" + mob + "]";
}

}

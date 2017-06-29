package com.colucy.cars;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Make {
@Id
@GeneratedValue
private Long id;
private String name;

@OneToMany(mappedBy="make")//wtf?
private Set<Models> models;

public Long getId() {
	return id;
}
public String getName() {
	return name;
}
public Make(String name) {
	this.name = name;
	

}
private Make(){}



}

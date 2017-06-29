package com.colucy.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Models {
@Id
@GeneratedValue
private Long id;
private String name;

@ManyToOne
private Make make;

public Long getId() {
	return id;
}
public String getName() {
	return name;
}
public Models(String name) {
	this.name = name;
}
private Models(){}

}


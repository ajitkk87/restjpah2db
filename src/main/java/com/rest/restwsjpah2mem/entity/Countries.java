package com.rest.restwsjpah2mem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class Countries {
	
	protected Countries() {
		
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@JsonProperty("name")
	private String name;
	
	
	
	public Countries(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}



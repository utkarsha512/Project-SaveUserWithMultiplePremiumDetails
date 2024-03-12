package com.velocity.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name ;
	private String email;
	@OneToMany(mappedBy = "userid")
	private List<PremiumDetails> premiumDetailsList;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PremiumDetails> getPremiumDetailsList() {
		return premiumDetailsList;
	}
	public void setPremiumDetailsList(List<PremiumDetails> premiumDetailsList) {
		this.premiumDetailsList = premiumDetailsList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", premiumDetailsList=" + premiumDetailsList
				+ "]";
	}
	
	
}

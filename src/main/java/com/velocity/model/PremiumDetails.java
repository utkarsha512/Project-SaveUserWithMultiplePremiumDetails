package com.velocity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="premiumdetails")
public class PremiumDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int premiumId;
	private String status;
	private String premiumName;
	private int userid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPremiumName() {
		return premiumName;
	}
	public void setPremiumName(String premiumName) {
		this.premiumName = premiumName;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "PremiumDetails [id=" + id + ", premiumId=" + premiumId + ", status=" + status + ", premiumName="
				+ premiumName + ", userid=" + userid + "]";
	}
	
	
	}

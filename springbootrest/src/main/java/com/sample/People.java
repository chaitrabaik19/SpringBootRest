package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

/* Mapping the Data_store TABLE to the entity */
@Table(name ="DATA_STORE")
public class People {
	
	@Id
	private int user_id;
	
	private String user_name;
	private int user_age;
	private int user_balance;
	private String user_email;
	private String user_adress;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public int getUser_balance() {
		return user_balance;
	}
	public void setUser_balance(int user_balance) {
		this.user_balance = user_balance;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_adress() {
		return user_adress;
	}
	public void setUser_adress(String user_adress) {
		this.user_adress = user_adress;
	}
	

}

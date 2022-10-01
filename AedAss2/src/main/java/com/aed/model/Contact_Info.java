/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

/**
 *
 * @author yashpawar
 */
public class Contact_Info {
    private String contact_number;
	private String email;

	public Contact_Info(String contact_number, String email) {
		super();
		this.contact_number = contact_number;
		this.email = email;
	}

	public String getCellphone_number() {
		return contact_number;
	}

	public void setCellphone_number(String cellphone_number) {
		this.contact_number = cellphone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact_Info [cellphone_number=" + contact_number + ", email=" + email + "]";
	}
}

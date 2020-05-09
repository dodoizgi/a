package com.mimaraslan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personel {

	private int personelId;
	private String personelAdi,personelSoyadiString;
	
	@Id
	public int getPersonelId() {
		return personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	public String getPersonelSoyadiString() {
		return personelSoyadiString;
	}
	public void setPersonelSoyadiString(String personelSoyadiString) {
		this.personelSoyadiString = personelSoyadiString;
	}

}

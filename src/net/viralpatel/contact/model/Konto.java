package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Konto")
public class Konto implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private String benutzerName;
	private String passwort;
	private int rollenId;
	private int benutzerId;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Benutzername")
	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}

	@Column(name = "Passwort")
	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	@Column(name = "RollenID")
	public int getRollenId() {
		return rollenId;
	}

	public void setRollenId(int rollenId) {
		this.rollenId = rollenId;
	}

	@Column(name = "BenutzerID")
	public int getBenutzerId() {
		return benutzerId;
	}

	public void setBenutzerId(int benutzerId) {
		this.benutzerId = benutzerId;
	}

}

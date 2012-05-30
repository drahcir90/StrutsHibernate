package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Benutzer")
public class Benutzer implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private String vorname;
	private String name;
	private int firmenId;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Vorname")
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Column(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "FirmenID")
	public int getFirmenId() {
		return firmenId;
	}

	public void setFirmenId(int firmenId) {
		this.firmenId = firmenId;
	}
}

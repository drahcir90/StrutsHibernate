package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Firma")
public class Firma implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private String name;
	private int blz;
	private int kontoNummer;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "BLZ")
	public int getBlz() {
		return blz;
	}

	public void setBlz(int blz) {
		this.blz = blz;
	}

	@Column(name = "Kontonummer")
	public int getKontoNummer() {
		return kontoNummer;
	}

	public void setKontoNummer(int kontoNummer) {
		this.kontoNummer = kontoNummer;
	}

}

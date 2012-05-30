package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventar")
public class Inventar implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private String name;
	private int inventarArtId;

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

	@Column(name = "InventarartID")
	public int getInventarArtId() {
		return inventarArtId;
	}

	public void setInventarArtId(int inventarArtId) {
		this.inventarArtId = inventarArtId;
	}
}

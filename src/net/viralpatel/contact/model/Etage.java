package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Etage")
public class Etage implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private float gebaeudeId;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "GebaeudeID")
	public float getGebaeudeId() {
		return gebaeudeId;
	}

	public void setGebaeudeId(float gebaeudeId) {
		this.gebaeudeId = gebaeudeId;
	}

}

package net.viralpatel.contact.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Raum")
public class Raum implements Serializable {
	private static final long serialVersionUID = -7829913684020804117L;
	private int id;
	private float groesse;
	private float mietpreis;
	private int etagenId;
	private int nutzungsArtId;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Groesse")
	public float getGroesse() {
		return groesse;
	}

	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}

	@Column(name = "Mietpreis")
	public float getMietpreis() {
		return mietpreis;
	}

	public void setMietpreis(float mietpreis) {
		this.mietpreis = mietpreis;
	}

	@Column(name = "EtagenID")
	public int getEtagenId() {
		return etagenId;
	}

	public void setEtagenId(int etagenId) {
		this.etagenId = etagenId;
	}

	@Column(name = "NutzungsartID")
	public int getNutzungsArtId() {
		return nutzungsArtId;
	}

	public void setNutzungsArtId(int nutzungsArtId) {
		this.nutzungsArtId = nutzungsArtId;
	}
}

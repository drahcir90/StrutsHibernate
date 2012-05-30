package net.viralpatel.contact.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Buchungen")
public class Buchungen implements Serializable {
	private static final long serialVersionUID = -3680401375155940539L;
	private int id;
	private float heizkosten;
	private int kontoId;
	private int raumId;
	private Date begin;
	private Date ende;
	private Date datum;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Heizungskosten")
	public float getHeizkosten() {
		return heizkosten;
	}

	public void setHeizkosten(float heizkosten) {
		this.heizkosten = heizkosten;
	}

	@Column(name = "KontoID")
	public int getKontoId() {
		return kontoId;
	}

	public void setKontoId(int kontoId) {
		this.kontoId = kontoId;
	}

	@Column(name = "RaumID")
	public int getRaumId() {
		return raumId;
	}

	public void setRaumId(int raumId) {
		this.raumId = raumId;
	}

	@Column(name = "Beginn")
	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	@Column(name = "Ende")
	public Date getEnde() {
		return ende;
	}

	public void setEnde(Date ende) {
		this.ende = ende;
	}

	@Column(name = "Datum")
	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

}

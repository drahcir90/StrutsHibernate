package net.viralpatel.contact.view;

import java.util.List;

import net.viralpatel.contact.controller.RaumManager;
import net.viralpatel.contact.model.Raum;

import com.opensymphony.xwork2.ActionSupport;

public class RaumAction extends ActionSupport {
	private static final long serialVersionUID = 8367613243092810748L;
	private Raum raum;
	private List<Raum> raumList;
	private float id;

	private RaumManager linkController;

	public RaumAction() {
		linkController = new RaumManager();
	}

	public String execute() {
		this.raumList = linkController.list();
		return SUCCESS;
	}

	public String add() {
		System.out.println(getRaum());
		try {
			linkController.add(getRaum());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.raumList = linkController.list();
		return SUCCESS;
	}

	public String delete() {
		linkController.delete(getId());
		return SUCCESS;
	}

	public Raum getRaum() {
		return raum;
	}

	public List<Raum> getRaumList() {
		return raumList;
	}

	public void setRaum(Raum raum) {
		this.raum = raum;
	}

	public void setRaumList(List<Raum> raumList) {
		this.raumList = raumList;
	}

	public float getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

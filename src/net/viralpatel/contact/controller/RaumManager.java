package net.viralpatel.contact.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import net.viralpatel.contact.model.Raum;
import net.viralpatel.contact.util.HibernateUtil;

public class RaumManager extends HibernateUtil {
	public Raum add(Raum raum) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(raum);
		session.getTransaction().commit();
		return raum;
	}

	public Raum delete(float id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Raum raum = (Raum) session.load(Raum.class, id);
		if (null != raum) {
			session.delete(raum);
		}
		session.getTransaction().commit();
		return raum;
	}

	public List<Raum> list() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Raum> rooms = null;
		try {

			rooms = (List<Raum>) session.createQuery("from Raum").list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return rooms;
	}
}

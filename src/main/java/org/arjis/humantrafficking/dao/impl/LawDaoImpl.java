package org.arjis.humantrafficking.dao.impl;

import java.util.List;

import org.arjis.humantrafficking.dao.LawDao;
import org.arjis.humantrafficking.model.Laws;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LawDaoImpl implements LawDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Laws law) {
		
		session.getCurrentSession().save(law);
	}

	@Override
	public void edit(Laws law) {
		
		session.getCurrentSession().update(law);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getLaw(id));
	}

	@Override
	public Laws getLaw(int id) {
		// TODO Auto-generated method stub
		Laws law= (Laws) session.getCurrentSession().get(Laws.class, id);
		return law;
	}

	@Override
	public List<Laws> getAllLaws() {
		return session.getCurrentSession().createQuery("from Laws").list();
	}

}

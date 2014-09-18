package org.arjis.humantrafficking.service.impl;

import java.util.List;




import org.arjis.humantrafficking.dao.LawDao;
import org.arjis.humantrafficking.model.Laws;
import org.arjis.humantrafficking.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LawServiceImpl implements LawService {

	@Autowired
	private LawDao lawdao;
	
	@Transactional
	public void add(Laws law) {
		
		lawdao.add(law);
	}

	@Transactional
	public void edit(Laws law) {
		
		lawdao.edit(law);
	}

	@Transactional
	public void delete(int id) {
		
		lawdao.delete(id);
	}

	@Transactional
	public Laws getLaw(int id) {
	
		return lawdao.getLaw(id);
	}

	@Transactional
	public List<Laws> getAllLaws() {
		
		return lawdao.getAllLaws();
	}

}

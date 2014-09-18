package org.arjis.humantrafficking.dao;

import java.util.List;

import org.arjis.humantrafficking.model.Laws;

public interface LawDao {
	
public void add(Laws law);

public void edit(Laws law);

public void delete(int id);

public Laws getLaw(int id);

public List<Laws> getAllLaws();
}

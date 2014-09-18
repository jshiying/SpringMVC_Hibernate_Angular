package org.arjis.humantrafficking.service;

import java.util.List;

import org.arjis.humantrafficking.model.Laws;

public interface LawService {
	public void add(Laws law);

	public void edit(Laws law);

	public void delete(int id);

	public Laws getLaw(int id);

	public List<Laws> getAllLaws();

}

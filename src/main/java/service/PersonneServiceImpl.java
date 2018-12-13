package service;

import java.util.List;

import dao.PersonneDao;
import model.Personne;

public class PersonneServiceImpl implements PersonneService {

	private PersonneDao personneDao;
	
	public List<Personne> getListPersonne() {
		// TODO Auto-generated method stub
		return personneDao.getListPersonne();
	}

}

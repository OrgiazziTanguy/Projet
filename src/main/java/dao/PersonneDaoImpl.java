package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Personne;

@Transactional
@Repository
public class PersonneDaoImpl implements PersonneDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Personne> getListPersonne() {
		// TODO Auto-generated method stub
		 Session s = this.sessionFactory.openSession();
		 List<Personne> list = s.createQuery("from Personnes").list();
		 s.close();
		 return list;
	}
	
}

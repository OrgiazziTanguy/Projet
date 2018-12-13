package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import model.Personne;
import service.PersonneService;

@ManagedBean(name="personneBean")
public class PersonneBean {
	private PersonneService personneService;
	private Personne personne;
	
	public PersonneBean()
	{
		personne = new Personne();
	}
	
	public Personne getPersonne()
	{
		return personne;
	}
	
	public List<Personne> getListPersonne()
	{
		return personneService.getListPersonne();
	}
}

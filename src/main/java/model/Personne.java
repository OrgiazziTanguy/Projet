package model;

import java.awt.TextArea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personne {
		
		@Id
		@GeneratedValue
		private int id;
		@Column(name="civil")
		private String civil;
		@Column(name="nom")
		private String nom;
		@Column(name="prenom")
		private String prenom;
		@Column(name="adresse")
		private String adresse;
		@Column(name="dateNaiss")
		private String dateNaiss;
		@Column(name="mail")
		private String mail;
		@Column(name="tel")
		private String tel;
		@Column(name="notes")
		private String notes;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCivilite() {
			return civil;
		}
		public void setCivilite(String civilite) {
			this.civil = civilite;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getDateDeNaissance() {
			return dateNaiss;
		}
		public void setDateDeNaissance(String dateDeNaissance) {
			this.dateNaiss = dateDeNaissance;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}	
}

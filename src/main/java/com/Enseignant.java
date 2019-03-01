package com;

/* Importing needed Libraries, and predefined Classes */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * 
 * 
 * @author Meryem
 *
 */

@Entity
@Table(name = "Enseignant")
//Calling JPA NamedQueries
@NamedQueries({
		@NamedQuery(name = "Enseignant.findByEmailUbo", query = "SELECT e FROM Enseignant e WHERE e.emailUbo = ?1"),
		@NamedQuery(name = "Enseignant.findByNom", query = "SELECT e FROM Enseignant e WHERE e.nom = ?1") })

/* Defining the structure of Enseignant class */
public class Enseignant implements Serializable {

	private static final long serialVersionUID = 1L;
	// Marking noEnseignant the ID of the Class Enseignant which is mapped to the table Enseignant in the database
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "NO_ENSEIGNANT")
	private Long noEnseignant;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "SEXE")
	private String sexe;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "CODE_POSTAL")
	private String codePostal;
	@Column(name = "VILLE")
	private String ville;
	@Column(name = "PAYS")
	private String pays;
	@Column(name = "MOBILE")
	private String mobile;
	@Column(name = "TELEPHONE")
	private String telephone;
	@Column(name = "EMAIL_UBO")
	private String emailUbo;

	@Column(name = "EMAIL_PERSO")
	private String emailPerso;

	/* Constructor by default */
	public Enseignant() {
	}

	/* Constructor using attributes */
	public Enseignant(@NotNull Long noEnseignant, String type, String sexe, String nom, String prenom, String adresse,
			String codePostal, String ville, String pays, String mobile, String telephone, String emailUbo,
			String emailPerso) {
		super();
		this.noEnseignant = noEnseignant;
		this.type = type;
		this.sexe = sexe;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.mobile = mobile;
		this.telephone = telephone;
		this.emailUbo = emailUbo;
		this.emailPerso = emailPerso;
	}

	// Constructor using one parameter = noEnseignant the Id
	public Enseignant(Long noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public Long getNoEnseignant() {
		return noEnseignant;
	}

	// Getters and setters
	public void setNoEnseignant(Long noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
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

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailUbo() {
		return emailUbo;
	}

	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}

	public String getEmailPerso() {
		return emailPerso;
	}

	public void setEmailPerso(String emailPerso) {
		this.emailPerso = emailPerso;
	}

	// Overriding toString() method
	@Override
	public String toString() {
		return "Enseignant [noEnseignant=" + noEnseignant + ", type=" + type + ", sexe=" + sexe + ", nom=" + nom
				+ ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", pays=" + pays + ", mobile=" + mobile + ", telephone=" + telephone + ", emailUbo=" + emailUbo
				+ ", emailPerso=" + emailPerso + "]";
	}

	// Overriding HashCode() method and equals method
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (noEnseignant != null ? noEnseignant.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Enseignant)) {
			return false;
		}
		Enseignant other = (Enseignant) object;
		if ((this.noEnseignant == null && other.noEnseignant != null)
				|| (this.noEnseignant != null && !this.noEnseignant.equals(other.noEnseignant))) {
			return false;
		}
		return true;
	}

}
/**
 * ############################ END_ENSEIGNANT ############################
 */
package com;

import java.io.Serializable;
import java.sql.Date;

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

/* Using NamedQueries to be executed */
@Entity
@Table(name = "Formation")
@NamedQueries({
		@NamedQuery(name = "Formation.findByNomFormation", query = "SELECT f FROM Formation f WHERE f.nomFormation = ?1"), })
public class Formation implements Serializable {

	private static final long serialVersionUID = 1L;

	// Declaring codeFormation as the ID of the Class Formation which is mapped to
	// the table Formation in the database
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "CODE_FORMATION")
	private String codeFormation;
	@Column(name = "DIPLOME")
	private String diplome;
	@Column(name = "N0_ANNEE")
	private Short n0Annee;
	@Column(name = "NOM_FORMATION")
	private String nomFormation;
	@Column(name = "DOUBLE_DIPLOME")
	private Character doubleDiplome;
	@Column(name = "DEBUT_ACCREDITATION")
	private Date debutAccreditation;
	@Column(name = "FIN_ACCREDITATION")

	private Date finAccreditation;

	// Constructor without fields
	public Formation() {
	}

	// Constructor using all fields
	public Formation(@NotNull String codeFormation, String diplome, Short n0Annee, String nomFormation,
			Character doubleDiplome, Date debutAccreditation, Date finAccreditation) {
		super();
		this.codeFormation = codeFormation;
		this.diplome = diplome;
		this.n0Annee = n0Annee;
		this.nomFormation = nomFormation;
		this.doubleDiplome = doubleDiplome;
		this.debutAccreditation = debutAccreditation;
		this.finAccreditation = finAccreditation;
	}

	// Constructor with one parameter: codeFormation
	public Formation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	// Getters and setters
	public String getCodeFormation() {
		return codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public Short getN0Annee() {
		return n0Annee;
	}

	public void setN0Annee(Short n0Annee) {
		this.n0Annee = n0Annee;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	public Character getDoubleDiplome() {
		return doubleDiplome;
	}

	public void setDoubleDiplome(Character doubleDiplome) {
		this.doubleDiplome = doubleDiplome;
	}

	public Date getDebutAccreditation() {
		return debutAccreditation;
	}

	public void setDebutAccreditation(Date debutAccreditation) {
		this.debutAccreditation = debutAccreditation;
	}

	public Date getFinAccreditation() {
		return finAccreditation;
	}

	public void setFinAccreditation(Date finAccreditation) {
		this.finAccreditation = finAccreditation;
	}

	// Overriding HashCode() method and equals method
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codeFormation != null ? codeFormation.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Formation)) {
			return false;
		}
		Formation other = (Formation) object;
		if ((this.codeFormation == null && other.codeFormation != null)
				|| (this.codeFormation != null && !this.codeFormation.equals(other.codeFormation))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Formation [codeFormation=" + codeFormation + ", diplome=" + diplome + ", n0Annee=" + n0Annee
				+ ", nomFormation=" + nomFormation + ", doubleDiplome=" + doubleDiplome + ", debutAccreditation="
				+ debutAccreditation + ", finAccreditation=" + finAccreditation + "]";
	}

}

/**
 * ############################ END_FORMATION ############################
 */

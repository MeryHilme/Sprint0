package com;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "Candidat")
@NamedQueries({
@NamedQuery(name = "Candidat.findByUniversiteOrigine", query = "SELECT c FROM Candidat c WHERE c.universiteOrigine = ?1"),
@NamedQuery(name = "Candidat.findByNom", query = "SELECT c FROM Candidat c WHERE c.nom = ?1")

})
public class Candidat {

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NO_CANDIDAT")
    private String noCandidat;
    @Size(max = 8)
    @Column(name = "CODE_FORMATION")
    private String codeFormation;
    @Size(max = 10)
    @Column(name = "ANNEE_UNIVERSITAIRE")
    private String anneeUniversitaire;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 1)
    @Column(name = "SEXE")
    private String sexe;
    @Column(name = "DATE_NAISSANCE")
   
    private Date dateNaissance;
    @Size(max = 255)
    @Column(name = "LIEU_NAISSANCE")
    private String lieuNaissance;
    @Size(max = 50)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Size(max = 20)
    @Column(name = "TELEPHONE")
    private String telephone;
    @Size(max = 20)
    @Column(name = "MOBILE")
    private String mobile;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 10)
    @Column(name = "CODE_POSTAL")
    private String codePostal;
    @Size(max = 255)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 5)
    @Column(name = "PAYS_ORIGINE")
    private String paysOrigine;
    @Size(max = 6)
    @Column(name = "UNIVERSITE_ORIGINE")
    private String universiteOrigine;
    @Size(max = 6)
    @Column(name = "LISTE_SELECTION")
    private String listeSelection;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SELECTION_NO_ORDRE")
    private Double selectionNoOrdre;
    @Column(name = "CONFIRMATION_CANDIDAT")
    private String confirmationCandidat;
    @Column(name = "DATE_REPONSE_CANDIDAT")
   
    private Date dateReponseCandidat;
    
    public Candidat(){}
    
    public Candidat(String noCandidat, String codeFormation, String anneeUniversitaire, String nom, String prenom,
			String sexe, Date dateNaissance, String lieuNaissance, String nationalite, String telephone, String mobile,
			String email, String adresse, String codePostal, String ville, String paysOrigine, String universiteOrigine,
			String listeSelection, Double selectionNoOrdre, String confirmationCandidat, Date dateReponseCandidat) {
		super();
		this.noCandidat = noCandidat;
		this.codeFormation = codeFormation;
		this.anneeUniversitaire = anneeUniversitaire;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.nationalite = nationalite;
		this.telephone = telephone;
		this.mobile = mobile;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.paysOrigine = paysOrigine;
		this.universiteOrigine = universiteOrigine;
		this.listeSelection = listeSelection;
		this.selectionNoOrdre = selectionNoOrdre;
		this.confirmationCandidat = confirmationCandidat;
		this.dateReponseCandidat = dateReponseCandidat;
	}
	
    public Candidat(String noCandidat,String codeFormation, String anneeUniversitaire, String nom, String prenom, String sexe) {
		this.noCandidat=noCandidat;
		this.codeFormation=codeFormation;
		this.anneeUniversitaire=anneeUniversitaire;
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;		
	}

	public String getNoCandidat() {
		return noCandidat;
	}
	public void setNoCandidat(String noCandidat) {
		this.noCandidat = noCandidat;
	}
	public String getCodeFormation() {
		return codeFormation;
	}
	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}
	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}
	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
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
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPaysOrigine() {
		return paysOrigine;
	}
	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}
	public String getUniversiteOrigine() {
		return universiteOrigine;
	}
	public void setUniversiteOrigine(String universiteOrigine) {
		this.universiteOrigine = universiteOrigine;
	}
	public String getListeSelection() {
		return listeSelection;
	}
	public void setListeSelection(String listeSelection) {
		this.listeSelection = listeSelection;
	}
	public Double getSelectionNoOrdre() {
		return selectionNoOrdre;
	}
	public void setSelectionNoOrdre(Double selectionNoOrdre) {
		this.selectionNoOrdre = selectionNoOrdre;
	}
	public String getConfirmationCandidat() {
		return confirmationCandidat;
	}
	public void setConfirmationCandidat(String confirmationCandidat) {
		this.confirmationCandidat = confirmationCandidat;
	}
	public Date getDateReponseCandidat() {
		return dateReponseCandidat;
	}
	public void setDateReponseCandidat(Date dateReponseCandidat) {
		this.dateReponseCandidat = dateReponseCandidat;
	}
	
	
	@Override
	public String toString() {
		return "Candidat [noCandidat=" + noCandidat + ", codeFormation=" + codeFormation + ", anneeUniversitaire="
				+ anneeUniversitaire + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", dateNaissance="
				+ dateNaissance + ", lieuNaissance=" + lieuNaissance + ", nationalite=" + nationalite + ", telephone="
				+ telephone + ", mobile=" + mobile + ", email=" + email + ", adresse=" + adresse + ", codePostal="
				+ codePostal + ", ville=" + ville + ", paysOrigine=" + paysOrigine + ", universiteOrigine="
				+ universiteOrigine + ", listeSelection=" + listeSelection + ", selectionNoOrdre=" + selectionNoOrdre
				+ ", confirmationCandidat=" + confirmationCandidat + ", dateReponseCandidat=" + dateReponseCandidat
				+ "]";
	}

	



	
	
}
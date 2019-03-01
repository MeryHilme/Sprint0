package com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable is used to indicate that the table will not exist alone, it will be mapped using this class of composite key
@Embeddable
public class PromotionPrimaryKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ANNEE_UNIVERSITAIRE")
	private String anneeUniversitaire;

	@Column(name = "CODE_FORMATION")
	private String codeFormation;

	//Constructor by default 
	public PromotionPrimaryKey() {}

	//Constructor using the composite key
	public PromotionPrimaryKey(String anneeUniversitaire, String codeFormation) {
		super();
		this.anneeUniversitaire = anneeUniversitaire;
		this.codeFormation = codeFormation;
	}

	// Getters and setters
	public String getAnneeUniversitaire() {
		return this.anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public String getCodeFormation() {
		return this.codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	// Redefinition of toString() method
	@Override
	public String toString() {
		return "/promotions/CodeFormationAndAnneeUniveristaire?codeformation="+codeFormation+
				"&anneeUniversitaire="+anneeUniversitaire;
	}

}
/**
 * ############################ END_PROMOTION_PRIMARY_KEY ############################
 */
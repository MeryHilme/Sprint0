package com;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PromotionPrimaryKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ANNEE_UNIVERSITAIRE")
	private String anneeUniversitaire;

	@Column(name = "CODE_FORMATION")
	private String codeFormation;

	public PromotionPrimaryKey() {
	}

	public PromotionPrimaryKey(String anneeUniversitaire, String codeFormation) {
		super();
		this.anneeUniversitaire = anneeUniversitaire;
		this.codeFormation = codeFormation;
	}

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

	@Override
	public String toString() {
		return "/promotions/CodeFormationAndAnneeUniveristaire?codeformation="+codeFormation+
				"&anneeUniversitaire="+anneeUniversitaire;
	}

}
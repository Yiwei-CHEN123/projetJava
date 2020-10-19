package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;

public class PersonnePhysiqueC extends Client {

	private String nom;
	private String prenom;
	private String civilite;

	public PersonnePhysiqueC(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, ArrayList<Domaine> lstDomaine, ArrayList<Intervenant> lstInterFavorable, String nom, String prenom, String civilite) {
		super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval, lstDomaine, lstInterFavorable);
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
	}
}

package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonnePhysiqueI extends Intervenant {

	private String nom;
	private String prenom;
	private String civilite;

	public PersonnePhysiqueI(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, HashMap<Domaine, ArrayList<Competence>> hmDoCoInter, String nom, String prenom, String civilite) {
		super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval, hmDoCoInter);
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
	}
}
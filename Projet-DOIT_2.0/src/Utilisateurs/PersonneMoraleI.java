package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonneMoraleI extends Intervenant {

	private int numEntreprise;
	private String raisonSociale;
	private String tailleEntreprise;

	public PersonneMoraleI(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, HashMap<Domaine, ArrayList<Competence>> hmDoCoInter, int numEntreprise, String raisonSociale, String tailleEntreprise) {
		super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval, hmDoCoInter);
		this.numEntreprise = numEntreprise;
		this.raisonSociale = raisonSociale;
		this.tailleEntreprise = tailleEntreprise;
	}
}
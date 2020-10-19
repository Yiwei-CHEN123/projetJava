package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;

public class PersonneMoraleC extends Client {
	private int numEntreprise;
	private String raisonSociale;
	private String tailleEntreprise;

	public PersonneMoraleC(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, ArrayList<Domaine> lstDomaine, ArrayList<Intervenant> lstInterFavorable, int numEntreprise, String raisonSociale, String tailleEntreprise) {
		super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval, lstDomaine, lstInterFavorable);
		this.numEntreprise = numEntreprise;
		this.raisonSociale = raisonSociale;
		this.tailleEntreprise = tailleEntreprise;
	}
}

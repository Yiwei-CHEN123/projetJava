package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;

public abstract class Utilisateur {
	private int numeroIdent;
	private String typeIdent;
	private String pays;
	private String ville;
	private String rue;
	private String codePostal;
	private String telephone;
	private String ribIban;
	private float pointEvalu;
	private ArrayList<Evaluation> lstEval; // stocker toute les evaluations recues

	public Utilisateur(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval) {
		this.numeroIdent = numeroIdent;
		this.typeIdent = typeIdent;
		this.pays = pays;
		this.ville = ville;
		this.rue = rue;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.ribIban = ribIban;
		this.pointEvalu = pointEvalu;
		this.lstEval = lstEval;
	}
}

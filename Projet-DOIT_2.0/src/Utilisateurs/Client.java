package Utilisateurs;


import Evaluation.Evaluation;

import java.util.ArrayList;
import java.util.HashMap;

public class Client extends Utilisateur{
    private ArrayList<Domaine> lstDomaine;
    private ArrayList<Intervenant> lstInterFavorable;


    public Client(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, ArrayList<Domaine> lstDomaine, ArrayList<Intervenant> lstInterFavorable) {
        super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval);
        this.lstDomaine = lstDomaine;
        this.lstInterFavorable = lstInterFavorable;
    }
}

package Utilisateurs;

import Evaluation.Evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Intervenant extends Utilisateur {
    private HashMap<Domaine, ArrayList<Competence>> hmDoCoInter; // competence possedante par intervenant

    public Intervenant(int numeroIdent, String typeIdent, String pays, String ville, String rue, String codePostal, String telephone, String ribIban, float pointEvalu, ArrayList<Evaluation> lstEval, HashMap<Domaine, ArrayList<Competence>> hmDoCoInter) {
        super(numeroIdent, typeIdent, pays, ville, rue, codePostal, telephone, ribIban, pointEvalu, lstEval);
        this.hmDoCoInter = hmDoCoInter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intervenant that = (Intervenant) o;
        return Objects.equals(hmDoCoInter, that.hmDoCoInter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hmDoCoInter);
    }
}

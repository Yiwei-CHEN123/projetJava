package Evaluation;

import Utilisateurs.Client;
import Utilisateurs.Intervenant;
import Utilisateurs.Utilisateur;

import java.util.Date;

public class Evaluation {
    private float point;
    private String commentaire;
    private Date dateEvaluation;

    private Utilisateur cible;
    private Client client;
    private Intervenant intervenant;


    public Evaluation(float point, String commentaire, Date dateEvaluation, Utilisateur cible, Client client, Intervenant intervenant) {
        this.point = point;
        this.commentaire = commentaire;
        this.dateEvaluation = dateEvaluation;
        this.cible = cible;
        this.client = client;
        this.intervenant = intervenant;
    }

    public void consulter(){
        // TODO
    };
}

package Taches;

import Utilisateurs.Client;
import Utilisateurs.Competence;
import Utilisateurs.Domaine;
import Utilisateurs.Intervenant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class TacheSimple extends Taches {
    public TacheSimple(int numTache, String nomTache, String description, String adresseTache, String paysTache, Date dateDeb, Date dateFin, int delaisPrevu, float prix, int nbrPersonne, EtatTache etat, Client client, HashMap<Intervenant, Livraison> lstIntervenantLiv, HashMap<Domaine, ArrayList<Competence>> hmDoCo) {
        super(numTache, nomTache, description, adresseTache, paysTache, dateDeb, dateFin, delaisPrevu, prix, nbrPersonne, etat, client, lstIntervenantLiv, hmDoCo);
    }
}
package Taches;
import Utilisateurs.Client;
import Utilisateurs.Competence;
import Utilisateurs.Domaine;
import Utilisateurs.Intervenant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Taches {
	private int numTache;
	private String nomTache;
	private String description;
	private String adresseTache;
	private String paysTache;
	private Date dateDeb;
	private Date dateFin;
	private int delaisPrevu;
	private float prix;
	private int nbrPersonne;
	private EtatTache etat;

	// nouveaux
	private Client client;
	private HashMap<Intervenant, Livraison> lstIntervenantLiv;
	private HashMap<Domaine, ArrayList<Competence>> hmDoCo; // competence qu'on a choisi pour un domaine

	public Taches(int numTache, String nomTache, String description) {
		this.numTache = numTache;
		this.nomTache = nomTache;
		this.description = description;
	}

	public Taches(int numTache, String nomTache, String description, String adresseTache, String paysTache, Date dateDeb, Date dateFin, int delaisPrevu, float prix, int nbrPersonne, EtatTache etat, Client client, HashMap<Intervenant, Livraison> lstIntervenantLiv, HashMap<Domaine, ArrayList<Competence>> hmDoCo) {
		this.numTache = numTache;
		this.nomTache = nomTache;
		this.description = description;
		this.adresseTache = adresseTache;
		this.paysTache = paysTache;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.delaisPrevu = delaisPrevu;
		this.prix = prix;
		this.nbrPersonne = nbrPersonne;
		this.etat = etat;
		this.client = client;
		this.lstIntervenantLiv = lstIntervenantLiv;
		this.hmDoCo = hmDoCo;
	}

	public int getNumTache() {
		return numTache;
	}

	public void setNumTache(int numTache) {
		this.numTache = numTache;
	}

	public String getNomTache() {
		return nomTache;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresseTache() {
		return adresseTache;
	}

	public void setAdresseTache(String adresseTache) {
		this.adresseTache = adresseTache;
	}

	public String getPaysTache() {
		return paysTache;
	}

	public void setPaysTache(String paysTache) {
		this.paysTache = paysTache;
	}

	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelaisPrevu() {
		return delaisPrevu;
	}

	public void setDelaisPrevu(int delaisPrevu) {
		this.delaisPrevu = delaisPrevu;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getNbrPersonne() {
		return nbrPersonne;
	}

	public void setNbrPersonne(int nbrPersonne) {
		this.nbrPersonne = nbrPersonne;
	}

	public EtatTache getEtat() {
		return etat;
	}

	public void setEtat(EtatTache etat) {
		this.etat = etat;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public HashMap<Intervenant, Livraison> getLstIntervenantLiv() {
		return lstIntervenantLiv;
	}

	public void setLstIntervenantLiv(HashMap<Intervenant, Livraison> lstIntervenantLiv) {
		this.lstIntervenantLiv = lstIntervenantLiv;
	}

	public HashMap<Domaine, ArrayList<Competence>> getHmDoCo() {
		return hmDoCo;
	}

	public void setHmDoCo(HashMap<Domaine, ArrayList<Competence>> hmDoCo) {
		this.hmDoCo = hmDoCo;
	}

	public void publierTache() {
		// TODO - implement Taches.publierTache
		throw new UnsupportedOperationException();
	}

	public void enregistrerTache() {
		// TODO - implement Taches.enregistrerTache
		throw new UnsupportedOperationException();
	}

	public void accepterTache() {
		// TODO - implement Taches.accepterTache
		throw new UnsupportedOperationException();
	}

	public void annulerTache() {
		// TODO - implement Taches.annulerTache
		throw new UnsupportedOperationException();
	}

	public void classerRetardTache() {
		// TODO - implement Taches.classerRetardTache
		throw new UnsupportedOperationException();
	}

	public void continuerTache() {
		// TODO - implement Taches.continuerTache
		throw new UnsupportedOperationException();
	}

	public void reclamerTache() {
		// TODO - implement Taches.reclamerTache
		throw new UnsupportedOperationException();
	}

	public void classerReclameTache() {
		// TODO - implement Taches.classerReclameTache
		throw new UnsupportedOperationException();
	}

	public void realiserTache() {
		// TODO - implement Taches.realiserTache
		throw new UnsupportedOperationException();
	}

	public void cloturerTache() {
		// TODO - implement Taches.cloturerTache
		throw new UnsupportedOperationException();
	}

	public void consulter() {
		// TODO - implement Taches.consulter
		throw new UnsupportedOperationException();
	}

}

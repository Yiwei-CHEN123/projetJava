package Reclamation;

import Taches.Taches;
import Utilisateurs.Client;
import Utilisateurs.Intervenant;
import Utilisateurs.Utilisateur;
import java.util.Date;

public class Reclamation {
	private int numeroRec;
	private String aviRec;
	private EtatReclamation etatRec;
	private Date dateRec;
	private Date dateTrRec;
	private String raisonRec; // pas dans DCL

	// nouveaux
	private Utilisateur demandeur;
	private Client client;
	private Intervenant intervenant;
	private Taches tache;
	private float montantRemb;

	public Reclamation(int numeroRec, String aviRec, EtatReclamation etatRec, Date dateRec, Date dateTrRec, String raisonRec, Utilisateur demandeur, Client client, Intervenant intervenant, Taches tache, float montantRemb) {
		this.numeroRec = numeroRec;
		this.aviRec = aviRec;
		this.etatRec = etatRec;
		this.dateRec = dateRec;
		this.dateTrRec = dateTrRec;
		this.raisonRec = raisonRec;
		this.demandeur = demandeur;
		this.client = client;
		this.intervenant = intervenant;
		this.tache = tache;
		this.montantRemb = montantRemb;
	}

	public EtatReclamation getEtatRec() {
		return etatRec;
	}

	public void setEtatRec(EtatReclamation etatRec) {
		this.etatRec = etatRec;
	}

	public void accepterReclamation() {
		// TODO - implement réclamation.accepterReclamation
		throw new UnsupportedOperationException();
	}

	public void refuserReclamation() {
		// TODO - implement réclamation.refuserReclamation
		throw new UnsupportedOperationException();
	}

	public void annulerReclamation() {
		// TODO - implement réclamation.annulerReclamation
		throw new UnsupportedOperationException();
	}

	public void faireReclamation() {
		// TODO - implement réclamation.faireReclamation
		throw new UnsupportedOperationException();
	}

	public void archiverReclamation() {
		// TODO - implement réclamation.archiverReclamation
		throw new UnsupportedOperationException();
	}

}

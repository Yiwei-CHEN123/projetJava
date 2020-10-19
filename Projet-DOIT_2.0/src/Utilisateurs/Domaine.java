package Utilisateurs;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Objects;

public class Domaine {
	private int numDomaine;
	private String nomDomaine;

	// nouveau
	private ArrayList<Competence> lstComp; //liste complete

	public Domaine(int numDomaine, String nomDomaine, ArrayList<Competence> lstComp) {
		this.numDomaine = numDomaine;
		this.nomDomaine = nomDomaine;
		this.lstComp = lstComp;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Domaine domaine = (Domaine) o;
		return numDomaine == domaine.numDomaine &&
				Objects.equals(nomDomaine, domaine.nomDomaine) &&
				Objects.equals(lstComp, domaine.lstComp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numDomaine, nomDomaine, lstComp);
	}


	//	public void getDomaine() {
//		// TODO - implement Domaine.getDomaine
//		throw new UnsupportedOperationException();
//	}
}

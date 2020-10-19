package Taches;

import java.util.ArrayList;

public class TacheComplexe extends Taches {
    private ArrayList<TacheMassive> lstTacheM;
    private ArrayList<TacheSimple> lstTacheS;


    public TacheComplexe(int numTache, String nomTache, String description, ArrayList<TacheMassive> lstTacheM, ArrayList<TacheSimple> lstTacheS) {
        super(numTache, nomTache, description);
        this.lstTacheM = lstTacheM;
        this.lstTacheS = lstTacheS;
    }
}
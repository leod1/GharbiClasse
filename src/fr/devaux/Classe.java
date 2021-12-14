package fr.devaux;

import objInSalle.Retroprojecteur;
import objInSalle.Tableaux;

public class Classe {
    private Tableaux tab;
    private Retroprojecteur projeteur;
    private int NbTable;
    private int NbChaise;

    public Classe(Tableaux tab, Retroprojecteur projeteur, int nbTable, int nbChaise) {
        this.tab = tab;
        this.projeteur = projeteur;
        NbTable = nbTable;
        NbChaise = nbChaise;
    }

    public Tableaux getTab() {
        return tab;
    }

    public void setTab(Tableaux tab) {
        this.tab = tab;
    }

    public Retroprojecteur getProjeteur() {
        return projeteur;
    }

    public void setProjeteur(Retroprojecteur projeteur) {
        this.projeteur = projeteur;
    }

    public int getNbTable() {
        return NbTable;
    }

    public void setNbTable(int nbTable) {
        NbTable = nbTable;
    }

    public int getNbChaise() {
        return NbChaise;
    }

    public void setNbChaise(int nbChaise) {
        NbChaise = nbChaise;
    }
}

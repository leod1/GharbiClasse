package fr.devaux;

import fr.devaux.salles.Cours;

import java.util.ArrayList;

public class Ecole {
    private ArrayList<Classe> classe;

    public Ecole(ArrayList<Classe> classe) {
        this.classe = classe;
    }

    public ArrayList<Classe> getClasse() {
        return classe;
    }

    public void setClasse(ArrayList<Classe> classe) {
        this.classe = classe;
    }

    public void sonnerClasses(){
        for (Classe a: classe) {
            if (a instanceof Cours){
                ((Cours) a).sonnerRecrer();
            }
        }
    }
}

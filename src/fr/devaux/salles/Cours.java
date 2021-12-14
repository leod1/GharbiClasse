package fr.devaux.salles;

import fr.devaux.Classe;
import objInSalle.Retroprojecteur;
import objInSalle.Tableaux;

import java.util.ArrayList;

public class Cours extends Classe {
    public Cours(Tableaux tab, Retroprojecteur projeteur, int nbTable, int nbChaise) {
        super(tab, projeteur, nbTable, nbChaise);
    }

    public void sonnerRecrer(){
        System.out.println("La récreation à sonner");
    }
    public void lancerVideoPro(){
        System.out.println("Le video pro ce lance ...");
        super.getProjeteur().setOnOff(true);
    }
    public void eteindreVideoPro(){
        System.out.println("Le video pro ce stop...");
        super.getProjeteur().setOnOff(false);
    }
    public void lancerPPW(ArrayList<String> strs){
        if (super.getProjeteur().isOnOff()){
            System.out.println("Le video pro affiche un ppt");
            super.getProjeteur().affichePowerPoint(strs);
        }
    }
}

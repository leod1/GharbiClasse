package fr.devaux;

import fr.devaux.salles.Cours;
import fr.devaux.salles.Pause;
import fr.devaux.salles.Reunions;
import objInSalle.ClimatiseurReversible;
import objInSalle.Retroprojecteur;
import objInSalle.Tableaux;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ppt = new ArrayList<>();
        ppt.add("Salut");
        ppt.add("Je suis");
        ppt.add("Un POWER POINT");
        Ecole efficom = new Ecole(new ArrayList<>());
        efficom.getClasse().add(new Cours(new Tableaux(),new Retroprojecteur(),0,0));
        efficom.getClasse().add(new Cours(new Tableaux(),new Retroprojecteur(),0,0));
        efficom.getClasse().add(new Cours(new Tableaux(),new Retroprojecteur(),0,0));
        efficom.getClasse().add(new Cours(new Tableaux(),new Retroprojecteur(),0,0));
        efficom.getClasse().add(new Cours(new Tableaux(),new Retroprojecteur(),0,0));
        efficom.getClasse().add(new Pause(new Tableaux(),new Retroprojecteur(),0,0,new ClimatiseurReversible()));
        efficom.getClasse().add(new Reunions(new Tableaux(),new Retroprojecteur(),0,0,new ClimatiseurReversible()));

        efficom.sonnerClasses();
        //Lance le vidéo pro de la première salle de cours
        ((Cours) efficom.getClasse().get(0)).lancerVideoPro();

        //Permet d'activer la clim celon la température actuelle dans la salle de pause
        ((Pause) efficom.getClasse().get(5)).getClim().setClimRevers(14);

        //Permet d'activer la clim celon la température actuelle dans la salle de reunions
        ((Reunions) efficom.getClasse().get(6)).getClim().setClimRevers(26);

        //Permet d'ajoute un powerpoint au retroprojecteur de la salle 0
        ((Cours) efficom.getClasse().get(0)).lancerPPW(ppt);

        //Permet d'ajoute un powerpoint au retroprojecteur de la salle 1
        //Mais le projecteur n'est pas allumer
        //((Cours) efficom.getClasse().get(1)).lancerVideoPro();
        ((Cours) efficom.getClasse().get(1)).lancerPPW(ppt);

    }
}

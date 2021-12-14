package fr.devaux.salles;

import fr.devaux.Classe;
import objInSalle.ClimatiseurReversible;
import objInSalle.Retroprojecteur;
import objInSalle.Tableaux;

public class Pause extends Classe {
    private ClimatiseurReversible clim;

    public Pause(Tableaux tab, Retroprojecteur projeteur, int nbTable, int nbChaise, ClimatiseurReversible clim) {
        super(tab, projeteur, nbTable, nbChaise);
        this.clim = clim;
    }

    public ClimatiseurReversible getClim() {
        return clim;
    }

    public void setClim(ClimatiseurReversible clim) {
        this.clim = clim;
    }
}

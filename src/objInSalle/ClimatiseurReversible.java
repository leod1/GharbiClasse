package objInSalle;

public class ClimatiseurReversible {
    private int temp = 21;
    private boolean climOrHeat;

    public void setClimRevers(int tempActual){
        if (tempActual>temp){
            climOrHeat = true;
            System.out.println("Le climatiseur s'active");
        }else if (tempActual<temp){
            climOrHeat = false;
            System.out.println("Le radiateur s'active");
        }
    }
}

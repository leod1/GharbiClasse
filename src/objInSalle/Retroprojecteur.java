package objInSalle;

import java.util.ArrayList;

public class Retroprojecteur {
    private boolean OnOff;

    public Retroprojecteur() {
        OnOff = false;
    }

    public void affichePowerPoint(ArrayList<String> strs){
        for (String str: strs) {
            System.out.println(str);
        }
    }

    public void setOnOff(boolean onOff) {
        OnOff = onOff;
    }

    public boolean isOnOff() {
        return OnOff;
    }
}

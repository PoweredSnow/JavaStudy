import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;
    // private int numOfHits = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        return result;
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class Randomiser {


    public static String randName() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Barry");
        names.add("Larry");
        names.add("Gary");
        names.add("Harry");
        names.add("Terri");
        names.add("Geri");


        Collections.shuffle(names);
        return names.get(0);
    }


}

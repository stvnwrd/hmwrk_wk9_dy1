import java.util.ArrayList;
import java.util.Collections;

public class Randomiser {


    public static String one() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Barry");
        names.add("Larry");
        names.add("Gary");
        names.add("Harry");

        Collections.shuffle(names);
        return names.get(0);

    }
}

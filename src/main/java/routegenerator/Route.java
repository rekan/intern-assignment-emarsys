package routegenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {

    public static List<String> generateRoute(List<Destination> destinations) {
        Collections.sort(destinations, new DestinationComparator());
        List<String> result = new ArrayList<String>();
        for (Destination d: destinations) {
            result.add(d.getName());
        }
        return result;
    }
}

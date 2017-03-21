package routegenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {

//    This method makes use of the Collections.sort() method by using a custom Comparator.
//    However, due to the the Collections.sort() sorting algorithm this version cannot always
//    produce the expected result, as Collections.sort() does not compare each and every
//    possible pair in the list.
    public static List<String> generateRouteSort(List<Destination> destinations) {
        Collections.sort(destinations, new DestinationComparator());
        List<String> result = new ArrayList<String>();
        for (Destination d: destinations) result.add(d.getName());
        return result;
    }

//    This method implements a sorting algorithm. However, this is not a fully working version.
//    Whether the result is correct depends on the input at the moment.
    public static List<String> generateRoute(List<Destination> destinations) {
        List<Destination> ordered = new ArrayList<Destination>();
        ordered.add(destinations.get(0));
        for (int i = 0; i < destinations.size(); i++) {
            Destination d = destinations.get(i);
            for (int j = 0; j < destinations.size(); j++) {
                Destination current = destinations.get(j);
                if (d.getDependency() != null &&
                        d.getDependency().getName().equals(current.getName())) {
                    if (!ordered.contains(current)) {
                        ordered.add(i, current);
                    }
                    if (!ordered.contains(d)) {
                        ordered.add(d);
                    }
                } else if (current.getDependency() != null &&
                        current.getDependency().getName().equals(d.getName())) {
                            if (!ordered.contains(d)) {
                                ordered.add(i, d);
                            }
                            if (!ordered.contains(current)) {
                                ordered.add(current);
                            }
                }
                if (!ordered.contains(d)) {
                    ordered.add(d);
                }
            }
        }
        List<String> result = new ArrayList<String>();
        for (Destination d: ordered) result.add(d.getName());
        return result;
    }
}

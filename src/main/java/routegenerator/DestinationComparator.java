package routegenerator;

import java.util.Comparator;

public class DestinationComparator implements Comparator<Destination> {

    public int compare(Destination d1, Destination d2) {
        if (d1.getDependency() != null || d2.getDependency() != null) {
            if (d1.getDependency() != null && d1.getDependency().getName().equals(d2.getName())) {
                return 1;
            } else if (d2.getDependency() != null && d2.getDependency().getName().equals(d1.getName())) {
                return -1;
            }
        }
        return 0;
    }
}

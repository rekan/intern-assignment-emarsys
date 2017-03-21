package routegenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Destination t = new Destination("t");
        Destination u = new Destination("u");
        Destination v = new Destination("v");
        Destination w = new Destination("w");
        Destination x = new Destination("x");
        Destination y = new Destination("y");
        Destination z = new Destination("z");
//        y.setDependency(z);
//        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(x, y, z));
        v.setDependency(w);
        w.setDependency(z);
        x.setDependency(u);
        y.setDependency(v);
        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(u, v, w, x, y, z));
//        y.setDependency(u);
//        t.setDependency(y);
//        x.setDependency(z);
//        v.setDependency(w);
//        w.setDependency(t);
//        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(t, u, v, w, x, y, z));
        System.out.println(Route.generateRouteSort(allDest));
        System.out.println(Route.generateRoute(allDest));
    }
}

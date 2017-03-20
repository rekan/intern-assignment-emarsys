import java.util.ArrayList;
import java.util.List;

public class Route {

    public static List<String> generateRoute(List<Destination> destinations) {
        List<String> result = new ArrayList<String>();
        for (Destination d: destinations) {
            result.add(d.getName());
        }
        return result;
    }
}

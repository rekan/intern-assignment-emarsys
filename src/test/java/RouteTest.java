import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RouteTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void generateRoute_oneDestination_returnsOneDestination() throws Exception {
        Destination x = new Destination("x");
        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(x));
        assertEquals(Arrays.asList(x), Route.generateRoute(allDest));
    }

    @Test
    public void generateRoute_multipleDestinations_returnsUnorderedList() throws Exception {
        Destination x = new Destination("x");
        Destination y = new Destination("y");
        Destination z = new Destination("z");
        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(x, y, z));
        assertEquals(Arrays.asList(x, y, z), Route.generateRoute(allDest));
    }
}
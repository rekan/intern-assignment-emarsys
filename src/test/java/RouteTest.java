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
        Destination a = new Destination("a");
        List<Destination> allDest = new ArrayList<Destination>(Arrays.asList(a));
        assertEquals(Arrays.asList(a), Route.generateRoute(allDest));
    }

}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() throws Exception {

        guest = new Guest("Dave");

    }

    @Test
    public void hasName() {
        assertEquals("Dave", guest.getName());
    }
}

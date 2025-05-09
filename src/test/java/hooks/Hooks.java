package hooks;

import com.latam.drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initBrowser();
    }

    @After
    public void tearDown() {
        DriverFactory.closeBrowser();
    }
}

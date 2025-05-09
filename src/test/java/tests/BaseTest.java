package tests;

import com.latam.drivers.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp() {
        DriverFactory.initBrowser();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.closeBrowser();
    }
}
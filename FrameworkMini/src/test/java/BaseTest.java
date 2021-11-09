import driver.DriverRepository;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    //перед всіма тестами відкривається браузер
    @BeforeSuite
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    //перед кожним тестом відкривається браузер
    @BeforeClass
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }

    //після кожного тесту закривається браузер
    @AfterSuite
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}

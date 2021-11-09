package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepository {

    //потокобезпечність
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    //інтерфейс для доступу методів під хром
    private static WebDriver webDriver;

    //нам не потрібні його екземпляри
    private DriverRepository() {
    }

    //завантажуємо драйвер хрому
    public static void downloadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    //піднімаємо/відкриваємо вікно хром
    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    //знести/закрити вікно хрому
    public static void closeBrowser() {
        webDriver.quit();
    }
}

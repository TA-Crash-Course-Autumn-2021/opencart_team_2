package pages;

import driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //інтерфейс для доступу методів під хром
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        //отримати веб-драйвер
        driver = DriverRepository.DRIVERS.get();
        wait = new WebDriverWait(driver, 300);
        //передати обєкт який перелитить по наслідуванню
        //і всі обєкти які там є
        //стануть доступними для нас
        PageFactory.initElements(driver, this);
    }
}

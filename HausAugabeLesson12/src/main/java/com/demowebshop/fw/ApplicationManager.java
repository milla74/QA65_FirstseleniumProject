package com.demowebshop.fw;

import com.demowebshop.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {

    private String browser;
    private WebDriver driver;
    private Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    private UserHelper user;
    private ContactHelper contact;
    private HomePageHelper home;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                logger.info("Tests start in Chrome browser");
                break;
            case "firefox":
                driver = new FirefoxDriver();
                logger.info("Tests start in Firefox browser");
                break;
            case "edge":
                driver = new EdgeDriver();
                logger.info("Tests start in Edge browser");
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/register");
        logger.info("Current url --> " + driver.getCurrentUrl());

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        home = new HomePageHelper(driver);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed");
        }
    }

    public UserHelper getUser() {
        return user;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public HomePageHelper getHome() {
        return home;
    }
}

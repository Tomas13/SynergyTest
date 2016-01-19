package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jean on 1/13/2016.
 */

public class SynergyTest {

    public static WebDriver driver = new FirefoxDriver();

    public static void main(String[] args) {

        driver.get("http://demo.arta.kz/");

        SynergyPageObjects pageSynergy = new SynergyPageObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pageSynergy.LoginSynergy();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pageSynergy.btnCreateProject.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pageSynergy.CreateProject();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pageSynergy.btnCreate.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.quit();
    }


}

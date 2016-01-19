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

        //Заходим на ресурс
        driver.get("http://demo.arta.kz/");

        //создаем объект страницы для работы с её компонентами
        SynergyPageObjects pageSynergy = new SynergyPageObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Осуществляем Логин с паролем и логином 111111
        pageSynergy.LoginSynergy();

        //Ждем пока страница загрузится
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Нажимаем кнопку создания проекта
        pageSynergy.btnCreateProject.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Заполняем необходимые поля, Work Statement и Assignee
        pageSynergy.CreateProject();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Создаем проект
        pageSynergy.btnCreate.click();

//        driver.quit();
    }


}

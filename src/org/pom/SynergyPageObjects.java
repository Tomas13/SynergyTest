package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jean on 1/19/2016.
 */
public class SynergyPageObjects {

    public SynergyPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@id='synergy_div']/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/div")
    public WebElement btnCreateProject;

    @FindBy(xpath = ".//*[@id='login']")
    public WebElement txtLogin;

    @FindBy(xpath = ".//*[@id='pswd']")
    public WebElement txtPassword;

    @FindBy(xpath = ".//*[@id='submit_button']")
    public WebElement btnLogin;

    @FindBy(xpath = "html/body/div[14]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[1]/table[1]/tbody/tr[2]/td/textarea")
    public WebElement workStatement;

    @FindBy(xpath = "html/body/div[14]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/div")
    public WebElement btnCreate;

    @FindBy(xpath = "html/body/div[16]/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/div/div[3]/div/div[2]/div/table/tbody/tr[3]/td/div/div/table/tbody/tr[1]/td[2]")
    public WebElement executor;

    @FindBy(xpath = "html/body/div[16]/div/table/tbody/tr[2]/td/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/div")
    public WebElement btnChoose;

    @FindBy(xpath = "html/body/div[14]/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[1]/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/img")
    public WebElement executorChoose;


    public void LoginSynergy(){
        txtLogin.sendKeys("111111");
        txtPassword.sendKeys("111111");
        btnLogin.click();
    }

    public void CreateProject(){
        workStatement.sendKeys("work statement");
        executorChoose.click();
        executor.click();
        btnChoose.click();
    }



}

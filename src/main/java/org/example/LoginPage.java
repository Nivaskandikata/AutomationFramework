package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //*******************Locators********************

    //the below is an webelement of user name field
    @FindBy(xpath = "//input[@id='username']")
    WebElement userNameFld;

    //the below element is a password field
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordFld;

    //the below element is a login button
    @FindBy(id = "login-btn")
    WebElement loginBtn;



    //************************ Action ********************

    public void verifyLogin(String userName, String password){
        userNameFld.sendKeys(userName);
        passwordFld.sendKeys(password);
        loginBtn.click();
    }

}

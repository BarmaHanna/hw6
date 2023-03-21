package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobile {
    public ChromeDriver driver;

    public Mobile (ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, '1')]")
    private WebElement elMobField;
    @FindBy(xpath = "//*[contains(text(), '2')]/..")
    private WebElement compMobField;
    @FindBy(xpath = "//*[contains(@id, '3')]")
    private WebElement houseMobField;
    @FindBy(xpath = "//*[contains(@id, '4')]")
    private WebElement constMobField;
    @FindBy(xpath = "//*[contains(text(), '5')]/..")
    private WebElement gardMobField;
    @FindBy(xpath = "//*[contains(@id, '6')]")
    private WebElement autoMobField;
    @FindBy(xpath = "//*[contains(@id, '7')]")
    private WebElement beautyMobField;
    @FindBy(xpath = "//*[contains(@id, '8')]")
    private WebElement childMobField;
    //Работа и офис, Еда в мобильной версии отсутсвуют
    @FindBy(xpath = "//*[contains(text(), 'Работа и офис')]/..")
    private WebElement workMobField;
    @FindBy(xpath = "//*[contains(@id, 'Еда')]")
    private WebElement foodMobField;

    public void inputEl(String electronics) {
        elMobField.sendKeys(electronics);
    }

    public void inputComp(String computer) {
        compMobField.sendKeys(computer);
    }

    public void inputHouse(String house) {
        houseMobField.sendKeys(house);
    }

    public void inputConst(String construction) {
        constMobField.sendKeys(construction);
    }

    public void inputGarden(String garden) {
        gardMobField.sendKeys(garden);
    }

    public void inputAuto(String auto) {
       autoMobField.sendKeys(auto);
    }

    public void inputBeauty(String beauty) {
        beautyMobField.sendKeys(beauty);
    }

    public void inputChild(String child) {
        childMobField.sendKeys(child);
    }

    public void inputWork(String work) {
        workMobField.sendKeys(work);
    }

    public void inputFood(String food) {
        foodMobField.sendKeys(food);
    }
}




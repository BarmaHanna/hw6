package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {
    public ChromeDriver driver;

    public CatalogPage(ChromeDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'Электроника')]")
    private WebElement elField;
    @FindBy(xpath = "//*[contains(text(), 'Компьютеры и сети')]/..")
    private WebElement compField;
    @FindBy(xpath = "//*[contains(@id, 'Бытовая техника')]")
    private WebElement houseField;
    @FindBy(xpath = "//*[contains(@id, 'Стройка и ремонт')]")
    private WebElement constField;
    @FindBy(xpath = "//*[contains(text(), 'Дом и сад')]/..")
    private WebElement gardField;
    @FindBy(xpath = "//*[contains(@id, 'Авто и мото')]")
    private WebElement autoField;
    @FindBy(xpath = "//*[contains(@id, 'Красота и спорт')]")
    private WebElement beautyField;
    @FindBy(xpath = "//*[contains(@id, 'Детям и мамам')]")
    private WebElement childField;
    @FindBy(xpath = "//*[contains(text(), 'Работа и офис')]/..")
    private WebElement workField;
    @FindBy(xpath = "//*[contains(@id, 'Еда')]")
    private WebElement foodField;

    public void inputEl(String electronics) {
        elField.sendKeys(electronics);
    }

    public void inputComp(String computer) {
        compField.sendKeys(computer);
    }

    public void inputHouse(String house) {
        houseField.sendKeys(house);
    }

    public void inputConst(String construction) {
        constField.sendKeys(construction);
    }

    public void inputGarden(String garden) {
        gardField.sendKeys(garden);
    }

    public void inputAuto(String auto) {
        autoField.sendKeys(auto);
    }

    public void inputBeauty(String beauty) {
        beautyField.sendKeys(beauty);
    }

    public void inputChild(String child) {
        childField.sendKeys(child);
    }

    public void inputWork(String work) {
        workField.sendKeys(work);
    }

    public void inputFood(String food) {
        foodField.sendKeys(food);
    }
}
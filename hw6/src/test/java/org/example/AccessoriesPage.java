package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {
    public WebDriver driver;
    public AccessoriesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'name')]")
    private WebElement nameField;
    @FindBy(xpath = "//*[contains(@class, 'quantity')]")
    private WebElement quantityField;
    @FindBy(xpath = "//*[contains(@class, 'minPrice')]")
    private WebElement minPriceField;

    public void getNameField() {
        String name = nameField.getText();
    }
    public void getQuantityField() {
        String quantity = quantityField.getText();
        }
    public void getMinPriceField() {
        String minPrice = minPriceField.getText();
         }

}

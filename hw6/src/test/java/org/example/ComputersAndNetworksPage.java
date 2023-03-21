package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersAndNetworksPage {
    public WebDriver driver;
    public ComputersAndNetworksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'Ноутбуки,компьютеры, мониторы')]")
    private WebElement noteField;
    @FindBy(xpath = "//*[contains(@class, 'Комплектующие')]")
    private WebElement accessoriesField;
    @FindBy(xpath = "//*[contains(@class, 'Хранение данных')]")
    private WebElement dataField;
    @FindBy(xpath = "//*[contains(@class, 'Сетевое оборудование')]")
    private WebElement equipField;

    public String getNoteField() {
        String note = noteField.getText();
        return note; }
    public String getAccessoriesField() {
        String accessories = accessoriesField.getText();
        return accessories; }
    public String getDataField() {
        String data = dataField.getText();
        return data; }
    public String getEquipField() {
        String equipment = equipField.getText();
        return equipment; }
}

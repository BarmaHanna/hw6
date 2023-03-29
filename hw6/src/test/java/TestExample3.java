import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestExample3 {
    private static ChromeOptions chromeOptions = new ChromeOptions();

    @Test
    public void test() {
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        chromeOptions.addArguments("--remote-allow-origins=*", "игнорировать-сертификат-ошибки");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://catalog.onliner.by");
        driver.findElement(By.xpath("//*[@data-id='2']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[@data-id='1']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[contains(@class, 'name')]"));
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[contains(@class, 'quantity')]"));
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[contains(@class, 'minPrice')]"));
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");

        driver.quit();



}


}
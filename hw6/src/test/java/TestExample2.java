import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestExample2 {
    private static ChromeOptions chromeOptions = new ChromeOptions();

    @Test
    public void test() {
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        chromeOptions.addArguments("--remote-allow-origins=*", "игнорировать-сертификат-ошибки");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://catalog.onliner.by");
        driver.findElement(By.xpath("//*[@id='container']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[@data-id='12']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[@data-id='1']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[@data-id='4']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.xpath("//*[@data-id='6']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        driver.quit();


    }
}



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestExample1 {
    private static ChromeOptions chromeOptions = new ChromeOptions();

    @Test
    public void test() {
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        chromeOptions.addArguments("--remote-allow-origins=*", "игнорировать-сертификат-ошибки");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://catalog.onliner.by");
        //Электроника
        driver.findElement(By.xpath("//*[@data-id='1']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        //Компьютеры и сети
        driver.findElement(By.xpath("//*[@data-id='2']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        //Бытовая техника
        driver.findElement(By.xpath("//*[@data-id='3']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        //Стройка и ремонт
        driver.findElement(By.xpath("//*[@data-id='4']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        // Дом и сад
        driver.findElement(By.xpath("//*[@data-id='5']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        // Авто и мото
        driver.findElement(By.xpath("//*[@data-id='6']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        // Красота и спорт
        driver.findElement(By.xpath("//*[@data-id='7']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        // Детям и мамам
        driver.findElement(By.xpath("//*[@data-id='8']")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        //Работа и офис и Еда не находит тест, поэтому падает с ошибкой NoSuchElement
        // Работа и офис
        //driver.findElement(By.xpath("//*[@data-id='Работа и офис']")).click();
        //((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");
        // Еда
        //driver.findElement(By.xpath("//*[@data-id='Еда']")).click();
        //((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)");

        driver.quit();


        }
    }



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selectors {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void WikiElementsTest() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='js-link-box-ru']")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }

}

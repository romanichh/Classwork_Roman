import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends TestBase{

    @Test
    public void openChromeTest(){
    driver.get("https://www.tel-ran.com/");
        maximize();
    }

    @Test
    public void openWikipediaTest() throws InterruptedException {
        openSite("https://www.wikipedia.org/");
        maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("Java");
        driver.findElement(By.className("svg-search-icon")).click();
        Thread.sleep(5000);

    }

}

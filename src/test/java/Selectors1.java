import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors1 extends TestBase {

    @Test
    public void WikiElementsTest() throws InterruptedException {
        openSite("https://www.wikipedia.org/");
        maximize();
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='js-link-box-ru']")).click();
        Thread.sleep(5000);

    }

}

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selectors extends TestBase {

    @Test
    public void WikiElementsTest() throws InterruptedException {

        openSite("https://www.wikipedia.org/");
        maximize();
        //select lang by css
        driver.findElement(By.cssSelector("#js-link-box-ru")).click();
        //back
        driver.navigate().back();
        //select lang by xpath
        driver.findElement(By.xpath("//*[@id='js-link-box-ru']")).click();

    }

}

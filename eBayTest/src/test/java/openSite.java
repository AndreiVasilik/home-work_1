import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class openSite {
    WebDriver wd;

    @BeforeClass
    public void setUp()
    {
        wd = new ChromeDriver();
    }

    @Test
    public void HomePage()
    {
        wd.navigate().to("https://www.ebay.com/");

        String actual = wd.getCurrentUrl();

        Assert.assertEquals(actual,"https://www.ebay.com/");
    }

    @AfterClass

    public void tearDown()
    {
        wd.quit();
    }
}

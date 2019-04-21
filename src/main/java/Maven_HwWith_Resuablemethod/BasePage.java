package Maven_HwWith_Resuablemethod;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\Maven_HwWith_Resuablemethod\\chromedriver.exe");
        driver = new ChromeDriver();//getting chrome browser
        //implicit wait applied
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       //asking driver to get URL
        driver.get("https://demo.nopcommerce.com/login");
        //driver manage the window to maximise
        //driver.manage.window.maximise();
    }
    @After
    public void closeBrowser () {
        driver.close();
    }
}

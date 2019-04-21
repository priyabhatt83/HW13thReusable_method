package Maven_HwWith_Resuablemethod;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class NopCom_ReusableMethod extends Utils{


  //protected static WebDriver driver;

    static String getCurrentDateTime() {
        //create object for simple date format class and decide format

        DateFormat dateFormat = new SimpleDateFormat("MMDDYYYY");
        //get current date time with date
        Date date = new Date();
        //new format for date
        String date1 = dateFormat.format(date);
        System.out.println("Current date and time is " + date1);
        return date1;
    }

//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","src\\main\\java\\Maven_HwWith_Resuablemethod\\chromedriver.exe");
//        driver = new ChromeDriver();//getting new chrome driver
//        //apply implicit wait
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://demo.nopcommerce.com/");

  //  }

    @Test

    public void userShouldRegisterSuccessfully() {
        // opening register page on nopcommerce
        //driver.get("http://demo.nopcommerce.com/register");

        //click on register button
        clickElementBy(xpath("//a[@class='ico-register']"));
        //driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Select gender
        clickElementBy(xpath("//input[@id='gender-female']"));
        //driver.findElement(By.xpath("//input[@id='gender-female']")).click();

        //enter given first name
        enterText(xpath("//input[@name='FirstName']"),"alpha");
        //driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("alpha");

        //enter given last name
        enterText(xpath("//input[@id='LastName']"),"gabby");
        //driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("gabby");

        //enter given email
        enterText(xpath("//input[@name='Email']"),"aarav" + getCurrentDateTime() + "@last.com");
        //driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("aarvi" + getCurrentDateTime() + "@last.com");

        //enter given password
        enterText(xpath("//input[@id='Password']"),"done123");
        //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("done123");

        //enter given confirm password
        enterText(xpath("//input[@id='ConfirmPassword']"),"done123");
        //driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("done123");

        //click on registration button
         clickElementBy(xpath("//input[@value='Register']"));
        //driver.findElement(By.xpath("//input[@value='Register']")).click();

        //your should able to login successfully able to see message
        getActualText(xpath("//div[@class='result']"));
        //String actualRegistrationSuccess = driver.findElement(xpath("//div[@class='result']")).getText();
        validation("Your registration completed");
        //Assert.assertEquals("Your registration completed", actualRegistrationSuccess);

        System.out.println("User is Registered Successfully");
    }

    @Test
    public void userShouldAbleTologInSuccessfully()
    {
        //click on login button
        clickElementBy(By.xpath("//a[@class='ico-login']"));
       // driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //enter given email
        enterText(By.xpath("//input[@name='Email']"),"alpha@test.com");
        //driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("alpha@test.com");

        //enter given password
        enterText(By.xpath("//input[@id='Password']"),"done123");
        //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("done123");

        //click on log in button
        clickElementBy(By.xpath("//input[@value='Log in']"));
        //driver.findElement(By.xpath("//input[@value='Log in']")).click();

        //actual result
//        String actualresult = driver.findElement(By.linkText("Log out")).getText();
        getActualText(By.linkText("Log out"));
//        Assert.assertEquals("Log out",actualresult);
        validation("Log out");

        System.out.println("User logged in successfully");
    }

    @Test
    public void userShouldNavigateToComputerCategory()
    {
        //click on computer link
        clickElementBy(By.linkText("Computers"));
        //driver.findElement(By.linkText("Computers")).click();

        //click on notebook
        clickElementBy(By.partialLinkText("Notebooks"));
        //driver.findElement(By.partialLinkText("Notebooks")).click();

        //actual result
        //String actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Notebooks')]")).getText();
        getActualText(By.xpath("//h1[contains(text(),'Notebooks')]"));
        validation("Notebooks");

        System.out.println(" User is on Notebook Page");
    }
    @Test
    public void userShouldNavigateToElectronicsPage()
    {
        //select electronics category
        clickElementBy(By.linkText("Electronics"));
        //driver.findElement(By.linkText("Electronics")).click();

        //click on cellphones
        clickElementBy(By.partialLinkText("Cell phones"));
        //driver.findElement(By.partialLinkText("Cell phones")).click();

        //actual result
        //String actualresult = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        getActualText(By.xpath("//div[@class='page-title']"));
        validation("Cell phones");

        System.out.println("User is on CellPhones page");
    }
    @Test
    public void userShouldAbleToAddItemToCart()
    {
        //select books category
        clickElementBy(By.linkText("Books"));
        //driver.findElement(By.linkText("Books")).click();

        //select book named pride and prejudice
        clickElementBy(By.partialLinkText("Pride and Prejudice"));
        //driver.findElement(By.partialLinkText("Pride and Prejudice")).click();

        //click on add to cart
        clickElementBy(By.xpath("//input[@id='add-to-cart-button-39']"));
        //driver.findElement(By.xpath("//input[@id='add-to-cart-button-39']")).click();

        //actual result
        //String actualresult = driver.findElement(By.xpath("//p[@class='content']")).getText();
        getActualText(By.xpath("//p[@class='content']"));
        //Assert.assertEquals("The product has been added to your shopping cart",actualresult);
        validation("The product has been added to your shopping cart");

        System.out.println("The product has been added to your shopping cart");
    }

//    @After
//    public void closeBrowser () {
//        driver.close();
//    }

}






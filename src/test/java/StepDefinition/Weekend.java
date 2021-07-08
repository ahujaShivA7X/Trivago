package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Weekend {

    public WebDriver driver;


    public void waitAndClick(String object) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(object))).click();
    }

    public void waitAndType(String object, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(object))).sendKeys(text);
    }

    public void Init() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://weekend.trivago.co.uk/");

    }

    @Given("^Go to the website$")
    public void go_to_the_website() throws Throwable {
        Init();
    }

    @Given("^Enter the name of the destination$")
    public void enter_the_name_of_the_destination() throws Throwable {
        waitAndClick("//*[contains(text(),'Set current city or town')][1]");
        waitAndType("//input[@type='search']","Manchester");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
    }

    @Then("^Click on View Deal$")
    public void click_on_View_Deal() throws Throwable {
        waitAndClick("//body/div[@id='__next']/main[@class='Page_container__fganZ']/div[@class='Inspiration_container__11ZhC']/ul[@class='Inspiration_itemList__1xirE']/li[1]/div[2]/section[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]/span[1]");
        driver.quit();
    }

}

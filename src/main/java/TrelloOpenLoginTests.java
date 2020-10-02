import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TrelloOpenLoginTests {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
        wd.findElement(By.cssSelector("[href='/login']")).click();
    }

    @Test
    public void loginTest()throws InterruptedException{

        System.out.println("Trello opened");
        Thread.sleep(6000);

        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys("lyubov.yapparova@gmail.com");
        Thread.sleep(6000);
        wd.findElement(By.id("login")).click();
        Thread.sleep(6000);
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("holopenio21");

        wd.findElement(By.id("login-submit")).click();

    }
    @AfterClass
    public void tearDown(){
        wd.quit();
    }

}

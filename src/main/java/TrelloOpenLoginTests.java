import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.B
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class TrelloOpenLoginTests {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");
        wd.findElement(By.cssSelector("[href='/login']")).click();
    }

//    @Test
//    public void searchTest() {
//
//
//
//
//
//    }

    @Test
    public void loginTest(){

        System.out.println("Trello opened");
//        List<WebElement> elements = wd.findElements(By.cssSelector("*"));
//
//        System.out.println("Number of elements:" +elements.size());
//
//        for (int i=0; i<elements.size();i++){
//            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//        }
//
//        java.util.Iterator<WebElement> i = elements.iterator();
//        while(i.hasNext()) {
//            WebElement row = i.next();
//            System.out.println("element:" + row.getText());
//        }
//        wd.FindElement(By.CssSelector("input[type='password']")).SendKeys("kuku");
        WebElement Password = wd.findElement(By.cssSelector("input[id=user]"));
        Password.sendKeys("hello@sampleemail.com");

//        WebElement psswd_field=wd.findElement(By.name("password"));
//        psswd_field.sendKeys("kuku");
//        WebElement email_field=wd.findElement(By.name("user"));
//        email_field.sendKeys("lyubov.yapparova@gmail.com");
//        wd.findElement(By.name("user")).click();
//        wd.findElement(By.id("user")).clear();
//        wd.findElement(By.id("user")).sendKeys("lyubov.yapparova@gmail.com");

    }
//    @AfterClass
//    public void tearDown(){
//        wd.quit();
//    }

}

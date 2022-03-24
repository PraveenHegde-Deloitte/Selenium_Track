import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Assignment_3_A {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Google
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        //Url of the website
        driver.get("https://the-internet.herokuapp.com/");


        //frames
        By frames = By.xpath("/html/body/div[2]/div/ul/li[22]/a");
        driver.findElement(frames).click();


        //nestedframe
        frames = By.xpath(" /html/body/div[2]/div/div/ul/li[1]/a");
        driver.findElement(frames).click();

        //Getting LEFT
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement l = driver.findElement(By.cssSelector("body"));
        System.out.println(l.getText());



    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Assignment_3_C {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Google
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        //Url of the website
        driver.get("https://the-internet.herokuapp.com/ ");

        //Click on JavaScript Alerts
        By alerts = By.xpath("/html/body/div[2]/div/ul/li[29]/a");
        driver.findElement(alerts).click();

        //Click on JS prompt
        By prompt = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");
        driver.findElement(prompt).click();
        driver.switchTo().alert().sendKeys("Text");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        String str = driver.findElement(By.id("result")).getText();
        if (str.contains("Text"))
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("not same");
        }
    }
}

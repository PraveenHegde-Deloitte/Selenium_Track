import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Assignment_3_B
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Google
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        //Url of the website
        driver.get("https://jqueryui.com/droppable/ ");

        //Drag and Drop
        Actions l=new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement from=driver.findElement(By.id("draggable"));
        WebElement to=driver.findElement(By.id("droppable"));
        l.dragAndDrop(from,to).perform();



    }
}

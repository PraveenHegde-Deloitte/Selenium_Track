import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Assignment_3_D {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Google
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        //Url of the website
        driver.get("https://www.goibibo.com/");

        //Select Round Trip
        By sel = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/ul/li[2]/span[2]");
        driver.findElement(sel).click();

        //Selecting flight

        // From
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p")).click();
        WebElement from =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input"));
        from.sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/ul/li[1]/div/div[1]/div/p[1]/span[1]")).click();

        // To
        from=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input"));
        from.sendKeys("Seattle");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class='sc-bBHHxi cTvqKV'   and contains(text(),'Seattle/Tacoma Intl-WA')]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//a[@class='sc-dtMgUX daltrV']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[4]/div[2]/div[3]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[2]/div[3]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[3]/span")).click();

        //cheapest flight
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/span/span")).click();
        driver.findElement(By.xpath("")).click();






    }
}

//By f = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div/div[2]/div/input");
//driver.findElement(f).click();
//from.sendKeys("New York");

//WebElement to = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/input"));
// driver.findElement((By) to).click();
// from.sendKeys("Seattle");
//Thread.sleep(3000);
// driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/ul/li[1]/div/div[1]/div/p[1]/span[1]"));
//driver.switchTo().equals("Seattle");
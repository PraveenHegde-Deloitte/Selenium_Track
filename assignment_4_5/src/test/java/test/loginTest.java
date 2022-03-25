package test;
import Assignment_4.login;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class loginTest
{
    static WebDriver driver;
    login l;
    static ArrayList<String> email=new ArrayList<>();
    static ArrayList<String> pass=new ArrayList<>();

    @BeforeClass
    public static void aset_up() throws  IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
    @Test
    public void test() throws InterruptedException {
        l = new login(driver);
        l.username();
        l.setPassword();
        l.click();
        List<WebElement> li = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        Thread.sleep(3000);
        for (int i = 0; i < li.size(); i++) {
            String str = li.get(i).getText();
            str=str.replace(" ","-");
            System.out.println(str);
        }
        List<WebElement> pr = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        Thread.sleep(3000);
        float check=0;
        for (int i = 0; i < pr.size(); i++) {
            String str1 = pr.get(i).getText().replace("$","");
            float price= Float.parseFloat(str1);
            if(check<price){
                check=price;
            }
            System.out.println(check);

        }
    }
    @AfterClass
    public void end(){
        driver.quit();
    }


}



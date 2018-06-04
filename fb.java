import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.*;
import java.util.List;

import static java.lang.Thread.sleep;

public class AutoTest {
    public static void main(String [] args) {
	facebookLoginNotification();
    }
    public static void facebookLoginNotification(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kabil\\Downloads\\Telegram Desktop\\SE II\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.id("loginbutton"));

        email.sendKeys("PhoneNumber"); //For privacy
        password.sendKeys("XXXXXXXXXXXXXXXXX");//For privacy
        loginBtn.click();
        WebElement notificationsCountValue = driver.findElement(By.id("notificationsCountValue"));
        System.out.println("Current NOTIFICATIONS VALUE "+notificationsCountValue.getText());
        try{
            sleep(5000);
        }catch (Exception e){

        }


        driver.close();
    }
}
package sample.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser 
{

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
}

}
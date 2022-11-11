import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AssertionFailureBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class ClassButtonTest {
    String url ="https://ttiennguyen.github.io/btn/index.html";

    @Test
    public void testCase1(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.className("page-header"));
        assertEquals("This page test button",header.getText());
        driver.quit();
    }

    @Test
    public void testCase2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.className("page-header"));
        assertEquals("30px",header.getCssValue("font-size"));
        assertEquals("rgba(65, 105, 225, 1)",header.getCssValue("color"));
        driver.quit();
    }

    @Test
    public void testCase3(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.className("page-header"));
        assertEquals("center",header.getCssValue("text-align"));
        driver.quit();
    }

    @Test
    public void testCase4(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn1 = driver.findElement(By.id("btnContact"));
        btn1.click();
        driver.quit();
    }

    @Test
    public void testCase5(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn1 = driver.findElement(By.id("btnContact"));
        assertEquals("rgba(0, 128, 0, 1)",btn1.getCssValue("color"));
        driver.quit();
    }

    @Test
    public void testCase6(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn1 = driver.findElement(By.id("btnContact"));
        assertEquals("20px",btn1.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void testCase7(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement btn1 = driver.findElement(By.id("btnContact"));
        WebElement p = driver.findElement(By.id("contact"));

        btn1.click();
        assertEquals("FaceBook",p.getText());
        driver.quit();
    }

    @Test
    public void testCase8(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn2 = driver.findElement(By.id("btnPhone"));
        btn2.click();
        driver.quit();
    }

    @Test
    public void testCase9(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn2 = driver.findElement(By.id("btnPhone"));
        assertEquals("rgba(255, 192, 203, 1)",btn2.getCssValue("color"));
        driver.quit();
    }

    @Test
    public void testCase10(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn2 = driver.findElement(By.id("btnPhone"));
        assertEquals("20px",btn2.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void testCase11(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement btn2 = driver.findElement(By.id("btnPhone"));
        WebElement p = driver.findElement(By.id("phone"));

        btn2.click();
        assertEquals("09xxxxxxxx",p.getText());
        driver.quit();
    }

    @Test
    public void testCase12(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn3 = driver.findElement(By.id("btnEmail"));
        btn3.click();
        driver.quit();
    }

    @Test // fail quên set màu đen trên html
    public void testCase13(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn3 = driver.findElement(By.id("btnEmail"));
        assertEquals("rgba(255, 192, 203, 1)",btn3.getCssValue("color"));
        driver.quit();
    }

    @Test
    public void testCase14(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn3 = driver.findElement(By.id("btnEmail"));
        assertEquals("20px",btn3.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void testCase15(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement btn3 = driver.findElement(By.id("btnEmail"));
        WebElement p = driver.findElement(By.id("mail"));

        btn3.click();
        assertEquals("Meunguyen@gmail.com",p.getText());
        driver.quit();
    }

    @Test
    public void testCase16(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn4 = driver.findElement(By.id("linkmyfacebook"));
        assertEquals("Link my Facebook",btn4.getText());
        driver.quit();
    }

    @Test
    public void testCase17(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn4 = driver.findElement(By.id("linkmyfacebook"));
        assertEquals("24px",btn4.getCssValue("font-size"));
        driver.quit();
    }

    @Test // test fail lỗi border
    public void testCase18(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement btn4 = driver.findElement(By.id("linkmyfacebook"));
        assertEquals("rgba(0, 0, 0, 1)", btn4.getCssValue("color"));
        assertEquals("2px solid rgba(76, 175, 80, 1)",btn4.getCssValue("border"));
        driver.quit();
    }

    @Test // so sánh link
    public void testCase19(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        String testlink="https://www.facebook.com/nguyentran.tien.33";
        WebElement btn4 = driver.findElement(By.id("linkmyfacebook"));
        btn4.click();
        assertEquals(testlink,driver.getCurrentUrl());
        driver.quit();
    }

}
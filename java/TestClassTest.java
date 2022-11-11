import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AssertionFailureBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestClassTest {

    String url = "https://ttiennguyen.github.io/radiotestwweb/index.html";

    // header
    @Test // Chuoi sai khong tu thoat
    public void testCase1(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
        // tìm kiếm dữ liệu tag h1
        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("Radio button and checkbox test web",header.getText());
        driver.quit();
    }

    @Test
    public void testCase2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("50px",header.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void testCase3(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("rgba(255, 0, 0, 1)",header.getCssValue("color"));
        driver.quit();
    }

    @Test
    public void testCase4(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.tagName("h1"));
        assertEquals("center",header.getCssValue("text-align"));
        driver.quit();
    }

    //nav
    @Test
    public void testCase5(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.tagName("legend"));
        assertEquals("Radio Button",RadioBtn.getText());
        driver.quit();
    }

    @Test
    public void testCase6(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.tagName("legend"));
        assertEquals("center",RadioBtn.getCssValue("text-align"));
        driver.quit();
    }

    @Test
    public void testCase7(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.tagName("legend"));
        assertEquals("20px",RadioBtn.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void testCase8(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.id("contactChoice1"));
        RadioBtn.click();
        driver.quit();
    }

    @Test
    public void testCase9(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.id("contactChoice2"));
        RadioBtn.click();
        driver.quit();
    }

    @Test
    public void testCase10(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.id("contactChoice3"));
        RadioBtn.click();
        driver.quit();
    }

    @Test
    public void testCase11(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement submit = driver.findElement(By.tagName("button"));
        assertEquals("Submit",submit.getText());
        driver.quit();
    }

    @Test
    public void testCase12(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        String log = "contact=email";

        WebElement RadioBtn = driver.findElement(By.id("contactChoice1"));
        WebElement submit = driver.findElement(By.tagName("button"));
        WebElement checklog = driver.findElement(By.id("log"));

        RadioBtn.click();
        submit.click();
        assertEquals("contact=email",checklog.getText());

        driver.quit();
    }

    @Test
    public void testCase13(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.id("contactChoice2"));
        WebElement submit = driver.findElement(By.tagName("button"));
        WebElement checklog = driver.findElement(By.id("log"));

        RadioBtn.click();
        submit.click();
        assertEquals("contact=phone",checklog.getText());

       driver.quit();
    }

    @Test
    public void testCase14(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement RadioBtn = driver.findElement(By.id("contactChoice3"));
        WebElement submit = driver.findElement(By.tagName("button"));
        WebElement checklog = driver.findElement(By.id("log"));

        RadioBtn.click();
        submit.click();
        assertEquals("contact=mail",checklog.getText());

        driver.quit();
    }

    @Test
    public void testCase15(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkBox = driver.findElement(By.id("choice1"));

        checkBox.click();
        driver.quit();

    }

    @Test
    public void testCase16(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkBox = driver.findElement(By.id("choice2"));

        checkBox.click();
        driver.quit();
    }

    @Test
    public void testCase17(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkBox = driver.findElement(By.id("choice3"));

        checkBox.click();
        driver.quit();
    }

    @Test
    public void testCase18(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkBox1 = driver.findElement(By.id("choice1"));
        WebElement checkBox2 = driver.findElement(By.id("choice2"));

        checkBox1.click();
        checkBox2.click();
        driver.quit();
    }

    @Test
    public void testCase19(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement checkBox1 = driver.findElement(By.id("choice1"));
        WebElement checkBox2 = driver.findElement(By.id("choice2"));
        WebElement checkBox3 = driver.findElement(By.id("choice3"));

        checkBox1.click();
        checkBox2.click();
        checkBox3.click();
        driver.quit();
    }
}
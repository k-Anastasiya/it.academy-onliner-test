import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerSetting {
    OnlinerObject onlinerObject;
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        onlinerObject = new OnlinerObject(driver);

    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }
}

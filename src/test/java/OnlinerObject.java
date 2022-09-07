import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerObject {
    WebDriver driver;
    By catologLocator = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]/span");

    By electronicaLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/ul/li[3]/span[2]/span");
   By tvAndVideoLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div[1]");
    By televizoryLocator = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div[2]/div/a[1]");
    By filterProducerlLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul");
    By selectLGLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul/li[1]/label/span[1]/span");
    By selectSamsungLocator = By.xpath("//*[@id=\"schema-filter\"]/div[5]/div[4]/div[2]/ul/li[2]/label/span[1]/span");

    public OnlinerObject(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findButtonTvAndVideo() {
        WebElement buttonTvAndVideo = driver.findElement(tvAndVideoLocator);
        return buttonTvAndVideo;

    }

    public WebElement findButtonCatolog() {
        WebElement buttonCatolog = driver.findElement(catologLocator);
        return buttonCatolog;

    }
    public WebElement findBurronElectronical() {
        WebElement buttonElectronic = driver.findElement(electronicaLocator);
        return buttonElectronic;
    }
    public WebElement findButtonTelevision() {
        WebElement buttonTelevision = driver.findElement(televizoryLocator);
        return buttonTelevision;
    }

    public WebElement findFilterProducer() {
        WebElement filterProducer = driver.findElement(filterProducerlLocator);
        return filterProducer;
    }
    public WebElement findSelectLGLocator() {
        WebElement selectLG = driver.findElement(selectLGLocator);
        return selectLG;

    }
    public WebElement findSelectSamsungLocator() {
        WebElement selectSamsung = driver.findElement(selectSamsungLocator);
        return selectSamsung;
    }
}
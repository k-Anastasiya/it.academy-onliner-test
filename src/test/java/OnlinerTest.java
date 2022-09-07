import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest extends OnlinerSetting{


    @Test
    public void verifyTitle(){
        System.out.println(" In Verify Title Test Case");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Onliner"));
    }
    @Test
    public  void verifyFilterProduserTest(){
        OnlinerStep onlinerStep= new OnlinerStep(driver);
        onlinerStep.selectProducer();
        Assert.assertNotEquals(onlinerStep.selectLGLocator,onlinerStep.selectSamsungLocator);

    }


}

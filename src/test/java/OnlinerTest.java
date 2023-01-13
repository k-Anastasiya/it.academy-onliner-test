import org.junit.Assert;
import org.junit.Test;

public class OnlinerTest extends OnlinerSetting {

  @Test
  public void verifyTitle() {
    System.out.println(" In Verify Title Test Case");
    String title = driver.getTitle();
    Assert.assertTrue(title.contains("Onliner"));
  }

  @Test
  public void verifyFilterProduserTest() {
    OnlinerStep onlinerStep = new OnlinerStep(driver);
    onlinerStep.selectProducer();
    Assert.assertNotEquals(onlinerStep.lgInput, onlinerStep.samsungInput);
  }
}

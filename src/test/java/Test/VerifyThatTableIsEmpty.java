package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyThatTableIsEmpty extends BaseTest {

    @BeforeMethod
    public void tablepageSetUp() {
        driver.navigate().to("https://demoqa.com/webtables");
        webtablesPage.clickDeleteTwo();
        webtablesPage.clickDeleteOne();
        webtablesPage.clickDeleteThree();
    }
    @Test
    public void averifyThatTableIsEmpty() {
        String empty = "";
        Assert.assertEquals(webtablesPage.getFirstRowText().replaceAll("\\s", ""), empty.replaceAll("\\s", ""));

    }

}

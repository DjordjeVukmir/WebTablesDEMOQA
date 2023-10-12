package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarFunctionality extends BaseTest {

    @BeforeMethod
    public void tablepageSetUp() {
        driver.navigate().to("https://demoqa.com/webtables");

    }

    @Test
    public void searchBarInputTest(){
        String empty = "";
        webtablesPage.inputSearch("Djordje");
        Assert.assertEquals(webtablesPage.getFirstRowText().replaceAll("\\s", ""), empty.replaceAll("\\s", ""));
    }
}

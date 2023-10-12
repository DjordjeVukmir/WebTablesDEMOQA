package Test;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DropDownMenuChanges extends BaseTest {


    @Test
    public void changeValuesInDropdownMenu(){

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webtablesPage.dropDownRow);
            webtablesPage.selectFromDropDown("5 rows");
            String firstValue = webtablesPage.dropDownRow.getFirstSelectedOption().getText();
            System.out.println(firstValue);
    }
}

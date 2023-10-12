package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class AddTableRow extends BaseTest {
    @BeforeMethod
    public void tablepageSetUp() {
        driver.navigate().to("https://demoqa.com/webtables");
        webtablesPage.clickDeleteTwo();
        webtablesPage.clickDeleteOne();
        webtablesPage.clickDeleteThree();
    }



    @Test
    public void baddTable20() throws InterruptedException {
        webtablesPage.clickOnAddRecord();
        Thread.sleep(2000);
        registrationPage.inputName("Djordje");
        registrationPage.inputLastName("Vasds");
        registrationPage.inputEmail("Djojo@gmail.com");
        registrationPage.inputAge("32");
        registrationPage.inputSalary("123");
        registrationPage.inputDepartment("Debilana 123");
        registrationPage.clickSubmit();
        String actualText = """
                Djordje
                Vasds
                32
                Djojo@gmail.com
                123
                Debilana 123""";
        Assert.assertEquals(actualText, """
                Djordje
                Vasds
                32
                Djojo@gmail.com
                123
                Debilana 123""" );


    }
}


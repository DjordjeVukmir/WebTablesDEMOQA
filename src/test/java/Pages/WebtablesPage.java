package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class WebtablesPage extends BaseTest {

    public WebtablesPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;



    @FindBy(css = ".rows.per.page")
    public Select dropDownRow;

    public void selectFromDropDown(String rowNumber){
        dropDownRow.selectByVisibleText(rowNumber);
    }

    public WebElement getAddButton() {
        return addButton;
    }


    public WebElement getSearchBox() {
        return searchBox;
    }


    public WebElement getEditRecordButton_Three() {
        return editRecordButton_Three;
    }

    public WebElement getDeleteRecord_Three() {
        return deleteRecord_Three;
    }

    public void clickOnAddRecord(){
        addButton.click();
    }
    @FindBy(id = "searchBox")
    WebElement searchBox;

    public void inputSearch(String search){
        searchBox.sendKeys(search);
    }

    @FindBy(id = "edit-record-3")
    WebElement editRecordButton_Three;

    @FindBy(id = "delete-record-3")
    WebElement deleteRecord_Three;
    public void clickDeleteThree(){
        deleteRecord_Three.click();
    }

    @FindBy(id = "delete-record-2")
    WebElement deleteRecord_One;
    public void clickDeleteTwo(){
        deleteRecord_Two.click();
    }
    @FindBy(id = "delete-record-1")
    WebElement deleteRecord_Two;



    public void clickDeleteOne(){
        deleteRecord_One.click();
    }

    @FindBy(className = "rt-resizable-header-content")
    public List<WebElement> table;

    public void printTable(){
        for (int i = 0; i < table.size() ; i++) {
            System.out.println(table.get(i).getText());
        }
    }

    public WebElement firstName(){
        for (int i = 0; i < table.size() ; i++) {
            if(table.get(i).getText().equals("First Name")){
                return table.get(i);
            }
        }
        return null;
    }

    @FindBy(css = ".rt-tr.-odd")
    WebElement firstRow;

    public String getFirstRowText(){
        String firstRowText = firstRow.getText();
        return firstRowText;
    }
}

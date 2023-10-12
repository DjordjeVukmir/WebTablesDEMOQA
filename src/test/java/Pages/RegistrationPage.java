package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseTest {

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getUserEmail() {
        return userEmail;
    }

    public WebElement getAge() {
        return age;
    }

    public WebElement getSalary() {
        return salary;
    }

    public WebElement getDepartment() {
        return department;
    }

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "firstName")
    WebElement firstName;
    public void inputName(String name){
        firstName.sendKeys(name);
    }

    @FindBy(id = "lastName")
    WebElement lastName;
    public void inputLastName(String lastname){
        lastName.sendKeys(lastname);
    }

    @FindBy(id = "userEmail")
    WebElement userEmail;
    public void inputEmail(String email){
        userEmail.sendKeys(email);
    }
    @FindBy(id = "age")
    WebElement age;
    public void inputAge(String ageNum){
        age.sendKeys(ageNum);
    }
    @FindBy(id = "salary")
    WebElement salary;
    public void inputSalary(String salaryAmount){
        salary.sendKeys(salaryAmount);
    }
    @FindBy(id = "department")
    WebElement department;

    public void inputDepartment(String depName){
        department.sendKeys(depName);
    }

    @FindBy(id = "submit")
    WebElement submitButton;

    public void clickSubmit(){
        submitButton.click();
    }
}

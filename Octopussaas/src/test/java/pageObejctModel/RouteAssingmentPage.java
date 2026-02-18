package pageObejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RouteAssingmentPage 
{

    @FindBy(xpath = "//button[text()='...']")
    private WebElement threeDots;

    @FindBy(xpath = "//button[text()='Route Assignment']")
    private WebElement routeAssignment;

    @FindBy(xpath = "//span[text()='Add a Service']")
    private WebElement addService;

    @FindBy(id = "route")
    private WebElement routeInput;

    @FindBy(xpath = "//div[text()='Nisha route']")
    private WebElement routeSelect;

    @FindBy(id = "service-input-0")
    private WebElement serviceType;

    @FindBy(xpath = "//div[text()='Medical Waste']")
    private WebElement medicalWaste;

    @FindBy(xpath = "//button[text()='Add to Route']")
    private WebElement addToRoute;

    public RouteAssingmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void assignRoute() {
        threeDots.click();
        routeAssignment.click();
        addService.click();
        routeInput.sendKeys("Raju");
        routeSelect.click();
        serviceType.click();
        medicalWaste.click();
        addToRoute.click();
    }

}

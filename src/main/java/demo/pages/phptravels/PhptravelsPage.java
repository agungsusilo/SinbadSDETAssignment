package demo.pages.phptravels;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.WebdriverInstance.webdriver;

public class PhptravelsPage {
    public void openPage() {
        webdriver.get("https://www.phptravels.net/");
    }

    public void inputDestination(String city){
        WebElement namefield = WebdriverInstance.webdriver
                .findElement(By.cssSelector("#s2id_autogen16"));
        namefield.click();
        namefield.sendKeys(city);
    }


    public void inputCheckIN(String date) {
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        String select = Keys.chord(Keys.CONTROL, "a");
        WebElement checkinfield = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkin']")));
        checkinfield.sendKeys(select);
        checkinfield.sendKeys(date);
    }

    public void inputCheckOUT(String date) {
        WebElement checkinfield = webdriver.findElement(By.xpath("//input[@id='checkout']"));
        String select = Keys.chord(Keys.CONTROL, "a");
        checkinfield.sendKeys(select);
        checkinfield.sendKeys(date);
    }

    public void clickChildAmount() {
        webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
    }


    public void clickSearchBTN() {
        webdriver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
    }

    public boolean checkSearchResultDisplayed(){
        WebDriverWait wait = new WebDriverWait(webdriver, 20);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[contains(text(),'Filter Search')]"))).isDisplayed();
    }

    public void clickTopListHotel(){
        webdriver.findElement((By.xpath("//body/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"))).click();
    }

    public boolean checkHotelDetailsDisplayed(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"))).isDisplayed();
    }

    public void clickTopRoom(){
        webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/h5[1]/div[1]/label[1]")).click();
    }

    public void clickBookBTN(){
        webdriver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
    }

    public boolean checkPersonalDetailsFormDisplayed(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Personal Details')]"))).isDisplayed();
    }

    public void inputFirstName(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputLastName(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputEmail(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputEmailConfirmation(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputContactNumber(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputAddress(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }

    public void clickCountry(){
        webdriver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/ul[1]")).click();
    }

    public void clickBookingFinal(){
        webdriver.findElement(By.xpath("//button[contains(text(),'CONFIRM THIS BOOKING')]")).click();
    }

    public boolean checkBookingDetailsPage(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Invoice Number')]"))).isDisplayed();
    }



    public void clickMyAccount(){
        webdriver.findElement(By.id("dropdownCurrency")).click();
    }
    public void clickMyAccLogin(){
        webdriver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]")).click();
    }
    public boolean seeLoginPage(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//title[contains(text(),'Login')]"))).isDisplayed();
    }
    public void inputLoginEmail(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputLoginPassword(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void clickLOGINbutton(){
        webdriver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
    }
    public boolean seeMyAccountPage(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'My Profile')]"))).isDisplayed();
    }
    public void openVisaPage(String Origin, String Destination, String Date) {
        String urladdress = "https://www.phptravels.net/visa?nationality_country="+Origin+"&destination_country="+Destination+"&date="+Date+"";
        webdriver.get(urladdress);
    }
    public void inputvisafirstname(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputvisalastname(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputvisaemail(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputvisaconfirmemail(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void inputvisacontactnumber(String data){
        WebElement field = webdriver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/input[1]"));
        field.sendKeys(data);
    }
    public void clickBookingVISA(){
        webdriver.findElement(By.xpath("//button[@id='sub']")).click();
    }
    public void clickVIEWinvoice(){
        webdriver.findElement(By.xpath("//a[contains(text(),'View Invoice')]")).click();
    }
    public boolean checkVISAbookingdetails(){
        WebDriverWait wait = new WebDriverWait(webdriver, 10);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Booking Details')]"))).isDisplayed();
    }




}

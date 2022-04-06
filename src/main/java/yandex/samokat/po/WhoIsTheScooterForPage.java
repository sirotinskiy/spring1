package yandex.samokat.po;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class WhoIsTheScooterForPage {
    //Поле ввода имени
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private SelenideElement inputFieldName;

    //Поле ввода фамилии
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private SelenideElement inputFieldLastName;

    //Поле ввода адреса, куда привезти заказ
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement inputFieldAddress;

    //Поле ввода метро
    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private SelenideElement inputFieldMetro;

    //Выпадающий список найденных станций
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]")
    private ElementsCollection dropDownListMetro;

    //Поле ввода номера телефона
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement inputFieldPhoneNumber;

    //Кнопка далее
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonNext;

    public void setInputFieldName(String name) {
        inputFieldName.setValue(name);
    }

    public void setInputFieldLastName(String LastName) {
        inputFieldLastName.setValue(LastName);
    }

    public void setInputFieldAddress(String address) {
        inputFieldAddress.setValue(address);
    }

    public void setInputFieldMetro(String metro) {
        inputFieldMetro.setValue(metro);
        dropDownListMetro.get(0).click();
    }

    public void setInputFieldPhoneNumber(String phoneNumber) {
        inputFieldPhoneNumber.setValue(phoneNumber);
    }

    public void clickButtonNext(){
        buttonNext.click();
    }

    public void setCardRental(String name, String lastName, String address,
                              String metro, String phoneNumber){
        setInputFieldName(name);
        setInputFieldLastName(lastName);
        setInputFieldAddress(address);
        setInputFieldMetro(metro);
        setInputFieldPhoneNumber(phoneNumber);
    }

}

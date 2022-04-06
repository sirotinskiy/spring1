package yandex.samokat.po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AboutPageRent {

    //Поле ввода даты аренды
    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement inputFieldDate;

    //Поле выбора срока аренда
    @FindBy(xpath = ".//div[@class='Dropdown-placeholder']")
    private SelenideElement fieldLeaseTerm;

    //Выпадающий список доступного срока
    @FindBy(className = "Dropdown-option")
    private ElementsCollection dropDownListTerm;

    //Выбор цвета самоката "Черный жемчуг"
    @FindBy(id = "black")
    private SelenideElement radioBlackColor;

    //Выбор цвета самоката "Серая безысходность"
    @FindBy(id = "grey")
    private SelenideElement radioGreyColor;

    //Поле ввода комментария для курьера
    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement inputFieldComment;

    //Кнопка Заказать
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonMidlOrder;

    //Модалка "Хотите оформить заказ?"
    @FindBy(xpath = "Order_Modal__YZ-d3")
    private SelenideElement modalWindowDoYouWantOrder;

    //Кнопка подтверждения заказа "Да"
    @FindBy(xpath = ".//button[text()='Да']")
    private SelenideElement buttonYes;

    //Текст "Номер заказа..."
    @FindBy (xpath = ".//div[@class='Order_Text__2broi']")
    private SelenideElement numberOrder;

    public void setInputFieldDate(String date) {
        inputFieldDate.setValue(date);
    }

    public void clickFieldLeaseTerm(){
        fieldLeaseTerm.click();
    }

    public void choiceLeaseTerm(int leaseTerm) {
        leaseTerm--;
        for (int i = 0; i < dropDownListTerm.size(); i++){
            if(leaseTerm == i){
                dropDownListTerm.get(i).click();
            }
        }
    }

    public void choiceRadioColor(String color) {
        if(color.equals("black")){radioBlackColor.click();}
        if(color.equals("grey")){radioGreyColor.click();}
    }

    public void setInputFieldComment(String comment) {
        inputFieldComment.setValue(comment);
    }

    public void clickButtonMidlOrder(){
        buttonMidlOrder.click();
    }

    public void clickButtonYes(){
        buttonYes.shouldBe(Condition.visible).click();
    }

    public String getNumberOrder(){
        return numberOrder.shouldBe(Condition.visible).getText();
    }

    public void setCardAboutRent(String date, int amountOfDays,
                                 String color, String comment){
        setInputFieldDate(date);
        choiceRadioColor(color);
        setInputFieldComment(comment);
        clickFieldLeaseTerm();
        choiceLeaseTerm(amountOfDays);
    }

    public void ordering(){
        clickButtonMidlOrder();
        clickButtonYes();
    }

}

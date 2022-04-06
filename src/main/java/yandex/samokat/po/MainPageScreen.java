package yandex.samokat.po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class MainPageScreen {
    //1.  header

    //Лого Яндекса - переход на главную страницу Яндекса
    @FindBy(xpath = ".//img[@alt='Yandex']")
    private SelenideElement yandexLogo;

    //Лого Самоката
    @FindBy(xpath = ".//img[@alt='Scooter']")
    private SelenideElement scooterLogo;

    //Текст "Учебный Тренажер"
    @FindBy(xpath = ".//div[@class='Header_Disclaimer__3VEni']")
    private SelenideElement textDisclaimer;

    //Кнопка "Заказ" в хедере - переход к оформлению заказа
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g']")
    private SelenideElement buttonHeaderOrder;

    //Кнопка "Статус"
    @FindBy(xpath = ".//button[@class='Header_Link__1TAG7']")
    private SelenideElement buttonHeaderStatusOrder;

    //2.	body
    //Текст "Самокат на пару дней"
    @FindBy(xpath = "Home_Header__iJKdX")
    private SelenideElement textTagline;

    //Картинка белого самоката
    @FindBy(css = "Home_BluePrint__TGX2n")
    private SelenideElement pictureWhiteScooter;

    //Картинка черного самоката
    @FindBy(css = "Home_Scooter__3YdJy")
    private SelenideElement pictureBlackScooter;

    //Массив состоящий из двух текстов, которые появляются в зависимости от скролла
    @FindBy(css = "Home_SubHeader__zwi_E")
    private ElementsCollection twoOpacityTexts;

    //Модель Самоката
    @FindBy(xpath = ".//div[text()='&nbsp;Модель Toxic PRO']")
    private SelenideElement modelScooter;

    //Текст "Максимальная скорость"
    @FindBy(xpath = ".//div[text()='Максимальная скорость']")
    private SelenideElement textMaxSpeed;

    //Значение в км/ч максимальной скорости
    @FindBy(xpath = ".//div[text()='40 км/ч']")
    private SelenideElement valueMaxSpeed;

    //Текст "Проедет без подзарядки"
    @FindBy(xpath = ".//div[text()='Проедет без поздарядки']")
    private SelenideElement textMaxRange;

    //Значение в км расстояние без подзарядки
    @FindBy(xpath = ".//div[text()='80 км']")
    private SelenideElement valueMaxRange;

    //Текс "Выдерживает вес"
    @FindBy(xpath = ".//div[text()='Выдерживает вес']")
    private SelenideElement textMaxWeight;

    //Значение к кг выдерживаемого веса
    @FindBy(xpath = ".//div[text()='120 кг']")
    private SelenideElement valueMaxWeight;

    //Текст "Как это работает"
    @FindBy(xpath = ".//div[text()='Как это работает']")
    private SelenideElement textHowItWork;

    //Road map - статусы заказа
    //Номер этапа: 1
    @FindBy(xpath = ".//div[text()='1']")
    private SelenideElement numberStatusOne;

    //Первый статус "Заказываете самокат"
    @FindBy(xpath = ".//div[text()='Заказываете самокат']")
    private SelenideElement firstStatus;

    //Описание первого статуса
    @FindBy(xpath = ".//div[text()='Выбираете, когда&nbsp;и&nbsp;куда привезти']")
    private SelenideElement descriptionFirstStatus;

    //Номер этапа: 2
    @FindBy(xpath = ".//div[text()='2']")
    private SelenideElement numberStatusTwo;

    //Второй статус "Курьер привозит самокат"
    @FindBy(xpath = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement secondStatus;

    //Описание второго статуса
    @FindBy(xpath = ".//div[text()='А вы — оплачиваете аренду']")
    private SelenideElement descriptionSecondStatus;

    //Номер этапа: 3
    @FindBy(xpath = ".//div[text()='3']")
    private SelenideElement numberStatusThree;

    //Третий статус "Катаетесь"
    @FindBy(xpath = ".//div[text()='Катаетесь']")
    private SelenideElement thirdStatus;

    //Описание третьего статуса
    @FindBy(xpath = ".//div[text()='Сколько часов аренды осталось — видно на сайте']")
    private SelenideElement descriptionThirdStatus;

    //Номер этапа: 4
    @FindBy(xpath = ".//div[text()='4']")
    private SelenideElement numberStatusFour;

    //Четвертый статус "Курьер забирает самокат"
    @FindBy(xpath = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement fourthStatus;

    //Описание четвертого статуса
    @FindBy(xpath = ".//div[text()='Когда аренда заканчивается']")
    private SelenideElement descriptionFourthStatus;

    //Кнопка "Заказать"
    @FindBy(xpath = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonMidlOrder;


    //Текст "Вопросы о важном"
    @FindBy(xpath = ".//div[text()='Вопросы о важном']")
    private SelenideElement textFAQ;

    //Список(аккордион) "Вопросы и ответы"
    //Первый вопрос "Сколько это стоит? И как оплатить?"
    @FindBy(id = "accordion__heading-0")
    private SelenideElement firstQuestion;

    //Первый ответ "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    @FindBy(id = "accordion__panel-0")
    private SelenideElement firstAnswer;

    //Второй вопрос "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(id = "accordion__heading-1")
    private SelenideElement secondQuestion;

    //Второй ответ "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    @FindBy(id = "accordion__panel-1")
    private SelenideElement secondAnswer;

    //Третий вопрос "Как рассчитывается время аренды?"
    @FindBy(id = "accordion__heading-2")
    private SelenideElement thirdQuestion;

    //Третий ответ "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня..."
    @FindBy(id = "accordion__panel-2")
    private SelenideElement thirdAnswer;

    //Четвертый вопрос "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(id = "accordion__heading-3")
    private SelenideElement fourthQuestion;

    //Четвертый ответ "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    @FindBy(id = "accordion__panel-3")
    private SelenideElement fourthAnswer;

    //Пятый вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(id = "accordion__heading-4")
    private SelenideElement fifthQuestion;

    //Пятый ответ "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    @FindBy(id = "accordion__panel-4")
    private SelenideElement fifthAnswer;

    //Шестой вопрос "Вы привозите зарядку вместе с самокатом?"
    @FindBy(id = "accordion__heading-5")
    private SelenideElement sixthQuestion;

    //Шестой ответ "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    @FindBy(id = "accordion__panel-5")
    private SelenideElement sixthAnswer;

    //Седьмой вопрос "Можно ли отменить заказ?"
    @FindBy(id = "accordion__heading-6")
    private SelenideElement seventhQuestion;

    //Седьмой ответ "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    @FindBy(id = "accordion__panel-6")
    private SelenideElement seventhAnswer;

    //Восьмой вопрос "Я живу за МКАДом, привезёте?"
    @FindBy(id = "accordion__heading-7")
    private SelenideElement eighthQuestion;

    //Восьмой ответ "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    @FindBy(id = "accordion__panel-7")
    private SelenideElement eighthAnswer;


    public String getFirstAnswer() {
        firstQuestion.scrollIntoView(true).click();
        return firstAnswer.shouldBe(Condition.visible).getText();
    }

    public String getSecondAnswer() {
        secondQuestion.scrollIntoView(true).click();
        return secondAnswer.shouldBe(Condition.visible).getText();
    }

    public String getThirdAnswer() {
        thirdQuestion.scrollIntoView(true).click();
        return thirdAnswer.shouldBe(Condition.visible).getText();
    }

    public String getFourthAnswer() {
        fourthQuestion.scrollIntoView(true).click();
        return fourthAnswer.shouldBe(Condition.visible).getText();
    }

    public String getFifthAnswer() {
        fifthQuestion.scrollIntoView(true).click();
        return fifthAnswer.shouldBe(Condition.visible).getText();
    }

    public String getSixthAnswer() {
        sixthQuestion.scrollIntoView(true).click();
        return sixthAnswer.shouldBe(Condition.visible).getText();
    }

    public String getSeventhAnswer() {
        seventhQuestion.scrollIntoView(true).click();
        return seventhAnswer.shouldBe(Condition.visible).getText();
    }

    public String getEighthAnswer() {
        eighthQuestion.scrollIntoView(true).click();
        return eighthAnswer.shouldBe(Condition.visible).getText();
    }

    public void clickButtonHeaderOrder(){
        buttonHeaderOrder.shouldBe(Condition.visible).click();
    }

    public void clickButtonMidlOrder(){
        buttonMidlOrder.scrollIntoView(true).click();
    }
}

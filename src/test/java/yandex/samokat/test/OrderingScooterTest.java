package yandex.samokat.test;



import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import yandex.samokat.po.AboutPageRent;
import yandex.samokat.po.MainPageScreen;
import yandex.samokat.po.WhoIsTheScooterForPage;


import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderingScooterTest {

    private WhoIsTheScooterForPage whoIsTheScooterForPage;
    private AboutPageRent aboutPageRent;
    private MainPageScreen mainPageScreen;

    @Before
    public void setUp(){
        mainPageScreen = open("https://qa-scooter.praktikum-services.ru/", MainPageScreen.class);
        whoIsTheScooterForPage = open("https://qa-scooter.praktikum-services.ru/", WhoIsTheScooterForPage.class);
        aboutPageRent = open("https://qa-scooter.praktikum-services.ru/", AboutPageRent.class);
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }


    @Test
    public void orderingScooterViaHeaderButton() {
        String expectTextOrderIsDone = "Номер заказа: ";

        mainPageScreen.clickButtonHeaderOrder();

        whoIsTheScooterForPage.setCardRental("Борис",
                                            "Бритва",
                                            " ул. Казакова 8 ",
                                            "Курская",
                                            "89995502634");
        whoIsTheScooterForPage.clickButtonNext();

        aboutPageRent.setCardAboutRent("04.05.2022",
                                        3,
                                        "black",
                                        "Я не умею кататься");
        aboutPageRent.ordering();

        assertThat(aboutPageRent.getNumberOrder(),equalTo(expectTextOrderIsDone));
    }

    @Test
    public void orderingScooterViaMidlButton() {
        String expectTextOrderIsDone = "Номер заказа: ";

        mainPageScreen.clickButtonMidlOrder();

        whoIsTheScooterForPage.setCardRental("Константин",
                "Дядька",
                "проспект Вернадского",
                "Парк Культуры",
                "+79992203388");
        whoIsTheScooterForPage.clickButtonNext();

        aboutPageRent.setCardAboutRent("5.06.2022",
                4,
                "grey",
                "Я не умею кататься");
        aboutPageRent.ordering();

        assertThat(aboutPageRent.getNumberOrder(),containsString(expectTextOrderIsDone));
    }

}

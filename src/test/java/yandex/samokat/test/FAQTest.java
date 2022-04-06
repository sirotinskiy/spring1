package yandex.samokat.test;

import com.codeborne.selenide.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import yandex.samokat.po.MainPageScreen;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FAQTest {

    private MainPageScreen mainPageScreen;

    @Before
    public void setUp(){
        mainPageScreen = open("https://qa-scooter.praktikum-services.ru/",MainPageScreen.class);
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }

    @Test
    public void testFirstQuestion(){
        String expectedFirstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertThat(mainPageScreen.getFirstAnswer(), equalTo(expectedFirstAnswer));
    }

    @Test
    public void testSecondQuestion(){
        String expectedSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertThat(mainPageScreen.getSecondAnswer(), equalTo(expectedSecondAnswer));
    }

    @Test
    public void testThirdQuestion(){
        String expectedThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertThat(mainPageScreen.getThirdAnswer(), equalTo(expectedThirdAnswer));
    }

    @Test
    public void testFourthQuestion(){
        String expectedFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertThat(mainPageScreen.getFourthAnswer(), equalTo(expectedFourthAnswer));
    }

    @Test
    public void testFifthQuestion(){
        String expectedFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertThat(mainPageScreen.getFifthAnswer(), equalTo(expectedFifthAnswer));
    }

    @Test
    public void testSixthQuestion(){
        String expectedSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertThat(mainPageScreen.getSixthAnswer(), equalTo(expectedSixthAnswer));
    }

    @Test
    public void testSeventhQuestion(){
        String expectedSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertThat(mainPageScreen.getSeventhAnswer(), equalTo(expectedSeventhAnswer));
    }

    @Test
    public void testEighthQuestion(){
        String expectedEighthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertThat(mainPageScreen.getEighthAnswer(), equalTo(expectedEighthAnswer));
    }
}
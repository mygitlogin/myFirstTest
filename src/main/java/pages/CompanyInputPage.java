package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import java.util.List;

@Name("Выбранная компания")
public class CompanyInputPage  extends AkitaPage {



    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[2]/div[1]/span/span/span[2]/input")
    @Name("ИНН")
    private SelenideElement inn;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[2]/div[2]/span/span/span[2]/input")
    @Name("огрн")
    private SelenideElement ogrn;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[3]/div[1]/span/span/span[2]/input")
    @Name("Руководитель")
    private SelenideElement director;

    @FindBy(css ="#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > span > span > span > span > span.input__box > input")
    @Name("Дата регистрации")
    private SelenideElement registrationDate;


    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[2]/span/span/span[2]/input")
    @Name("email")
    private SelenideElement email;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[1]/span/span/span[2]/input")
    @Name("Телефон")
    private SelenideElement companyPhone;

    @FindBy(css = ".button__text")
    @Name("Далее")
    private SelenideElement buttonNext;

    @FindBy(css="#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div > span > span > span.input__box > input")
    @Name("Город обслуживания")
    private SelenideElement city;

    @FindBy(css="#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(4) > div > div > div > div > div > label:nth-child(1)")
    @Name("Оформить")
    private SelenideElement oformit;

}
package pages.AO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import java.util.List;

@Name("Выбранный ИП")
public class IPInputPage extends AkitaPage {

    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > span > span > span.input__box > input")
    @Name("ИНН")
    private SelenideElement inn;

    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > span > span > span.input__box > input")
    @Name("огрн")
    private SelenideElement ogrn;
    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > span > span > span.input__box > input")
    @Name("Руководитель")
    private SelenideElement director;


    @FindBy(css ="#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > span > span > span > span > span.input__box > input")
    @Name("Дата регистрации")
    private SelenideElement registrationDate;

    @FindBy(css ="#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(5) > div.form-field.form-field_size_m.form-field_theme_alfa-on-white.company-info__user-data-block-2 > div > span > span > span.input__box > input")
    @Name("Адрес ИП")
    private SelenideElement ipAdress;

    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > form > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > span > span > span.input__box > input")
    @Name("email")
    private SelenideElement email;
    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[1]/span/span/span[2]/input")
    @Name("Телефон")
    private SelenideElement companyPhone;


    @FindBy(css = ".button__text")
    @Name("Далее")
    private SelenideElement buttonNext;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[3]/div/div[1]/div/span/span/span[2]/input")
    @Name("Город обслуживания")
    private SelenideElement city;
}

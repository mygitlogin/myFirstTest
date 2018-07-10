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

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[3]/div[2]/span/span/span/span[2]/input")
    @Name("Дата регистрации")
    private SelenideElement registrationDate;


    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[2]/span/span/span[2]/input")
    @Name("email")
    private SelenideElement email;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/div[5]/div[1]/span/span/span[2]/input")
    @Name("Телефон")
    private SelenideElement companyPhone;

    @FindBy(css = ".spin-button__span-text")
    @Name("Далее")
    private SelenideElement buttonNext;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[3]/div[1]/div[1]/div/span/span/span[2]/input")
    @Name("Город обслуживания")
    private SelenideElement city;



}
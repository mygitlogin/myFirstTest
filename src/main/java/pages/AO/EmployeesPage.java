package pages.AO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import java.util.List;
import ru.alfabank.alfatest.cucumber.annotations.Optional;

@Name("Сотрудники компании")

public class EmployeesPage  extends AkitaPage {

    @FindBy(css="input[name$=\".lastName\"]")
    @Name("Фамилия")
    private SelenideElement empSurname;

    @FindBy(css="input[name$=\".firstName\"]")
    @Name("Имя")
    private SelenideElement empName;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[1]/span/span/span[2]/input")
    @Name("Паспорт")
    private SelenideElement passport;

    @Optional
    @FindBy(css="input[name$=\".phone\"]")
    @Name("Номер телефона")
    private SelenideElement phoneNum;

    @Optional
    @FindBy(css="input[name$=\".email\"]")
    @Name("email")
    private SelenideElement empEmail;


    @Optional
    @FindBy(css="input[name$=\".birthDate\"]")
    @Name("Дата рождения")
    private SelenideElement birthDate;

    @Optional
    @FindBy(css="input[name$=\".codeword\"]")
    @Name("Кодовое слово")
    private SelenideElement codeWord;

    @FindBy(css=".services-list__list > div:nth-child(1) > div:nth-child(1)")
    @Name("Интернет банк")
    private SelenideElement intBank;

    @Optional
    @FindBy(css=".service-layout__form input[name$=\"ALBO.login\"]")
    @Name("Логин")
    private SelenideElement login;

    @Optional
    @FindBy(css=".service-layout__form button[type=\"submit\"]")
    @Name("Сохранить")
    private SelenideElement intBankSaveButton;

    @Optional
    @FindBy(css=".main-validation__submit-btn button[type=\"submit\"]")
    @Name("Сохранить все")
    private SelenideElement saveButton;

    @Optional
    @FindBy(css = ".authorized-persons-form__submit-btn button[type=\"submit\"]")
    @Name("Далее")
    private SelenideElement buttonNext;

    public EmployeesPage() {
    }
}

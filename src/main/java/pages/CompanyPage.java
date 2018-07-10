package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import java.util.List;

@Name("Компания")
public class CompanyPage  extends AkitaPage {

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div[1]/h4")
    @Name("Информация о Вашей компании")
    private SelenideElement companyInfo;

    @FindBy(css=".input__control")
    @Name("Поле ввода ИНН")
    private SelenideElement innInput;

    @FindBy(css=".menu-item.menu-item_type_block.menu-item_theme_alfa-on-white")
    @Name("Список компаний")
    private List<SelenideElement> companyList;


}


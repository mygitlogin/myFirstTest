package pages.AO;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.annotations.Optional;

@Name("Продукты")
public class ProductsPage extends AkitaPage {


    @FindBy(css = ".spin-button__span-text")
    @Name("Проверка компании")
    private SelenideElement buttonCheckCompany;

    @Optional
    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div")
    @Name("Результат скоринга")
    private SelenideElement scoringResults;


}
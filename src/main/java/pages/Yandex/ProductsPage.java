package pages.Yandex;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Товары")
public class ProductsPage extends AkitaPage {

    @Optional
    @FindBy(xpath = ".//*[@class='LhMupC0dLR']/span[contains(text(),'Samsung')]")
    @Name("Samsung")
    public SelenideElement samsung;

    @Optional
    @FindBy(xpath = ".//*[@class='LhMupC0dLR']/span[contains(text(),'Beats')]")
    @Name("Beats")
    public SelenideElement beats;

    @Optional
    @FindBy(css = "input[name$=\"Цена от\"]")
    @Name("Цена от")
    public SelenideElement startPrice;

    @Optional
    @FindBy(css = "input[name$=\"Цена до\"]")
    @Name("Цена до")
    public SelenideElement endPrice;

    @Optional
    @FindBy(css = ".n-snippet-cell2__title")
    @Name("Первый товар")
    public SelenideElement firstProduct;
}

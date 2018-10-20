package pages.Yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Электроника")
public class ElectrPage  extends AkitaPage {

    @Optional
    @FindBy(xpath = ".//*[@class='_1Y6X2G3jjK']/a[contains(text(),'Мобильные телефоны')]")
    @Name("Мобильные телефоны")
    public SelenideElement mobilePhone;

    @Optional
    @FindBy(xpath = ".//*[@class='_1Y6X2G3jjK']/a[contains(text(),'Наушники и Bluetooth-гарнитуры')]")
    @Name("Наушники и гарнитуры")
    public SelenideElement headphones;
}

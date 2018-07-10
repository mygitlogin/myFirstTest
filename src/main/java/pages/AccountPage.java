package pages;
        import com.codeborne.selenide.SelenideElement;
        import org.openqa.selenium.support.FindBy;
        import ru.alfabank.alfatest.cucumber.annotations.Name;
        import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Расчетный счет")
public class AccountPage extends AkitaPage{

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/form/div/div/div[1]/div/div/div[1]/div/div/a/span")
    @Name("Номер счета")
    private SelenideElement accountNum;

    @FindBy(css = ".spin-button__span-text")
    @Name("Далее")
    private SelenideElement buttonNext;

}

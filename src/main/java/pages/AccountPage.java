package pages;
        import com.codeborne.selenide.SelenideElement;
        import org.openqa.selenium.support.FindBy;
        import ru.alfabank.alfatest.cucumber.annotations.Name;
        import ru.alfabank.alfatest.cucumber.annotations.Optional;
        import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Расчетный счет")
public class AccountPage extends AkitaPage{

//    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/form/div/div/div[1]/div/div/div[1]/div/div/a/span")
//    @Name("Номер счета")
//    private SelenideElement accountNum;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[1]/form/div/div[1]/div/div/div[2]/button")
    @Name("Выбрать тариф")
    private SelenideElement chooseTarifBtn;

    @Optional
    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/form/div/ul/li[1]/div/div/div/div/div[1]/div/button")
    @Name("Сохранить")
    private SelenideElement saveTarif;

    @Optional
    @FindBy(css = "#react-app > div > div.page__content.page__content_offset > div.content.content_theme_alfa-on-white > div > div > div.ona__page > div > div > div > div.service-form__content > form > button")
    @Name("Далее")
    private SelenideElement buttonNext;

}

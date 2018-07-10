package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.annotations.Optional;

@Name("Анкета")
public class AnketaPage  extends AkitaPage{

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[1]/span/span/span[2]/input")
    @Name("Кодовое слово")
    private SelenideElement codeWord;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[2]/span/span/span[2]/input")
    @Name("Средний оборот")
    private SelenideElement avgSum;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[3]/span/span/span[2]/input")
    @Name("Количество сотрудников")
    private SelenideElement employees;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[4]/span/span/span[2]/input")
    @Name("Объем выручки")
    private SelenideElement yearSum;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[5]/span/span/span[2]/input")
    @Name("Фонд оплаты труда")
    private SelenideElement mounthSum;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[6]/div/div/div[2]/label[1]/div/button")
    @Name("Налогооблажение 1")
    private SelenideElement nalog1Button;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[7]/div/div/div[2]/label[1]/div/button/span")
    @Name("Адрес совпадает")
    private SelenideElement equalAdress;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[8]/div/div/div[2]/label[2]/div/button")
    @Name("Собственность")
    private SelenideElement ownership;

    @FindBy(css = ".spin-button__span-text")
    @Name("Далее")
    private SelenideElement buttonNext;

}
package steps;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;



import java.io.File;

@Slf4j
public class OpenFile {

    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

    @Когда(value = "^выполнено нажатие на кнопку \"([^\"]*)\" и загружен файл \"([^\"]*)\"$")
    public void clickOnButtonAndUploadFile(String buttonName, String fileName) {
        //String file = loadValueFromFileOrPropertyOrDefault(fileName);
        File attachmentFile = new File(fileName);
        akitaScenario.getCurrentPage().getElement(buttonName).uploadFile(attachmentFile);
    }

/*
+     * Выполняется нажатие на кнопку и подгружается указанный файл
+     * Селектор кнопки должны быть строго на input элемента
+     * Можно указать путь до файла. Например, src/test/resources/example.pdf
+     */
}

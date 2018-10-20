package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.BrowserType;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
public class WriteInfo {

    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

//    @И("^информация записана в файл$")
//    public void writeData () throws Exception
//    {
//         String jobData = akitaScenario.getCurrentPage().getAnyElementText("информация");
//
//        File file = new File("C:\\Users\\Линок\\Desktop\\java\\jobinfo.txt");
//        FileWriter writer = new FileWriter( "C:\\Users\\Линок\\Desktop\\java\\jobinfo.txt" );
//        if (!file.exists())
//        {
//            file.createNewFile();
//        }
//        String str = tr.$(".ccrests__store-address").innerText();
//        writer.write(jobData  + "\n");
//        akitaScenario.write("Текст про работу " + jobData);
//    }

    @Тогда("^записать в файл значение поля \"([^\"]*)\"$")
    public void writeInFile(String textName) throws IOException {
        String elementFromPage = akitaScenario.getCurrentPage().getAnyElementText(textName);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        File dataFile = new File("C:\\Users\\Линок\\Desktop\\java\\" + sdf.format(System.currentTimeMillis()) + ".txt");
        FileWriter writer = new FileWriter(dataFile);
        writer.write(elementFromPage);
        writer.close();

    }
}

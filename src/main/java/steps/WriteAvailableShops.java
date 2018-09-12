package steps;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.И;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

@Slf4j
public class WriteAvailableShops {

    private AkitaScenario akitaScenario = AkitaScenario.getInstance();

    @И("^магазины записаны в файл$")
    public void writeShops () throws Exception
    {
        List<SelenideElement> listOfElementsFromPage = akitaScenario.getCurrentPage().getElementsList("магазины");
        List<Integer> elementsText = new ArrayList<Integer>();


        File file = new File("C:\\Users\\Линок\\Desktop\\java\\shops.txt");
        FileWriter writer = new FileWriter( "C:\\Users\\Линок\\Desktop\\java\\shops.txt" );
        if (!file.exists())
        {
            file.createNewFile();
        }

        for (int i = 0; i < listOfElementsFromPage.size(); i++) {
            SelenideElement temp = listOfElementsFromPage.get(i);

            //temp.closest("TR");//найти ближайший tr
            SelenideElement tr = temp.closest("TR");
            String str = tr.$(".ccrests__store-address").innerText();
            writer.write(str + "\n");
        }


            writer.close();

    }
}

import Facebook.Utills.chromerunner;
import Facebook.stepObject.GallerySteps;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Gallety extends chromerunner {
    @Test
    public void checkFilter() throws IOException, BiffException {
        GallerySteps step = new GallerySteps();
        step.goToArtPage();

        String FilePath = "files/GalleryArt.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet1 = wb.getSheet("Sheet1");
        int totalNoOfRows = sheet1.getRows();
        for (int row = 0; row < totalNoOfRows; row++) {

            String yearRange = sheet1.getCell(0, row).getContents();
            System.out.println(sheet1.getCell(0, row).getContents());
            $(byText(yearRange)).click();

            sleep (4000);


        }

    }
}

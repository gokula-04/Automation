package selenium;
import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Excel {
    public static void main(String[] args) throws IOException, BiffException{
        Workbook wb = Workbook.getWorkbook(new File("H:/GOKUL/Seleniumpro/Ex files/kappal.xls"));
        Sheet sh = wb.getSheet("abc");
        for(int i=0; i<sh.getRows(); i++){
            System.out.println(sh.getCell(0, i).getContents());
            System.out.println(sh.getCell(1, i).getContents());
        }
    }
    
}

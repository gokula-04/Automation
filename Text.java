package selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {
    public static void main(String[] args) throws IOException {
         String path = "H:\\GOKUL\\Seleniumpro\\Ex files\\text.txt";
         @SuppressWarnings("resource")
        BufferedReader buff = new BufferedReader(new FileReader(path));
         String startLine;
         while ((startLine = buff.readLine())!=null){
            System.out.println(startLine);
            
         }
    }   
}

package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileInputStream file = new FileInputStream("H:\\GOKUL\\Seleniumpro\\Ex files\\sport.Properties");
        pro.load(file);
        System.out.println(pro.getProperty("name"));
        System.out.println(pro.getProperty("age"));
        System.out.println(pro.getProperty("number"));
        System.out.println(pro.getProperty("location"));
    }
    
}

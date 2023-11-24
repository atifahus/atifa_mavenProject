package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSONFile {
    public static String readJSON(String fileName){

        String filePath = System.getProperty("user.dir")+"/src/test/java/resources/"+fileName;
        File file = new File(filePath);

        try {
            FileReader fileReader = new FileReader(file);
            char[] characters = new char[(int)file.length()];
            fileReader.read(characters);
            return new String(characters);
        }
        catch (IOException ie){
            System.out.println(ie.getStackTrace());
            return null;
        }

    }
}

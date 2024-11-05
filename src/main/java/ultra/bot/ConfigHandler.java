package ultra.bot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ConfigHandler {

    //Returns discord token
    public static String getToken() {
        File file = new File("token.txt");

        String token = "";
        try {
            if (!file.exists()) file.createNewFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            token = bf.readLine();
        }
        catch(Exception e) {
            System.out.println("Couldn't find 'token.txt'");
        }
        return token;
    }
}

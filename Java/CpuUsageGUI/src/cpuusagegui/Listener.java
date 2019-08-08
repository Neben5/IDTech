package cpuusagegui;
import java.io.*;
import java.util.Scanner;
public class Listener {
    File file;
    String line;

    public Listener() throws Exception {
        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
    }

    public String listen() throws Exception {

        file = new File("plugin.yml");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        return line;
        reader.close();
    }
}


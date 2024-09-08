//J.U 9.5.24
//

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputFile {
    public static void main(String[] args) {

        try {
BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
writer.write("Writing to a file.");
writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
            e.printStackTrace();
        }





    }

package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();

        try {
            FileWriter outFile = new FileWriter("output");
            
            outFile.write(String.valueOf(c.anagramCheck("The Morse Code", "Here come dots")));
            outFile.write(String.valueOf(c.anagramCheck("Fourth of July", "Joyful Fourth")));
            outFile.write(String.valueOf(c.anagramCheck("Fourth of July", "Joyful Fourth  ")));
           
            outFile.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

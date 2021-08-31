package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 102, 103, 104, 105, 106, 109, 110, 120, 130, 140, 150, 200, 250, 14000 };
        try {
            FileWriter outFile = new FileWriter("output");
            
            
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 10)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 150)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 150)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 140)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 140)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 14000)));
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 14001)));
            
            outFile.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

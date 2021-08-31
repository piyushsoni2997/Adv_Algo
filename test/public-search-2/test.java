package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 102, 103, 104, 105, 106, 109, 110, 120, 130, 140, 150 };
        int array2[] = {};
        try {
            FileWriter outFile = new FileWriter("output");
            
            
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 10)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 150)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 150)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 140)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 140)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 14000)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 14001)));
            
            
	    outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 10)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 150)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 150)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 140)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 140)));
            
            
            
            
            outFile.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

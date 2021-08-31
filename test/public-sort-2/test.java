package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array1[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        try {
            FileWriter outFile = new FileWriter("output");
                        
            outFile.write(String.valueOf(c.countSwapsInInsertionSort(array1)));
            
            outFile.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

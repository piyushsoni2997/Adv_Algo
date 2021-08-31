package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int array2[] = {};
        try {
            FileWriter outFile = new FileWriter("output");
            
            outFile.write(String.valueOf(c.anagramCheck("aaaa", "10000")));
            outFile.write(String.valueOf(c.anagramCheck("sid", "dis")));
            outFile.write(String.valueOf(c.anagramCheck("racecar", "sidharth")));
            outFile.write(String.valueOf(c.anagramCheck("123456789", "987654321")));
            outFile.write(String.valueOf(c.anagramCheck("123456789", "9876543210")));

            
            outFile.write(String.valueOf(c.recursiveTernarySearch(array1, 10)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array1, 10000)));

            
            outFile.write(String.valueOf(c.recursiveTernarySearch(array2, 10)));
            outFile.write(String.valueOf(c.iterativeTernarySearch(array2, 10000)));
            
            outFile.write(String.valueOf(c.countSwapsInInsertionSort(array1)));
            outFile.write(String.valueOf(c.countSwapsInInsertionSort(array2)));
            
            outFile.close();

            // generate answer file ahead of time
            // FileWriter answerFile = new FileWriter("answer");
            // answerFile.write(String.valueOf(c.getCount()));
            // answerFile.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

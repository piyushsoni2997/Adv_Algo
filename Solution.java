package p0;


class Solution {

    public int  recursiveTernarySearch(int array[], int key) {
        
	// TODO: Implement this function
        int x= 0;
        return x;
    }
    
    public int iterativeTernarySearch(int array[], int key) {
    
//         // TODO: Implement this function
//         int low = 0, mid1, mid2;
//         int high = array.length - 1;
//         int[] temp;
//         int[] key = {key};
//         while (key!=array){
//             mid1 = low + Math.round((high - low)/3);
//             mid2 = high - Math.round((high - low)/3);
//             temp[0] = low;
//             temp[1] = high;
//             if (array[mid1]==key[0])
//             {
//                 return mid1;
//             }
//             else if (array[mid2]==key[0])
//             {
//                 return mid2;
//             }
//             else if (key[0]<array[mid1])
//             {
//                 high = mid1;
//             }
//             else if (array[mid2]<key[0])
//             {
//                 low = mid2;
//             }
//             else
//             {
//                 low, high = mid1, mid2;
//             }
//             if ([low, high]==temp){
//                 return null;
//             }
                
//         }
	return 0;
        
	 
    }
 

    public boolean anagramCheck(String str1, String str2)
    {
       // TODO: Implement this function    
        return true;
    }   
    
    
    public int countSwapsInInsertionSort(int array[])
    {
	// TODO: Implement this function
        int swaps = 0;
        int temp = 0;
        int n = array.length;
        int i, j, pointer;
        for (i = 1; i<n; i++){
            if (array[i-1]>array[i])
            {
                j = i-1;
                pointer = array[i];
                while ( (j>=0) && (array[j]>pointer)){
                    temp = array[j];
                    array[j] = pointer;
                    array[j+1] = temp;
                    --j;
                    ++swaps;
                }
            }
        }
        return swaps;
    }
    
}

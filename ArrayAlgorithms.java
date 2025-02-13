

public class ArrayAlgorithms {
    public static void main (String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // sum all of the elements
        // print the sum                      
        int totalSum = 0;
        for (int num : numbers){
            totalSum += num;
        }
        System.out.print(totalSum);

        //find the mean
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.print((double)totalSum/numbers.length);
        
        int biggestNumber = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > biggestNumber) {
                biggestNumber = num;
            }
            System.out.print(biggestNumber);
            
        }

        int[] counts = new int[biggestNumber + 1];
        for (int num : numbers) {
            counts[num]++;
        }
        int biggestCount = counts[0];
        int biggestCountIndex = 0;
        for (int i = 1; i < counts.length; i++){
            if (counts[i] > biggestCount) {
                biggestCount = counts[i];
                biggestCountIndex = i;
            }
        }
        System.out.print(biggestCountIndex);  

        int smallestNumber = Integer.MAX_VALUE;
        for(int currentNumber : numbers) {
            if (currentNumber < smallestNumber) {
                smallestNumber=currentNumber;
            }
            System.out.print(smallestNumber);
        }

        int[] reversed = new int[numbers.length];  
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - 1 - i] = numbers[i];  
        }
        for (int num : reversed) {
            System.out.print(num + " ");
        }

        int shift = 1;
        int[] shifted = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            shifted[(i + shift) %  numbers.length] = numbers[i];
        }
        for (int num : shifted) {
            System.out.print(num + " ");
        }
    }
}
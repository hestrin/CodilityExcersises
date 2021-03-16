package ex2;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        System.out.println(gap.calculateBinaryGap(0B00010101000));
    }

    public int calculateBinaryGap(int number){
        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println(binaryRepresentation);
        int biggestGapLength = 0;
        int currentGapLength = 0;
        for(int i = 0; i < binaryRepresentation.length(); i++){
            char c = binaryRepresentation.charAt(i);
            if(c == '0')
                currentGapLength++;
            else {
                if(biggestGapLength < currentGapLength) {
                    biggestGapLength = currentGapLength;
                }
                currentGapLength = 0;
            }
        }
        return Math.max(biggestGapLength, currentGapLength);
    }
}

package ex2;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        int argument = 0B1010;
        System.out.println(gap.calculateBinaryGap(argument));
        System.out.println(gap.calculateBinaryGapV2(argument));
    }

    public int calculateBinaryGap(int number) {
        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println(binaryRepresentation);
        int biggestGapLength = 0;
        int currentGapLength = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char c = binaryRepresentation.charAt(i);
            if (c == '0')
                currentGapLength++;
            else {
                if (biggestGapLength < currentGapLength) {
                    biggestGapLength = currentGapLength;
                }
                currentGapLength = 0;
            }
        }
        return Math.max(biggestGapLength, currentGapLength);
    }

    public int calculateBinaryGapV2(int number) {
        return (Arrays.stream(Integer.toBinaryString(number).split("1"))
                .map(String::length)
                .max(Comparator.naturalOrder()).orElse(0));
    }
}

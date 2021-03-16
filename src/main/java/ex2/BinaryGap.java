package ex2;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap gap = new BinaryGap();
        int argument = 0B1101001000;
        System.out.println("Gap in v1 is :" + gap.calculateBinaryGapV1(argument));
        System.out.println("Gap in v2 is :" + gap.calculateBinaryGapV2(argument));
    }

    public int calculateBinaryGapV1(int number) {
        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println(binaryRepresentation);
        int biggestGapLength = 0;
        int currentGapLength = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char c = binaryRepresentation.charAt(i);
            if (c == '0')
                currentGapLength++;
            else {
                if (biggestGapLength < currentGapLength)
                    biggestGapLength = currentGapLength;

                currentGapLength = 0;
            }
        }
// last sequences of zeros is not a binary gap
//        return Math.max(biggestGapLength, currentGapLength);
        return biggestGapLength;
    }

    public int calculateBinaryGapV2(int number) {
        //should remove trailing zeros
//        System.out.println("Trailing zeros " + Integer.numberOfTrailingZeros(number));
        String binaryString = Integer.toBinaryString(number);
        String withoutTrailingZeros = binaryString.substring(0, binaryString.lastIndexOf("1"));
        return (Arrays.stream(withoutTrailingZeros.split("1"))
                .map(String::length)
                .max(Comparator.naturalOrder()).orElse(0));
    }
}

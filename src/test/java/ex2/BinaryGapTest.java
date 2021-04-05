package ex2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

    BinaryGap gap = new BinaryGap();

    @Test
    void scenario1() {
        int number = 0B1000;
        System.out.println("Binary value: " + Integer.toString(number, 2));
        System.out.println("Octal value: " + Integer.toOctalString(number));
        System.out.println("Decimal value: " + Integer.toString(number, 10));
        System.out.println("Hexagonal value: " + Integer.toHexString(number));
//        assertThat(gap.calculateBinaryGapV1(number)).isEqualTo(4);
//        assertThat(gap.calculateBinaryGapV2(number)).isEqualTo(4);
    }

}

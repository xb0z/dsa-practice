package com.github.xb0z.dsapractice.jzoffer;

import java.util.Arrays;

/**
 * 扑克牌顺子
 * <a link="https://www.nowcoder.com/practice/762836f4d43d43ca9deb273b3de8e1f4">在线</a>
 */
public class PokerContinuous {

    public boolean isContinuous(int[] numbers) {
        if (numbers.length < 5) return false;
        Arrays.sort(numbers);

        int zeroCount = 0;
        for (int i = 0; i < numbers.length && numbers[i] == 0; i++) {
            zeroCount++;
        }
        for (int i = zeroCount + 1; i < numbers.length; i++) {
            int gap = numbers[i] - numbers[i - 1];
            if (gap == 0) return false;
            zeroCount -= gap - 1;
        }
        return zeroCount >= 0;
    }
}

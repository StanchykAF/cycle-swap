package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if (array.length != 0){
            int[] buf = Arrays.copyOf(array, array.length);
            System.arraycopy(buf, 0, array, 1, buf.length - 1);
            array[0] = buf[buf.length - 1];
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if ((array.length != 0) && (shift != array.length)) {
            int[] buf = Arrays.copyOf(array, array.length);
            System.arraycopy(buf, 0, array, shift, buf.length - shift);
            System.arraycopy(buf, buf.length - shift, array, 0, shift);
        }
    }
}

package com.heapspace.solutions.leetcode;

public class Overflow {


    public void flow() {
        int i = 1;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i *= 2);
        }
    }

    public static void main(String args[]) {

        Overflow of = new Overflow();
        of.flow();

    }
}

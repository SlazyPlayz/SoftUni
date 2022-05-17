package com.company;

import java.util.Scanner;

public class Testr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append("duma");
        String substr = sb.substring(0, 2);
        System.out.println(substr);
    }
}

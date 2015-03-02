package com.company;

public class MyString {

    private static final int CODE_ZERO = (int)'0';

    public static String changeRegister(String str) {
        char[] s = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s) {
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else {
                ch = Character.toLowerCase(ch);
            }
            if (Character.isDigit(ch)) {
                switch (ch) {
                    case '1':
                        ch = '2';
                        break;
                    case '2':
                        ch = '3';
                        break;
                    case '3':
                        ch = '4';
                        break;
                    case '4':
                        ch = '5';
                        break;
                    case '5':
                        ch = '6';
                        break;
                    case '6':
                        ch = '7';
                        break;
                    case '7':
                        ch = '8';
                        break;
                    case '8':
                        ch = '9';
                        break;
                    case '9':
                        ch = '0';
                        break;
                    case '0':
                        ch = '1';
                        break;
                }
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static int summ(String str) throws NumberFormatException {
        char[] chars = str.toCharArray();
        int i = 0;
        int sum = 0;
        if (Character.isDigit(chars[i])) {
            sum += (int)chars[i] - CODE_ZERO;
        } else {
            throw new NumberFormatException("Ожидалось число");
        }
        i++;
        Boolean changeSign;
        while (i < chars.length) {
            if (chars[i] == '+' || chars[i] == '-') {
                changeSign = chars[i] == '-';
            } else {
                throw new NumberFormatException("Ожидался знак");
            }
            i++;
            if (Character.isDigit(chars[i])) {
                if (changeSign) {
                    sum -= (int) chars[i] - CODE_ZERO;
                } else {
                    sum += (int) chars[i] - CODE_ZERO;
                }
            } else {
                throw new NumberFormatException("Ожидалось число");
            }
            i++;
        }
        return sum;
    }

    public static int numberOfSubString(String str, String sub) {
        return 0;
    }

    public static String changeLastSub(String str, String sub, String substitute) {

        return str;
    }

    public static String toDoubleChar(String str, char ch) {

        return str;
    }
}

package com.company;

public class MyString {

    private static final int CODE_ZERO = (int) '0';

    /**
     * Возвращает строку в которой у всех символов сменен регист, все цифры увеличены на единицу, а девятка заменена нулём
     *
     * @param str исходная строка
     * @return строку в которой у всех символов сменен регист, все цифры увеличены на единицу, а девятка заменена нулём
     */
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
                ch = ch == '9'
                        ? '0'
                        : (char) (ch + 1);
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    /**
     * Возвращает сумму цифр записаных в строку str
     *
     * @param str исходная строка
     * @return сумму цифр записаных в строку
     * @throws NumberFormatException
     */
    public static int summ(String str) throws NumberFormatException {
        char[] chars = str.toCharArray();
        int i = 0;
        int sum = 0;
        if (Character.isDigit(chars[i])) {
            sum += (int) chars[i] - CODE_ZERO;
        } else {
            throw new NumberFormatException("Ожидалось число");
        }
        i++;
        boolean changeSign;
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

    /**
     * Возвращает число подстрок sub в строке str
     *
     * @param str исходная строка
     * @param sub искомая подстрока
     * @return число подстрок sub в строке str
     */
    public static int numberOfSubString(String str, String sub) {
        String s = str;
        int num = 0;
        if ("".equals(sub)) {
            return -1;
        } else {
            while (s.contains(sub)) {
                s = s.substring(s.indexOf(sub) + sub.length());
                num++;
            }
            return num;
        }
    }

    /**
     * Возвращает строку str в которой последняя подстрока sub заменена на строку substitute
     *
     * @param str        исходная строка
     * @param sub        заменяемая подстрока
     * @param substitute строка заменитель
     * @return строку str в которой последняя подстрока sub заменена на строку substitute
     */
    public static String changeLastSub(String str, String sub, String substitute) {
        String s = str;
        if (!s.contains(sub)) {
            return s;
        } else {
            String endOfS = s.substring(s.lastIndexOf(sub) + sub.length());
            s = s.substring(0, s.lastIndexOf(sub));
            s += substitute + endOfS;
            return s;
        }
    }

    /**
     * Возвращает строку в которой удвоено каждое вхождение символа ch
     *
     * @param str исходная строка
     * @param ch  удваеваемый символ
     * @return строку в которой удвоено каждое вхождение символа ch
     */
    public static String toDoubleChar(String str, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char currentChar : str.toCharArray()) {
            stringBuilder.append(currentChar);
            if (currentChar == ch) {
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }
}

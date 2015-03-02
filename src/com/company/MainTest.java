package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testChangeRegister() {
        assertEquals(MyString.changeRegister("a"), "A");
        assertEquals("2", MyString.changeRegister("1"));
        assertEquals(MyString.changeRegister("9"), "0");
        assertEquals(MyString.changeRegister(""), "");
        assertEquals(MyString.changeRegister("FKJ HYKC///fhe wkj/n__7 84yur9  "), "fkj hykc///FHE WKJ/N__8 95YUR0  ");
    }

    @Test
    public void testSumm() throws NumberFormatException {
        assertEquals(1, MyString.summ("1"));
        assertEquals(4, MyString.summ("2+4+1+5-2-7-4+5-0"));
    }

    @Test
    public void testNumberOfSubString() {
        assertEquals(3, MyString.numberOfSubString("baabaabbabadabaaabba", "aab"));
        assertEquals(11, MyString.numberOfSubString("baabaabbabadabaaabba", "a"));
        assertEquals(3, MyString.numberOfSubString("aaa", "a"));
    }

    @Test
    public void testCangeLastSub() {
        assertEquals("", MyString.changeLastSub("", "", ""));
        assertEquals("",MyString.changeLastSub("", "", ""));
    }

    @Test
    public void testToDoubleChar() {
        assertEquals("", MyString.toDoubleChar("", 'a'));
    }

    @Test
    public void testToDoubleChar1() {
        assertEquals("", MyString.toDoubleChar("", 'a'));
    }

    @Test(expected = Exception.class)
    public void testExceptionSumm() throws NumberFormatException{
        MyString.summ("12+4");
    }

    @Test(expected = Exception.class)
    public void testException2Summ() throws NumberFormatException{
        MyString.summ("1+2-4+a");
    }
}
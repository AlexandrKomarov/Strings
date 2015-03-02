package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testChangeRegister() {
        assertEquals(MyString.cangeRegister("a"), "A");
        assertEquals(MyString.cangeRegister("1"), "2");
        assertEquals(MyString.cangeRegister("9"), "0");
        assertEquals(MyString.cangeRegister(""), "");
        assertEquals(MyString.cangeRegister("FKJ HYKC///fhe wkj/n__7 84yur9  "), "fkj hykc///FHE WKJ/N__8 95yur0  ");
    }

    @Test
    public void testSumm() {
        assertEquals(6, MyString.summ("2+4+1+5-2-7-4+5-0"));
    }

    @Test
    public void testNumberOfSubString(){
        assertEquals(3,MyString.numberOfSubString("baabaabbabadabaaabba", "aab"));
    }

    @Test
    public void testCangeLastSub(){
        assertEquals("",MyString.cangeLastSub("", ""));
    }

    @Test
    public void testToDoubleChar(){
        assertEquals("",MyString.toDoubleChar("", 'a'));
    }

    @Test
    public void testToDoubleChar1(){
        assertEquals("",MyString.toDoubleChar("",'a'));
    }
}
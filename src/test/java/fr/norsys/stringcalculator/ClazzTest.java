package fr.norsys.stringcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ClazzTest {


    
    @Test
    @DisplayName("Giving empty string ")
    public void Giving_empty_string() {

        Clazz clazz = new Clazz();

        Assertions.assertEquals(0,clazz.Add(""));
        

    }

    @Test
    @DisplayName("Giving an unknow amount of numbers string ")
    public void Giving_unknow_of_numbers() {

        Clazz clazz = new Clazz();

        Assertions.assertEquals(30,clazz.Add("1,5,6,8,10"));
        Assertions.assertEquals(116,clazz.Add("11,12,0,6,7,80"));
        Assertions.assertEquals(82,clazz.Add("1,5,6,8,10,1,2,4,7,8,5,9,6,3,2,5"));
        

    }

    @Test
    @DisplayName("  handle new line between numbers  ")
    public void new_line_between_numbers() {

        Clazz clazz = new Clazz();

        Assertions.assertEquals(30,clazz.Add("1\n5\n6\n8\n10"));
        Assertions.assertEquals(50,clazz.Add("1\n5,6\n8,10\n20"));

    }

}
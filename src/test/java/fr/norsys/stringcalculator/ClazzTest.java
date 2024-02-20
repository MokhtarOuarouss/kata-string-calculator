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

        Assertions.assertEquals(5,clazz.Add("1,5,6,8,10"));
        Assertions.assertEquals(8,clazz.Add("11,12,555,96,0,6,7,80"));
        Assertions.assertEquals(16,clazz.Add("1,5,6,8,10,1,2,4,7,8,5,9,6,3,2,5"));
        

    }

}
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

}
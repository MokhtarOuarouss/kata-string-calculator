package fr.norsys.stringcalculator;


public class Clazz {

    public int Add(String numbers){


        if (numbers.isEmpty()) {
                return 0;
            }

        String[] split_numbers = numbers.split("[,\n]");
        
        int sum = 0;
        for (int i = 0; i < split_numbers.length; i++) {
            sum  += Integer.parseInt(split_numbers[i]);
        }
        


        return sum;
    }
}
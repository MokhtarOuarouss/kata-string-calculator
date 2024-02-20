package fr.norsys.stringcalculator;


public class Clazz {

    public int Add(String numbers){


        if (numbers.isEmpty()) {
                return 0;
            }

        String[] split_numbers = numbers.split("[,\n]");
        int[] nbrs = new int[split_numbers.length];

        for (int i = 0; i < split_numbers.length; i++) {
            nbrs[i] = Integer.parseInt(split_numbers[i]);
        }
        


        return nbrs.length;
    }
}
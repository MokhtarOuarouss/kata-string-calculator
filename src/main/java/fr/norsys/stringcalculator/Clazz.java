package fr.norsys.stringcalculator;
import java.util.*;


public class Clazz {

    public int Add(String numbers){


        if (numbers.isEmpty()) {
                return 0;
            }

        String[] split_numbers ;

        if (numbers.startsWith("//")) {
            //case of \n being the spliter
            if (numbers.startsWith("//\n")){
                String spliter = "\n";
                numbers  = numbers.replace("//\n\n", "");
                split_numbers = numbers.split(spliter);
            }
            else {
                String[] parts = numbers.split("\n", 2);
                numbers = parts[1];

                split_numbers = numbers.split(parts[0].substring(2));
            }
            
        }

        else {
            split_numbers = numbers.split("[,\n]");
        }

        
        
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String numStr : split_numbers) {
            int num = Integer.parseInt(numStr.trim());

            if (num < 0) {
                negativeNumbers.add(num);
            } else {
                if (num <= 1000) sum += num;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Input must be positive: " + negativeNumbers);
        }
        

        else return sum;
    }
}
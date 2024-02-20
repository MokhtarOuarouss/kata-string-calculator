package fr.norsys.stringcalculator;


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
        for (int i = 0; i < split_numbers.length; i++) {
            sum  += Integer.parseInt(split_numbers[i]);
        }
        


        return sum;
    }
}
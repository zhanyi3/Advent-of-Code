import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        while (sc.hasNext()) {
            String rucksack = sc.nextLine();
            int itemsPerCompartment = rucksack.length() / 2;
            String left = rucksack.substring(0, itemsPerCompartment - 1);
            String right = rucksack.substring(itemsPerCompartment, rucksack.length() - 1);
            


        sc.close();
    }

}

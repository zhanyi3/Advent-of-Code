import java.util.Scanner;
import java.util.ArrayList;

class CalorieCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int current = 0;

        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                list.add(current);
                current = 0;
            } else {
                current += Integer.valueOf(input);
            }
        }
        sc.close();

        list.sort((x, y) -> y - x);
        System.out.println(list.get(0) + list.get(1) + list.get(2));
    }
}

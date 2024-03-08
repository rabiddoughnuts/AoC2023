import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AoC2023Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        //String input = "input.txt";
        File file = new File("input.txt");
        Scanner inscan = new Scanner(file);
        int total = 0;
        int first = 0;
        int second = 0;
        // biggest number spelled out is nine
        while (inscan.hasNextLine()) {
            String line = inscan.nextLine();
            for (char c : line.toCharArray()) {
                if (Character.isDigit(c)){
                    if (first == 0){
                        first = c - '0';
                    } else {
                        second = c - '0';
                    }
                }
            }
            if (second == 0){
                second = first;
            }
            System.out.println(first + " " + second);
            String combine = String.valueOf(first) + String.valueOf(second);
            first = 0;
            second = 0;
            total = total + Integer.parseInt(combine);
        }
        inscan.close();
        System.out.println(total);
    }
}

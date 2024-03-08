import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class AoC2023Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        String input = "input.txt";
        File file = new File(input);
        Scanner inscan = new Scanner(file);
        int total = 0;
        int first = 0;
        int second = 0;
        while (inscan.hasNextLine()) {
            String line = inscan.nextLine();
            for (char c : line.toCharArray()) {
                if (first == 0){
                    first = c;
                } else {
                    second = c;
                }
            }
            if (second == 0){
                second = first;
            }
            String combine = String.valueOf(first) + String.valueOf(second);
            first = 0;
            second = 0;
            total += Integer.parseInt(combine);
        }
        inscan.close();
        System.out.println(total);
    }
}

package labactivity2;

import java.util.Scanner;

public class LabActivity2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the message: ");
       
        String metoo = scanner.nextLine();
        
        detectMisplacedCapital(metoo);
    }

    public static void detectMisplacedCapital(String metoo) {
        int found = 0;
        for (int i = 1; i < metoo.length(); i++) {
            if (metoo.charAt(i) >= 'A' && metoo.charAt(i) <= 'Z' && metoo.charAt(i - 1) >= 'a' && metoo.charAt(i - 1) <= 'z') {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
}

package ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Cornor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list "+ input_name + " is: "+ (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found"+input_name+" in the list.");
    }
}

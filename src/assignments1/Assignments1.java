package assignments1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignments1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Bài tập 1 và Bài tập 1*
            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Năm sinh (dd/MM/yyyy): ");
            Date birthDate = dateFormat.parse(scanner.nextLine());

            System.out.print("Giới tính: ");
            String gender = scanner.nextLine();

            System.out.print("Chuyên ngành: ");
            String major = scanner.nextLine();

            System.out.print("GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Quê quán: ");
            String hometown = scanner.nextLine();

            // Hiển thị thông tin cá nhân
            System.out.println("\nThông tin cá nhân:");
            System.out.println("Tên: " + name);
            System.out.println("Tuổi: " + age);
            System.out.println("Năm sinh: " + dateFormat.format(birthDate));
            System.out.println("Giới tính: " + gender);
            System.out.println("Chuyên ngành: " + major);
            System.out.println("GPA: " + gpa);
            System.out.println("Quê quán: " + hometown);

            // Bài tập 2: Kiểm tra xem dữ liệu nhập có phải là chuỗi không
            System.out.print("\nNhập dữ liệu để kiểm tra chuỗi: ");
            String inputString = scanner.nextLine();
            System.out.println("Dữ liệu nhập vào là chuỗi: " + inputString);

            // Bài tập 3: Kiểm tra xem dữ liệu nhập có phải là số nguyên không
            System.out.print("\nNhập dữ liệu để kiểm tra số nguyên: ");
            if (scanner.hasNextInt()) {
                int inputInt = scanner.nextInt();
                System.out.println("Dữ liệu nhập vào là số nguyên: " + inputInt);
            } else {
                System.out.println("Dữ liệu nhập không phải là số nguyên.");
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

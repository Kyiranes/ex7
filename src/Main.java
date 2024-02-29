import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name and your email address: ");
        String name = input.nextLine();
        String emailAddress = input.nextLine();
        PersonalContactInfo info = new PersonalContactInfo(name, emailAddress);
        info.displayInfo();
        System.out.println("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        BusinessContactInfo info2 = new BusinessContactInfo(name, emailAddress, phoneNumber);
        info2.displayInfo();
    }
}
public class PersonalContactInfo {
    public PersonalContactInfo(String firstName, String emailAddress) {
        this.firstName = firstName;
        this.emailAddress = emailAddress;
    }

    String firstName;
    String emailAddress;
    void displayInfo() {
        System.out.println(this.firstName);
        System.out.println(this.emailAddress);
    }
}

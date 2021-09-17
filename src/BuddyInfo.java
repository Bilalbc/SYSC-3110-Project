public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this("Bilal", "Carleton", "613");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Bilal", "Carleton", "613");

        System.out.println("Hello " + buddy.getName());
    }
}

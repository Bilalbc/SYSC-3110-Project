public class BuddyInfo {

    private String name;

    private int age;

    public BuddyInfo() {
        this("Bilal", 19);
    }

    public BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Bilal", 19);

        System.out.println("Hello " + buddy.getName());
    }
}

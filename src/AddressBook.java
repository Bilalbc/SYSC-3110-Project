import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public AddressBook(){
        addressBook.add(new BuddyInfo());
        addressBook.add(new BuddyInfo("Akshay", "Carleton", "613"));
        addressBook.add(new BuddyInfo("Matthew", "Carleton", "613"));
        addressBook.add(new BuddyInfo("Vin", "Carleton", "613"));
    }

    public void addBuddy(BuddyInfo buddy) {
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        if (addressBook.contains(buddy)){
            addressBook.remove(buddy);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Scott", "Waterloo", "613");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }


}

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public AddressBook(){
        addressBook.add(new BuddyInfo());
        addressBook.add(new BuddyInfo("Akshay", 20));
        addressBook.add(new BuddyInfo("Matthew", 20));
        addressBook.add(new BuddyInfo("Vin", 20));
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
    }


}

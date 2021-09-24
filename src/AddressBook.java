import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Scott", "Waterloo", "613");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }


}

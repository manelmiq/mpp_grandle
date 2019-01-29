package SE3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		for(LibraryMember libraryMember : members){
			CheckoutRecord checkoutRecord = libraryMember.getCheckoutRecord();
			for(CheckoutRecordEntry checkoutRecordEntry :checkoutRecord.getCheckoutRecordEntryList()){
				if(checkoutRecordEntry.getLendingItem().equals(item)){
					phoneNums.add(libraryMember.getPhone());
				}
			}
		}
		Collections.sort(phoneNums);
		//implement
		return phoneNums;
	}
}

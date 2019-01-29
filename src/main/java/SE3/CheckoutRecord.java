package SE3;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    public List<CheckoutRecordEntry> getCheckoutRecordEntryList() {
        return checkoutRecordEntryList;
    }

    private List<CheckoutRecordEntry> checkoutRecordEntryList;

    public CheckoutRecord() {
        checkoutRecordEntryList = new ArrayList<>();
    }

    public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry){
        checkoutRecordEntryList.add(checkoutRecordEntry);
    }

}

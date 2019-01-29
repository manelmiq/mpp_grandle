package SE3;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LendingItem LendingItem;
    private ItemType itemType;


    public LocalDate getDueDate() {
        return dueDate;
    }

    private LocalDate dueDate;

    public CheckoutRecordEntry(SE3.LendingItem lendingItem, LocalDate checkoutDate,  LocalDate dueDate, ItemType itemType) {
        this.checkoutDate = checkoutDate;
        LendingItem = lendingItem;
        this.dueDate = dueDate;
        this.itemType = itemType;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public SE3.LendingItem getLendingItem() {
        return LendingItem;
    }

    public void setLendingItem(SE3.LendingItem lendingItem) {
        LendingItem = lendingItem;
    }
}

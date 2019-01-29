package SE3;

import java.util.Objects;

public class CD extends  LendingItem{
	private String productId;
	private String title;
	private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD)) return false;
        CD cd = (CD) o;
        return Objects.equals(productId, cd.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}

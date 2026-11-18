import java.math.BigDecimal;

public class Cash extends Asset {

    public Cash(String description, String dateAcquired, int originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}

package ch.sebooom.domain.stockexchange.prix;

import ch.sebooom.domain.ValueObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by seb on 01.11.16.
 */
public class Variation implements ValueObject<Variation> {

    private Operation operation;
    private BigDecimal taux;
    public final static int BIG_DECIMAL_SCALE = 3;
    public final static RoundingMode ROUNDING_MODE = RoundingMode.UP;


    public static Variation from (Operation operation,double taux) {
        return new Variation(
                checkNotNull(operation),
                checkNotNull(taux));
    }

    @Override
    public String toString() {
        return "Variation{" +
                operation.signe +
                " " + taux +
                "%}";
    }

    private Variation(Operation operation, double taux){
        this.operation = operation;
        this.taux = new BigDecimal(taux).setScale(BIG_DECIMAL_SCALE, ROUNDING_MODE);
    }

    public Operation operation() {
        return operation;
    }

    public BigDecimal taux() {
        return taux;
    }


    public boolean sameValueAs(Variation var) {
        if (this == var) return true;
        if (!(var instanceof Variation)) return false;

        Variation variation =  var;

        if (!operation.equals(variation.operation())) return false;
        return taux.equals(variation.taux());
    }
}

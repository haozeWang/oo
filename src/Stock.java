/**
 * Created by haozewang on 17/6/7.
 */
public abstract class Stock {
    public abstract double getPrice();
    public abstract double getAnnualInterestRate();
    public abstract double getRisk();
    public abstract void add(Stock stock);
    public abstract void remove(Stock stock);
}

/**
 * Created by haozewang on 17/6/7.
 */
public class SingleStock extends Stock{
    private String name;
    private double price;
    private double annualInterestRate;
    private double risk;                         // the possible that the price of the stock decrease


    public SingleStock(String name, double price, double annualInterestRate, double risk){
        this.name = name;
        this.price = price;
        this.annualInterestRate = annualInterestRate;
        this.risk = risk;
    }

    public String getName(){
        return this.name;
    }

    public  double getPrice(){
        return this.price;
    }

    public  double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public  double getRisk(){
        return this.risk;
    }

    @Override
    public void add(Stock stock) {

    }

    @Override
    public void remove(Stock stock) {

    }
}

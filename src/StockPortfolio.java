import java.util.Iterator;

/**
 * Created by haozewang on 17/6/7.
 */
public class StockPortfolio extends Stock{
    private String name;
    private Stock[] stocks;
    private double[] proportion;
    private double[] price;
    private double[] annualInterestRate;
    private double[] risk;

    public String getName(){
        return name;
    }

    public double getPrice(){
        double res = 0;
        for(int i = 0; i < stocks.length; i++){
            res += proportion[i] * price[i];
        }
        return res;
    }


    public double getAnnualInterestRate(){
        double res = 0;
        for(int i = 0; i < stocks.length; i++){
            res += proportion[i] * annualInterestRate[i];
        }
        return res;
    }

    public double getRisk(){
        double res = 0;
        for(int i = 0; i < stocks.length; i++){
            res += proportion[i] * risk[i];
        }
        return res;
    }



    public Iterator<Stock> getIterator(){
        return new StockIterator(stocks);
    }

    public Stock[] getStocks(){
        return stocks;
    }


    public double[] getProportion(){
        return proportion;
    }

    @Override
    public void add(Stock stock) {

    }

    @Override
    public void remove(Stock stock) {

    }
}

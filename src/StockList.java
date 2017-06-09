import java.util.Iterator;

/**
 * Created by haozewang on 17/6/8.
 */
public class StockList extends Stock {

    private Stock[] stocks;
    private double[] proportion;
    int index;


    public StockList(){
        stocks = new Stock[1000];
        index = 0;
    }

    @Override
    public void add(Stock stock){
        if(index < 1000) {
            stocks[index] = stock;
            index++;
        }
        else System.out.println("Can not add any more stock");
    }


    @Override
    public void remove(Stock stock){
        for(int index = 0; index < stocks.length; index++){
            if(stock == stocks[index]){
                for (int i=index-1; i<(stocks.length-1); ++i) {
                    stocks[i] = stocks[i+1];
                }
                stocks[stocks.length-1] = null;
                return;
            }
        }
        System.out.println("Does not have this element");
    }




    @Override
    public double getPrice() {
        double res = 0;
         for(int i = 0; i < stocks.length; i++){
             res += proportion[i]*stocks[i].getPrice();
         }
         return res;
    }

    @Override
    public double getAnnualInterestRate() {
        double res = 0;
        for(int i = 0; i < stocks.length; i++){
            res += proportion[i]*stocks[i].getAnnualInterestRate();
        }
        return res;
    }

    @Override
    public double getRisk() {
        double res = 0;
        for(int i = 0; i < stocks.length; i++){
            res += proportion[i]*stocks[i].getRisk();
        }
        return res;
    }

    public Iterator<Stock> getIterator(){
        return new StockIterator(stocks);
    }






}

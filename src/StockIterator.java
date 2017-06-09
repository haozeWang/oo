import java.util.Iterator;

/**
 * Created by haozewang on 17/6/7.
 */
public class StockIterator implements Iterator<Stock>{
    private Stock[] stocks;
    int index;

    public StockIterator(Stock[] stocks){
        this.stocks = stocks;
        index = 0;
    }

    public boolean hasNext(){
        return index<stocks.length && stocks[index]!= null;
    }

    public Stock next(){
        if(index < stocks.length){
            Stock stock = stocks[index];
            index++;
            return stock;
        }
        else return null;
    }


    public void remove(){
        if(index <= 0 ){
            System.out.println("You can't remove an item until you've done at least one next()");
        }
        else{
            if (stocks[index-1] != null) {
                for (int i=index-1; i<(stocks.length-1); ++i) {
                    stocks[i] = stocks[i+1];
                }
                stocks[stocks.length-1] = null;
            }
        }
    }



}

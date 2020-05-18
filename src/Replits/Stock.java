package Replits;

public class Stock {
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        tickerSymbol = tickerSymbol.toUpperCase();
        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares * price;
    }


    public void adjustedPrice(int value) {
        int temp = price;
        price = price + value;
        percentChange = ((double) (price - temp)) / temp;
        marketCap = totalShares * price;

    }


    public String toString() {
        return
                "Ticker Symbol:" + tickerSymbol + "\n" +
                        "Company Name:" + companyName + "\n" +
                        "Current Price: " + price + " (" + percentChange + ")" + "\n" +
                        "MarketCap=" + marketCap
                ;
    }

    public static void main(String[] args) {
        Stock obj1 = new Stock("GOOG", "Google, Inc.", 802, 7);
        System.out.println(obj1);
    }
}


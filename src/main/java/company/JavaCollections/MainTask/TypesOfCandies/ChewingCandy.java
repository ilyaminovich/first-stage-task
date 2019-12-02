package main.java.company.JavaCollections.MainTask.TypesOfCandies;

public class ChewingCandy extends Candies {

    public double gelatinContentInTheChewingCandy;

    public ChewingCandy(int weight, int cost, String nameOfTheCandy, double sugarContentInTheCandy, double gelatinContentInTheChewingCandy) {
        super(weight, cost, nameOfTheCandy, sugarContentInTheCandy);
        this.gelatinContentInTheChewingCandy = gelatinContentInTheChewingCandy;
    }

    public double getGelatinContentInTheChewingCandy() {
        return gelatinContentInTheChewingCandy;
    }

    public void setGelatinContentInTheChewingCandy(double gelatinContentInTheChewingCandy) {
        this.gelatinContentInTheChewingCandy = gelatinContentInTheChewingCandy;
    }

    @Override
    public String toString() {
        return "ChewingCandy{" +
                " weight=" + weight + " grams" +
                ", cost=" + cost + "$" +
                ", nameOfTheCandy='" + nameOfTheCandy + '\'' +
                ", sugarContentInTheCandy=" + sugarContentInTheCandy + " grams" +
                "gelatinContentInTheChewingCandy=" + gelatinContentInTheChewingCandy + " grams" +
                '}' + "\n";
    }
}

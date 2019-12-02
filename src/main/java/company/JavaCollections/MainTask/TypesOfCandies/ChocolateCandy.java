package main.java.company.JavaCollections.MainTask.TypesOfCandies;

public class ChocolateCandy extends Candies {

    public double cacaoContentInTheChocolateCandy;

    public ChocolateCandy(int weight, int cost, String nameOfTheCandy, double sugarContentInTheCandy, double cacaoContentInTheChocolateCandy) {
        super(weight, cost, nameOfTheCandy, sugarContentInTheCandy);
        this.cacaoContentInTheChocolateCandy = cacaoContentInTheChocolateCandy;
    }

    public double getCacaoContentInTheChocolateCandy() {
        return cacaoContentInTheChocolateCandy;
    }

    public void setCacaoContentInTheChocolateCandy(double cacaoContentInTheChocolateCandy) {
        this.cacaoContentInTheChocolateCandy = cacaoContentInTheChocolateCandy;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                " weight=" + weight + " grams" +
                ", cost=" + cost + "$" +
                ", nameOfTheCandy='" + nameOfTheCandy + '\'' +
                ", sugarContentInTheCandy=" + sugarContentInTheCandy + " grams" +
                "cacaoContentInTheChocolateCandy=" + cacaoContentInTheChocolateCandy + " grams" +
                '}' + "\n";
    }
}

package main.java.company.JavaCollections.MainTask.TypesOfCandies;

public class PeanutCandy extends Candies {

    public double weightOfPeanut;

    public PeanutCandy(int weight, int cost, String nameOfTheCandy, double sugarContentInTheCandy, double weightOfPeanut) {
        super(weight, cost, nameOfTheCandy, sugarContentInTheCandy);
        this.weightOfPeanut = weightOfPeanut;
    }

    public double getWeightOfPeanut() {
        return weightOfPeanut;
    }

    public void setWeightOfPeanut(double weightOfPeanut) {
        this.weightOfPeanut = weightOfPeanut;
    }

    @Override
    public String toString() {
        return "PeanutCandy{" +
                ", weight=" + weight + "grams" +
                ", cost=" + cost + "$" +
                ", nameOfTheCandy='" + nameOfTheCandy + '\'' +
                ", sugarContentInTheCandy=" + sugarContentInTheCandy + "grams" +
                "weightOfPeanut=" + weightOfPeanut + "grams" +
                '}' + "\n";
    }
}

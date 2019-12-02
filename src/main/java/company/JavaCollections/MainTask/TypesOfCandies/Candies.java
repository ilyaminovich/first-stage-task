package main.java.company.JavaCollections.MainTask.TypesOfCandies;

public abstract class Candies {
    public int weight;
    public int cost;
    public String nameOfTheCandy;
    public double sugarContentInTheCandy;

    public Candies(int weight, int cost, String nameOfTheCandy, double sugarContentInTheCandy) {
        this.weight = weight;
        this.cost = cost;
        this.nameOfTheCandy = nameOfTheCandy;
        this.sugarContentInTheCandy = sugarContentInTheCandy;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNameOfTheCandy() {
        return nameOfTheCandy;
    }

    public void setNameOfTheCandy(String nameOfTheCandy) {
        this.nameOfTheCandy = nameOfTheCandy;
    }

    public double getSugarContentInTheCandy() {
        return sugarContentInTheCandy;
    }

    public void setSugarContentInTheCandy(double sugarContentInTheCandy) {
        this.sugarContentInTheCandy = sugarContentInTheCandy;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", nameOfTheCandy='" + nameOfTheCandy + '\'' +
                ", sugarContentInTheCandy=" + sugarContentInTheCandy + " grams " +
                '}' + "\n";
    }

    public void createRangeOfSugarContent(int beginningOfRange, int endOfRange) {
        if (getSugarContentInTheCandy() > beginningOfRange & getSugarContentInTheCandy() < endOfRange) {
            System.out.println("Candy from sugar range content: " + this.nameOfTheCandy);
        }
    }
}
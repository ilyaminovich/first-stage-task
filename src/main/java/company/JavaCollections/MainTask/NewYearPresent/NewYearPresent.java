package company.JavaCollections.MainTask.NewYearPresent;

import company.JavaCollections.MainTask.TypesOfCandies.Candies;
import company.JavaCollections.MainTask.TypesOfCandies.ChewingCandy;
import company.JavaCollections.MainTask.TypesOfCandies.ChocolateCandy;
import company.JavaCollections.MainTask.TypesOfCandies.PeanutCandy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewYearPresent {

    public static void main(String[] args) {

        double weightOfNewYearPresent = 0;

        List<Candies> candies = new ArrayList<>();
        Candies alpengold = new ChocolateCandy(100, 2, "Alpen Gold", 2.4, 2.1);
        Candies bonpari = new ChewingCandy(800, 3, "Bon-pari", 3.2, 12.8);
        Candies oreo = new ChocolateCandy(20000, 100, "Oreo", 12.1, 12.2);
        Candies spartak = new PeanutCandy(1000, 123, "Spartak", 12.8, 1);

        candies.add(alpengold);
        candies.add(bonpari);
        candies.add(oreo);
        candies.add(spartak);

        for (int i = 0; i < candies.size(); i++) {
            weightOfNewYearPresent += candies.get(i).weight;
        }
        System.out.println("Weight of New Year present: " + weightOfNewYearPresent + " grams");

        candies.sort((o1, o2) -> o1.getWeight() - o2.getWeight());
        System.out.println("Candies sorted by weight: " + "\n" + candies);

        Iterator<Candies> candiesIterator = candies.iterator();
        while (candiesIterator.hasNext()) {
            candiesIterator.next().createRangeOfSugarContent(10, 15);
        }
    }
}
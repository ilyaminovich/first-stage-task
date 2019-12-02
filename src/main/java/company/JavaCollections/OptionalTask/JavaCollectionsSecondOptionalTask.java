package company.JavaCollections.OptionalTask;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionsSecondOptionalTask {
    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        poem.add(0, "Ночь, улица, фонарь, аптека");
        poem.add(1, "Бессмысленный и тусклый свет.");
        poem.add(2, "Живи ещё хоть четверть века -");
        poem.add(3, "Всё будет так. Исхода нет.");
        poem.add(4, "Умрёшь - начнёшь опять сначала");
        poem.add(5, "И повторится всё, как встарь:");
        poem.add(6, "Ночь, ледяная рябь канала,");
        poem.add(7, "Аптека, улица, фонарь");

        poem.sort(((o1, o2) -> o1.length() - o2.length()));
        System.out.println("Sort poem: " + poem);

    }
}

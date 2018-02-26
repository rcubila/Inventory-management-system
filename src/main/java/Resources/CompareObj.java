package Resources;
import java.util.Comparator;

public class CompareObj implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getItemName().compareToIgnoreCase(o2.getItemName());
    }
}
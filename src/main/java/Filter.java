import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public static List<Integer> filterOut(List<Integer> source, int filter) throws InterruptedException {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            int k = source.get(i);
            if (k > filter) {
                logger.log("Число " + k + " подходит");
                result.add(k);
            } else {logger.log("Число " + k + " не подходит");}
        }
        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        return result;
    }
}

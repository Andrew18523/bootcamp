import java.util.Comparator;

public class LongDecendingSorting implements Comparator<Long> {
  @Override
  public int compare (Long l1, Long l2){
    return l2.compareTo(l1);
  }
}

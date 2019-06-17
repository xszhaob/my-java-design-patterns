package bo.zhao.action.iterator;

/**
 * @author Bo.Zhao
 * @since 19/6/16
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

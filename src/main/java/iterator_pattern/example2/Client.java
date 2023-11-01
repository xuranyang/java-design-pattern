package iterator_pattern.example2;

public class Client {
    public static void main(String[] args) {
        IAggregate<String> iter = new ConcreteAggregate<>();
        iter.add("a");
        iter.add("b");
        iter.add("c");
        iter.remove("b");

        Iterator<String> iterator = iter.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

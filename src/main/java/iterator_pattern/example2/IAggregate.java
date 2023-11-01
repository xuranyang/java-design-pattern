package iterator_pattern.example2;

public interface IAggregate<E> {
    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
package iterator_pattern.example2;

public interface Iterator<E> {
    E next();
    boolean hasNext();
}
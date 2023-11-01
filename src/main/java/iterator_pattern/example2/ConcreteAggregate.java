package iterator_pattern.example2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements IAggregate<E> {
    private List<E> list = new ArrayList<E>();

    @Override
    public boolean add(E element) {
        return this.list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return this.list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}

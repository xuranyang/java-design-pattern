package mediator_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void operation(Colleague colleague) {
        for (Colleague coll : colleagues) {
            if (!coll.equals(colleague)) {
                coll.receive();
            }
        }
    }
}

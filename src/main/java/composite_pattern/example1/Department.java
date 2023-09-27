package composite_pattern.example1;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Department extends OrganizationComponent{
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public void show() {
        System.out.println("===========" + this.getName() + ":" + this.getDescription() + "===========");
        for (OrganizationComponent component : components) {
            component.show();
        }
    }

    @Override
    public void add(OrganizationComponent component) {
        this.components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        this.components.remove(component);
    }
}

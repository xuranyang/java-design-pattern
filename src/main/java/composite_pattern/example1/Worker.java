package composite_pattern.example1;

// Leaf
public class Worker extends OrganizationComponent {
    public Worker(String name, String description) {
        super(name, description);
    }

    @Override
    public void show() {
        System.out.println(this.getName() + "->" + this.getDescription());
    }
}

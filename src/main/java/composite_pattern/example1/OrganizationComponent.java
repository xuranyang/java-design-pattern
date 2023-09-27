package composite_pattern.example1;

public abstract class OrganizationComponent {
    // 名称
    private String name;
    // 描述
    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void show();

    public void add(OrganizationComponent component){}

    public void remove(OrganizationComponent component){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

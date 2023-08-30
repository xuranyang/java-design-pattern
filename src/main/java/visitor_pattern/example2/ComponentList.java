package visitor_pattern.example2;

import java.util.ArrayList;

//ComponentList类：组件列表类，充当对象结构，允许 Visitor 访问指定的元素
public class ComponentList {
    private ArrayList<Component> list = new ArrayList<Component>();

    public void addComponent(Component component) {
        list.add(component);
    }

    public void accept(CalculateContent content) {
        for (Component component : list) {
            component.accept(content);
        }
    }
}

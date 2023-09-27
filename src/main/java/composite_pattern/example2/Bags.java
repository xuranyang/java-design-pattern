package composite_pattern.example2;

import java.util.ArrayList;
import java.util.List;

// 树枝构件：袋子
public class Bags implements Articles {
    private String name;     //名字
    private List<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Articles obj : bags) {
            s += obj.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Articles obj : bags) {
            obj.show();
        }
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Articles> getBags() {
        return bags;
    }

    public void setBags(List<Articles> bags) {
        this.bags = bags;
    }
}

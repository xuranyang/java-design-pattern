package visitor_pattern.example2;

public class Client {
    public static void main(String[] args) {
        ComponentList componentList = new ComponentList();
        componentList.addComponent(new Car("汽车", 500, 100));
        componentList.addComponent(new Carframe("车架", 50, 10));
        componentList.addComponent(new Tyre("轮胎", 30, 10));
        componentList.addComponent(new Seat("座位", 20, 10));
        //总重
        Totalweight totalweight = new Totalweight();
        componentList.accept(totalweight);
        //金属重量
        System.out.println("========================");
        Metalweight metalweight = new Metalweight();
        componentList.accept(metalweight);
        //体积
        System.out.println("========================");
        Materialvolume materialvolume = new Materialvolume();
        componentList.accept(materialvolume);
    }
}


package visitor_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        // 添加员工，进行统一管理
        objectStructure.add(new Engineer());
        objectStructure.add(new Saler());

        // CEO对所有员工进行考核
        System.out.println("======CEO开始进行考核=======");
        Visitor ceoVisitor = new CeoVisitor();
        objectStructure.leaderCheckStaff(ceoVisitor);

        // CTO对所有员工进行考核
        System.out.println("======CTO开始进行考核=======");
        Visitor ctoVisitor = new CtoVisitor();
        objectStructure.leaderCheckStaff(ctoVisitor);
    }

}

// 抽象元素类-员工
abstract class Staff {

    // 员工接受领导的考核
    public abstract void accept(Visitor visitor);
}


// 这里用到了双分派。不管类怎么变化，我们都能找到期望的方法运行。意味着得到执行的操作取决于请求的种类和接收者的类型
// 第一次分派：VisitorTest客户端中，将visitor作为参数传递给engineer的accept方法
// 第二次分派：engineer类对象将自身作为参数传递给visitor的checkEngineer方法

// 具体元素类-工程师
class Engineer extends Staff {

    @Override
    public void accept(Visitor visitor) {
        // 领导对工程师的考核，不同的领导考核点不一样
        visitor.checkEngineer(this);
    }

}


// 具体元素类-销售员
class Saler extends Staff {

    @Override
    public void accept(Visitor visitor) {
        // 领导对销售员的考核，不同的领导考核点不一样
        visitor.checkSaler(this);
    }

}


// 抽象访问类
abstract class Visitor {

    // 领导对工程师的考核
    public abstract void checkEngineer(Engineer engineer);

    // 领导对销售员的考核
    public abstract void checkSaler(Saler saler);
}

// 具体访问类-CEO
class CeoVisitor extends Visitor {

    @Override
    public void checkEngineer(Engineer engineer) {
        System.out.println("CEO关注的是工程师给公司研发的新产品");
    }

    @Override
    public void checkSaler(Saler saler) {
        System.out.println("CEO关注的是销售员给公司带来的业绩");
    }

}


// 具体访问类-CTO
class CtoVisitor extends Visitor {

    @Override
    public void checkEngineer(Engineer engineer) {
        System.out.println("CTO关注的是工程师的技术深度和广度");
    }

    @Override
    public void checkSaler(Saler saler) {
        System.out.println("CTO关注的是销售员的销售技巧");
    }


}


// 数据结构：用集合对员工进行统一管理
class ObjectStructure {

    private List<Staff> staffs = new ArrayList<Staff>();

    public void add(Staff staff) {
        this.staffs.add(staff);
    }

    public void remove(Staff staff) {
        this.staffs.remove(staff);
    }

    // 接收一个领导，对所有员工进行考核
    public void leaderCheckStaff(Visitor visitor) {
        for (Staff staff : this.staffs) {
            staff.accept(visitor);
        }
    }
}

package composite_pattern.example1;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent company = new Company("Alibaba", "福报厂");

        OrganizationComponent department = new Department("研发部", "996");

        company.add(department);

        department.add(new Worker("张三","CTO"));
        department.add(new Worker("李四","实习生"));

        company.show();
    }
}

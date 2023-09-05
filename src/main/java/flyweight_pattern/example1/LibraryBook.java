package flyweight_pattern.example1;

public class LibraryBook extends Library {
    private String name; // 书名 - 内部状态
    public LibraryBook(String name) {
        this.name = name;
    }

    @Override
    public void borrow(User user) {
        System.out.println("图书馆的书《" + name + "》已被[" + user.getName() + "]借出");
    }
}

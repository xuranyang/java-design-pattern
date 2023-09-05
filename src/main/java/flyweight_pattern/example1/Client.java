package flyweight_pattern.example1;

public class Client {
    public static void main(String[] args) {
        // 创建图书馆工厂类
        LibraryFactory libraryFactory = new LibraryFactory();

        // 存放书籍
        Library book = libraryFactory.getLibraryBook("Java设计模式");
        Library book1 = libraryFactory.getLibraryBook("Java设计模式");
        Library book2 = libraryFactory.getLibraryBook("Python从入门到精通");
        Library book3 = libraryFactory.getLibraryBook("Go语言编程");
        Library book4 = libraryFactory.getLibraryBook("C++程序设计");

        System.out.println("图书馆有不同的书：" + libraryFactory.bookCount() + " 本");

        book.borrow(new User("小猪"));

        book2.borrow(new User("小熊"));

        book3.borrow(new User("小猪"));

    }
}

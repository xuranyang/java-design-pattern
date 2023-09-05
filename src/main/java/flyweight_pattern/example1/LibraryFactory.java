package flyweight_pattern.example1;

import java.util.HashMap;

public class LibraryFactory {
    // 书架，用来暂存书籍
    private HashMap<String, LibraryBook> pool = new HashMap<String, LibraryBook>();

    // 存放书的方法
    public Library getLibraryBook(String name) {
        // 判断图书馆中是否存在该书籍
        if (!pool.containsKey(name)) {
            // 不存在则添加书籍对象进去
            pool.put(name, new LibraryBook(name));
        }
        // 返回书籍对象
        return pool.get(name);
    }
    // 获取书籍个数
    public int bookCount() {
        return pool.size();
    }
}

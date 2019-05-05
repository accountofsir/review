package com.demo.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {

    public static void main(String[] args) {
        Book book1 = new Book("水腐传");
        Book book2 = new Book("西游记");
        Book book3 = new Book("红楼梦");
        List<Book> list = Stream.of(book1, book2, book3).collect(Collectors.toList());
        BookAggregate bookAggregate = new BookAggregate("四大名著", list);
        Iterator<Book> iterator = bookAggregate.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
            if (i++ == 1) {
                iterator.remove();
            }
        }

    }
}

package com.demo.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookAggregate implements Iterable<Book> {
    private String name;
    private List<Book> books;

    @Override
    public Iterator<Book> iterator() {
        return new Itr();
    }

    class Itr implements Iterator<Book> {
        private int p = 0;

        private int lastReturn = -1;

        @Override
        public boolean hasNext() {
            return p < BookAggregate.this.books.size();
        }

        @Override
        public Book next() {
            int cur = p;
            if (cur >= BookAggregate.this.books.size()) {
                throw new IndexOutOfBoundsException("out of the bounds exception...");
            }
            lastReturn = p++;
            return BookAggregate.this.books.get(lastReturn);
        }

        @Override
        public void remove() {
            if (lastReturn < 0) {
                throw new IllegalStateException("请先get元素后再删除!");
            }
            BookAggregate.this.books.remove(lastReturn);
        }
    }
}

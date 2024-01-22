import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Інтерфейс для Iterator
interface MyIterator<T> {
    boolean hasNext();
    T next();
}

// Інтерфейс для Aggregate
interface MyAggregate<T> {
    MyIterator<T> iterator();
}

// Реалізація конкретного Iterator
class MyListIterator<T> implements MyIterator<T> {
    private List<T> list;
    private int index;

    public MyListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }
}

// Реалізація конкретного Aggregate
class MyList<T> implements MyAggregate<T> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator<>(list);
    }
}


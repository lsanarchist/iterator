public class IteratorPatternExample {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");

        // Використання Iterator для перебору елементів
        MyIterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

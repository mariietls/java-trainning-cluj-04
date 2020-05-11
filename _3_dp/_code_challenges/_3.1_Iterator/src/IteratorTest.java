public class IteratorTest {
    public static void main(String[] args) {
        ArrayCustomIterator arrayCustomIterator= new ArrayCustomIterator();
        arrayCustomIterator.add(1);
        arrayCustomIterator.add(7);
        arrayCustomIterator.add(8);

        ArrayCustomIteratorImpl iterator= arrayCustomIterator.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayCustomIteratorImpl iterator1= arrayCustomIterator.iterator();
        arrayCustomIterator.remove(1);
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}

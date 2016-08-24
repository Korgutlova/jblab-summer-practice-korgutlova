package Iterator;

public class Main {
    public static void main(String[] args) {

        RangeCollection a = new RangeCollection(10);
        RangeCollection b = new RangeCollection(4, 7);
        for (int i = 1; i <= 10; i++) {
            a.add(i);
            b.add(i);                        //fill collection
        }
        System.out.println(a);
        System.out.println(b);
        Iterator iterator = a.iterator();
        Iterator iteratorB = b.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            System.out.print(iterator.next() + " ");
            System.out.println(a);                  //infinite cycle..
            System.out.print(iteratorB.next() + " ");
            System.out.println(b);
        }
    }
}

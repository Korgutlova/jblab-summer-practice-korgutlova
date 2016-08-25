package Iterator;

public class Main {
    public static void main(String[] args) {

        RangeCollection a = new RangeCollection(10);
        RangeCollection b = new RangeCollection(12, 20);
        System.out.println(a);
        System.out.println(b);
        Iterator iteratorA = a.iterator();
        Iterator iteratorB = b.iterator();
        while (iteratorB.hasNext()) {
            System.out.print(iteratorB.next() + " ");
        }
        System.out.println(" ");
        while (iteratorA.hasNext()) {
            System.out.print(iteratorA.next() + " ");
            iteratorA.remove();
        }
    }
}

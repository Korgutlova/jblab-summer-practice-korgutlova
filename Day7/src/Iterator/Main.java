package Iterator;

public class Main {
    public static void main(String[] args) {

        RangeCollection a = new RangeCollection(10);
        RangeCollection b = new RangeCollection(4, 7);
        System.out.println(a);
        System.out.println(b);
        Iterator iterator = a.iterator();
        Iterator iteratorB = b.iterator();
        int i = 0;
        while (iteratorB.hasNext()) {
            System.out.print(iteratorB.next() + " ");
            if (i > 100) {
                break;
            }
            i++;
        }

        System.out.println(" ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            iterator.remove();
        }
    }
}

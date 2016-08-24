package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class RangeCollection implements MyCollection {

    private List<Integer> list = new ArrayList<Integer>();
    private int min = 0;
    private int max;

    public RangeCollection(int max) {
        this.max = max;
    }

    public RangeCollection(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean add(int a) {
        if (a <= 0) {
            return false;
        } else {
            list.add(a);
            return true;
        }
    }

    public void remove(int index) {
        list.remove(index);
    }

    public String toString() {
        return list.toString();
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        if (list.size() < max) {
            System.out.println("Elements is less than the value of max. Max value is changed to " + list.size());
            max = list.size() - 1;
        }
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        private int index = min;

        @Override
        public boolean hasNext() {
            if (list.isEmpty()) {
                throw new NoSuchElementException("Collection is empty");
            }
            return true;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                int a;
                if (index > list.size() || min == list.size()) {
                    throw new NoSuchElementException("Collection is empty the interval from " + min + " , " + max);
                } else if (index == list.size()) {
                    index = min;
                    a = list.get(index);
                } else if (index == max) {
                    a = list.get(index);
                    index = min;
                } else {
                    a = list.get(index);
                    index++;
                }
                return a;

            }
            return null;
        }

        @Override
        public void remove() {
            if (index >= list.size()) {
                index = min;
            }
            list.remove(index);
        }
    }
}

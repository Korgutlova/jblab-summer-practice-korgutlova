package Iterator;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class RangeCollection implements MyCollection {

    private Set<Integer> removed = new LinkedHashSet<Integer>();
    private int min = 0;
    private int max;
    private int length;

    public RangeCollection(int max) {
        this.max = max;
        this.length = max - min + 1;
    }

    public RangeCollection(int min, int max) {
        this.min = min;
        this.max = max;
        this.length = max - min + 1;
    }

    public void remove(int index) {
        removed.add(index);
    }

    public String toString() {
        String s = "";
        int i = 0;
        while (i < length) {
            i = skip(i);
            if (i < length) {
                s = s + (min + i) + " ";
            }
            i++;
        }
        return s;
    }

    public int skipInfinity(int index) {
        if (index >= length) {
            index = 0;
        }
        while (removed.contains(index)) {
            index++;
            if (index >= length) {
                index = 0;
            }
        }
        return index;
    }

    public int skip(int index) {
        while (removed.contains(index)) {
            index++;
        }
        return index;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator<Integer>();
    }

    private class MyIterator<T> implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (removed.size() == length) {
                throw new NoSuchElementException("Collection is empty");
            }
            return true;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                index = skipInfinity(index);
                int a = min + index;
                index++;
                return a;
            }
            return null;
        }

        @Override
        public void remove() {
            index = skipInfinity(index);
            removed.add(index);
        }
    }
}

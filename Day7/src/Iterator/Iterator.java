package Iterator;

public interface Iterator<T> {
    boolean hasNext();

    Object next();

    void remove();
}

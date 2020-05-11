import javax.lang.model.element.Element;

interface MyCollection {
    void add(int element);
    void remove(int element);
    MyIterator iterator();
}

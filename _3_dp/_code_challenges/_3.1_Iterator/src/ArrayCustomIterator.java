import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class ArrayCustomIterator implements MyCollection{
    private List<Integer> integerList;
    public ArrayCustomIterator(){
        integerList=new ArrayList<>();
    }

    @Override
    public void add(int element){ this.integerList.add(element);}

    @Override
    public void remove(int element){this.integerList.remove(element);}

    @Override
    public ArrayCustomIteratorImpl iterator() {
        return new ArrayCustomIteratorImpl(this.integerList);
    }
}

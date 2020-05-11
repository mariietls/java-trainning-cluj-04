import javax.lang.model.element.Element;
import java.util.List;

public class ArrayCustomIteratorImpl implements MyIterator {
    private List<Integer> integerList;
    private int position;

    public ArrayCustomIteratorImpl(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override public boolean hasNext(){
        return(position<integerList.size());
    }
    @Override public int next(){
        return this.integerList.get(this.position++);
    }
}

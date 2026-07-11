import java.util.Iterator;

public class FlatteningIterator implements Iterator<String>{
    private final Iterator<Iterator<String>> iteratorOfIterators;
    private Iterator<String> currentIterator = null;

    public FlatteningIterator(Iterator<Iterator<String>> iteratorOfIterators){
        this.iteratorOfIterators = iteratorOfIterators;
    }

    @Override
    public boolean hasNext() {
        if(currentIterator != null && currentIterator.hasNext()){
            return true;
        }

        while(iteratorOfIterators.hasNext()){
            Iterator<String> iter = iteratorOfIterators.next();

            if(iter.hasNext()){
                this.currentIterator = iter;
                return true;
            }
        }

        return false;
    }

    @Override
    public String next() {
        return currentIterator!=null ? currentIterator.next() : null;
    }
}

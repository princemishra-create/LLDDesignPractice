import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecurityFilteringIterator implements Iterator<Document> {
    private final List<Document> documents;
    private int index = 0;
    private final Person person;

    public SecurityFilteringIterator(List<Document> documents, Person person){
        this.documents = documents;
        this.person = person;
    }

    @Override
    public boolean hasNext() {
        while(this.index < this.documents.size()){
            if(this.person.canAccessDocument(this.documents.get(index))){
                return true;
            }

            index++;
        }
        return false;
    }

    @Override
    public Document next() {
        if(this.hasNext()){
            return this.documents.get(this.index++);
        }

        return null;
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DocumentCollection {
    List<Document> documents;

    public DocumentCollection(){
        this.documents = new ArrayList<>();
    }

    void addDocument(Document document){
        this.documents.add(document);
    }

    public Iterator<Document> getIterator(Person person){
        return new SecurityFilteringIterator(this.documents, person);
    }
}

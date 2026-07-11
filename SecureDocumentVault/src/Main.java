//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DocumentCollection collection = new DocumentCollection();
    collection.addDocument(new Document("doc1", SecurityLevel.CONFIDENTIAL));
    collection.addDocument(new Document("doc2", SecurityLevel.PUBLIC));
    collection.addDocument(new Document("doc3", SecurityLevel.SECRET));
    collection.addDocument(new Document("doc4", SecurityLevel.PUBLIC));

    Person person = new Person("name", SecurityLevel.SECRET);

    java.util.Iterator<Document> iterator = collection.getIterator(person);

    while(iterator.hasNext()){
        System.out.println(iterator.next().getDocumentName());
    }
}

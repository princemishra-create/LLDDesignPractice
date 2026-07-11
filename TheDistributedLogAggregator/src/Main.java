//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// 1. Create lists of strings (these represent your chunks of logs)
    List<String> chunk1 = Arrays.asList("Log A1", "Log A2");
    List<String> chunk2 = Arrays.asList(); // An empty chunk to test edge cases!
    List<String> chunk3 = Arrays.asList("Log C1", "Log C2", "Log C3");

// 2. Get the iterators for each list
    Iterator<String> iter1 = chunk1.iterator();
    Iterator<String> iter2 = chunk2.iterator();
    Iterator<String> iter3 = chunk3.iterator();

// 3. Put those iterators into a parent list
    List<Iterator<String>> allIterators = Arrays.asList(iter1, iter2, iter3);

    Iterator<String> flatteningIterator = new FlatteningIterator(allIterators.iterator());

    while(flatteningIterator.hasNext()){
        String value = flatteningIterator.next();

        if(value != null){
            System.out.println(value);
        }
    }
}

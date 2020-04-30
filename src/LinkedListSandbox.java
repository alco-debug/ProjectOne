public class LinkedListSandbox {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5};
        LinearLinkedListOfInt linked_list = new LinearLinkedListOfInt(arr);
        ListCell curcell = linked_list.getFirstCell();
        while(curcell != null){
            System.out.println(curcell.getData());
            curcell = curcell.getNext();
        }
    }
}

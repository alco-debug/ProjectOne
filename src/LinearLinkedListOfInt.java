public class LinearLinkedListOfInt {
    private ListCell[] arr;

    public LinearLinkedListOfInt(int[] datalist){
        arr = new ListCell[datalist.length];

        for(int i = 0; i < arr.length; i++)
            arr[i] = new ListCell(new ListDataIntCell(datalist[i]));

        for(int i = 0; i < arr.length; i++){
            arr[i].setPrev(null);
            if(i < arr.length - 1) {
                arr[i].setNext(arr[i + 1]);
            } else {
                arr[i].setNext(null);
            }
        }

    }

    public ListCell getFirstCell(){
        return arr[0];
    }
}

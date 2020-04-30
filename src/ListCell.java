public class ListCell {
    private ListDataCell data;
    private ListCell prev;
    private ListCell next;

    public ListCell(ListDataCell data){
        this.data = data;
    }

    public ListCell(ListDataCell data, ListCell prev, ListCell next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Object getData(){
        return data.get();
    }

    public void setData(Object obj){
        data.set(obj);
    }

    public ListCell getPrev(){
        return prev;
    }

    public void setPrev(ListCell prev){
        this.prev = prev;
    }

    public ListCell getNext(){
        return next;
    }

    public void setNext(ListCell next){
        this.next = next;
    }
}

public class ListDataIntCell implements ListDataCell {
    private int data;

    public ListDataIntCell(int value)
    {
        this.data = value;
    }

    @Override
    public Object get() {
        return data;
    }

    @Override
    public void set(Object obj) {
        data = (int) obj;
    }
}

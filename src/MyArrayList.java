public class MyArrayList {

    private int[] array;
    private int last_index;

    public MyArrayList(int[] array) {
        this.array = array;
        this.last_index = array.length;
    }

    public MyArrayList(int size) {
        this.array = new int[size];
        this.last_index = 0;
    }

    public boolean contains(int a) {
        for (int i = 0; i < last_index; i++)
            if (array[i] == a)
                return true;
        return false;
    }

    public void add(int a) {
        if (last_index == array.length) {
            int[] temp_array = array.clone();
            array = new int[last_index + 8];
            for (int i = 0; i < last_index; i++)
                this.array[i] = temp_array[i];
        }
        array[last_index++] = a;
    }

    public void remove(int index) {
        for (int i = ++index; i < last_index; i++)
            array[i - 1] = array[i];
        last_index--;
    }

    public void sort() {
        int minpos, _temp;
        for (int i = 0; i < array.length; i++) {
            minpos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minpos]) {
                    minpos = j;
                }
            }
            _temp = array[minpos];
            array[minpos] = array[i];
            array[i] = _temp;
        }
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < last_index; i++) {
            result += String.valueOf(array[i]);
            if (i < last_index - 1)
                result += ", ";
        }
        result += "]";
        return result;
    }

    @Override
    public boolean equals(Object obj){
        MyArrayList list = (MyArrayList) obj;
        if(list.last_index != this.last_index)
            return false;
        else
            for(int i = 0; i < last_index; i++)
                if(list.array[i] != this.array[i])
                    return false;
        return true;
    }

}

public class MyArrayListSandBox {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 7, 9, -1};
        MyArrayList myArr = new MyArrayList(arr);
        System.out.println(myArr);
        System.out.println(myArr.contains(-1));
        myArr.sort();
        System.out.println(myArr);
        myArr.add(1024);
        System.out.println(myArr);
        myArr.remove(4);
        System.out.println(myArr);

        System.out.println();

        MyArrayList myArr2 = new MyArrayList(4);
        System.out.println(myArr2);

        MyArrayList myArr3 = new MyArrayList(arr);
        for(int i = 0; i < arr.length; i++)
            myArr2.add(arr[i]);
        System.out.println(myArr2);
        System.out.println(myArr3);
        System.out.println(myArr2.equals(myArr3));

    }
}

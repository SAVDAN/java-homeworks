package ru.savdan.homework3.list;



public class List {

    private int[] array;
    private int index;

    public List() {
        array = new int[10];
        index = 0;
    }

    public void add(int v) {
        if (index >= array.length) {
            makeArrayBigger();
        }
        array[index] = v;
        index++;
    }

    public void print() {
        System.out.print("Наш массив: {");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");

    }

    private void makeArrayBigger() {
        int[] array2 = new int[array.length * 2];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = array2;
    }
}

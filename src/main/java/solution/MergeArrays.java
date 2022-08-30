package solution;

//        a – массив;
//        lo – позиция первого элемента в массиве (для первой итерации = 0);
//        hi – позиция последнего элемента в массиве (для первой итерации = a.length — 1).

public class MergeArrays {


    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};

        int[] aMerge = mergeArrays(a1, a2);
        printArray(aMerge);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] aMerge = new int[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < aMerge.length; k++) {

            if (i > a1.length - 1) {
                int a = a2[j];
                aMerge[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                aMerge[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                aMerge[k] = a;
                i++;
            } else {
                int b = a2[j];
                aMerge[k] = b;
                j++;
            }


        }
        return aMerge;
    }
    private static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"\t");
        System.out.println();
    }

}

public class runner {

    public static void main(String[] args)
    {
       int[] integer = util.randIntArr(10000);

        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.insertionSort(integer);
        time=System.nanoTime()-time;

        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Insertion Sort");
        System.out.println("Time Taken: "+time);

        String[] str = util.randStringArr(10000, 5);

        for(String num: str)
            System.out.print(num+" ");
        System.out.println();

        time = System.nanoTime();
        util.selectionSort(str);
        time=System.nanoTime()-time;

        for(String num:str)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Selection Sort");
        System.out.println("Time Taken: "+time);



    }

}

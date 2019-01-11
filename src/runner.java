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




    /*
        double[] dou = util.randDouArr(10000);


        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.selectionSort(dou);
        time=System.nanoTime()-time;

        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Selection Sort");
        System.out.println("Time Taken: "+time);


        */

        /*
        String[] str = util.randStringArr(1000,1);


        for(String num:str)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.bubbleSort(str);
        time=System.nanoTime()-time;

        for(String num:str)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Bubble Sort");
        System.out.println("Time Taken: "+time);
        */
    }

}

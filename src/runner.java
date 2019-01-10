public class runner {

    public static void main(String[] args)
    {
        String[] str = util.randStringArr(10,1);


        for(String num:str)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        util.bubbleSort(str);
        time=System.nanoTime()-time;

        for(String num:str)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);


        int[] integer = util.randIntArr(10);


        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        time = System.nanoTime();
        util.insertionSort(integer);
        time=System.nanoTime()-time;

        for(int num:integer)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);



        double[] dou = util.randDouArr(10);


        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        time = System.nanoTime();
        util.selectionSort(dou);
        time=System.nanoTime()-time;

        for(double num:dou)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Time Taken: "+time);
    }
}

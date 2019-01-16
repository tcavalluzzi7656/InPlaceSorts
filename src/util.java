public class util {


    public static void intswap(int[] arr,int i, int j)
    {
        int temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr= new int[count];
        for(int x=0;x<count;x++)
        {
            arr[x]=(int)(Math.random()*10);
        }
        return arr;
    }

    public static int[]insertionSort(int[] arr)
    {
        for(int x=1;x<arr.length;x++)
        {
            int pos=x;
            while((pos>0)&&(arr[pos]<arr[pos-1]))
            {
                intswap(arr,pos,pos-1);
                pos--;
            }
        }
        return arr;
    }

   public static void strswap(String[] arr,int i, int j)
    {
        String temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void bubbleSort(String[] arr)
    {
        int pos;
        int swapcount;
        boolean done = false;
        while(!done)
        {
            swapcount=0;
            pos=0;
            int lastswap=arr.length-1;
            for(int x=0;x<lastswap;x++)
            {
                if((arr[pos]).compareTo(arr[pos+1])>0)
                {
                    strswap(arr,pos,pos+1);
                    swapcount++;
                    lastswap=pos+1;
                }
                pos++;
            }
            if (swapcount==0)
            {
                done=true;
            }
        }
    }

    public static String[] randStringArr(int num,int length)
    {
        String[] arr= new String[num];
        while (num>0)
        {
            int i =0;
            String s ="";
            while (i< length)
            {
                char c =(char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arr[num]=s;

        }
        return arr;
    }


    public static void doubleswap(double[] arr,int i, int j)
    {
        double temp;
        temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static double[] randDouArr(int count)
    {
        double[] arr= new double[count];
        for(int x=0;x<count;x++)
        {
            arr[x]=(Math.random()*10);
        }
        return arr;
    }

    public static void selectionSort(double [] arr){
        int minPos = 0;
        for (int curPos = 0; curPos < arr.length-1; curPos++){
            double minVal = arr[curPos];
            minPos = curPos;
            for (int i = curPos+1; i<arr.length; i++){
                if (arr[i] < minVal){
                    minVal = arr[i];
                    minPos = i;
                }
            }
            doubleswap(arr,curPos,minPos);
        }
    }







/*
    public static boolean checkSum(int[] before,int[] after)
    {
        int sumBefore=0;
        int sumAfter=0;
        if(before.length!=after.length)
        {
            return false;
        }
        for(int x=0; x<before.length;x++)
        {
            sumBefore= sumBefore+before[x];
            sumAfter= sumAfter+after[x];
        }
        if (sumAfter==sumBefore)
        {
            return true;
        }
        return false;
    }

    public static boolean checkOrder(int[] arr)
    {
        boolean correct = true;
        for (int pos = 0; pos<arr.length-1;pos++)
        {
            if(!(arr[pos]<=arr[pos+1]))
            {
                correct=false;
            }
        }
        return correct;
    }
*/




}
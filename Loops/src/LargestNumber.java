class LargestNumber
{
    static int[] arr = {23, 68, 55, 1001, 2, 7, 45, 3456};

    static int largestNumber()
    {
        int LN;
        int max = arr[0];
        for (LN = 1; LN < arr.length; LN++)
            if (arr[LN] > max)
                max = arr[LN];
        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Largest Number is " + largestNumber());
    }
}
class GetReverse
{
    public static void main(String[] a)
    {
        int number=321;
        int reverse=0;
        while(number>0)
        {
            reverse=(reverse*10)+(number%10);
            number=number/10;
        }
        System.out.println(reverse);
    }
}
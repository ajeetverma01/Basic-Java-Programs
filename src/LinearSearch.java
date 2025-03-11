class LinearSearch
{
    public static void main(String[] args)
    {
        int[] variableList ={11,22,33,44,55,66,77,88,99};
        int searchingNumber=66; //You can take input from user by the help of input methods
        int a=0;
        int i=0;
        for(i=0;i<variableList.length;i++)
        {
            if(searchingNumber==variableList[i])
            {
                a=1;
                break;
            }
        }
        if(a==1)
            System.out.println("Element found at index no. "+i);
        else
            System.out.println("Element not found. Please Try again...");
    }
}
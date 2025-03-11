class SelectionSort
{
    public static void main(String[] args)
    {
        int i,j,flag;
        int rawData[]={0,1,2,3,4,5,6,7,8,9};
        for(i=0;i<rawData.length;i++)
        {
            for(j=0;j<rawData.length;j++)
            {
                if(rawData[i]<rawData[j])
                {
                    flag=rawData[i];
                    rawData[i]=rawData[j];
                    rawData[j]=flag;
                }
            }
        }
        System.out.println("Sorted...");
        for(i=0;i<rawData.length;i++)
            System.out.print(rawData[i]+" ");
    }
}

class CommandLineArgument
{
    public static void main(String[] args)       /* In this program give an argument while executing it after compiling.*/
    {                                                                  // Example: In command prompt- javac CommandLineArgument.java and press Enter.
        for(int i=0;i<args.length;i++)                   // After enter:  java CommandLineArgument Ajeet Sujeet Rahul Amit
            System.out.println("Hello! "+args[i]);  // Here Ajeet, Sujeet, Rahul & Amit are arguments, and they are separated by space.
    }                                                                // And args[0]=Ajeet, args[1]=Sujeet, args[2]=Rahul.....
}
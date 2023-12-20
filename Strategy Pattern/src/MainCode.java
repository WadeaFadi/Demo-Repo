import java.util.Scanner;
public class MainCode {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("***This Array 1***");
        int [] arr1 = new int[9];
        int FilterTarget1,SearchTarget1;
        ArrayProcessor Array_1 = new Array1();
        for (int i = 0;i < 9;i++)
        {
            int a;
            a = in.nextInt();
            arr1[i] = a;
        }
        System.out.println("Enter A FilterTarget1");
        FilterTarget1 = in.nextInt();
        System.out.println("Enter A SearchTarget1");
        SearchTarget1 = in.nextInt();
        arr1 = Array_1.Filter(arr1,FilterTarget1);
        Array_1.print(arr1);
        Array_1.print(Array_1.Sort(arr1));
        System.out.println(Array_1.Search(arr1,SearchTarget1));

        System.out.println("***This Array 2***");

        int [] arr2 = new int[9];
        int FilterTarget2,SearchTarget2;
        ArrayProcessor Array_2 = new Array2();
        for (int i = 0;i < 9;i++)
        {
            int a;
            a = in.nextInt();
            arr2[i] = a;
        }
        System.out.println("Enter A FilterTarget2");
        FilterTarget2 = in.nextInt();
        System.out.println("Enter A SearchTarget2");
        SearchTarget2 = in.nextInt();
        arr2 = Array_2.Filter(arr2,FilterTarget2);
        Array_2.print(arr2);
        Array_2.print(Array_2.Sort(arr2));
        System.out.println(Array_2.Search(arr2,SearchTarget2));

        System.out.println("***This Array 3***");

        int [] arr3 = new int[9];
        int FilterTarget3,SearchTarget3;
        ArrayProcessor Array_3 = new Array3();
        for (int i = 0;i < 9;i++)
        {
            int a;
            a = in.nextInt();
            arr3[i] = a;
        }
        System.out.println("Enter A FilterTarget3");
        FilterTarget3 = in.nextInt();
        System.out.println("Enter A SearchTarget3");
        SearchTarget3 = in.nextInt();
        arr3 = Array_3.Filter(arr3,FilterTarget3);
        Array_3.print(arr3);
        Array_3.print(Array_3.Sort(arr3));
        System.out.println(Array_3.Search(arr3,SearchTarget3));
    }
}

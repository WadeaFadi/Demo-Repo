public class ArrayProcessor {
    FilterMethod filterMethod;
    SortMethod sortMethod;
    SearchMethod searchMethod;
    public int[] Filter(int[] array,int target){return filterMethod.Filter(array,target);}
    public int[] Sort(int[] array){return sortMethod.Sort(array);}
    public int Search(int[] array,int target){return searchMethod.Search(array,target);}
    public void print(int []array)
    {
        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

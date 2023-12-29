public class Array2 extends ArrayProcessor{
    public Array2() {
        filterMethod = new GreaterThanFilter();
        sortMethod = new BubbleSort();
        searchMethod = new BinarySearch();
    }
    @Override
    public int[] Filter(int[] array,int target){return filterMethod.Filter(array,target);}
    @Override
    public int[] Sort(int[] array){return sortMethod.Sort(array);}
    @Override
    public int Search(int[] array,int target){return searchMethod.Search(array,target);}
}

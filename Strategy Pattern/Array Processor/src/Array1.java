public class Array1 extends ArrayProcessor{
    public Array1() {
        filterMethod = new GreaterThanFilter();
        sortMethod = new MergeSort();
        searchMethod = new LinearSearch();
    }
    @Override
    public int[] Filter(int[] array,int target){return filterMethod.Filter(array,target);}
    @Override
    public int[] Sort(int[] array){return sortMethod.Sort(array);}
    @Override
    public int Search(int[] array,int target){return searchMethod.Search(array,target);}
}

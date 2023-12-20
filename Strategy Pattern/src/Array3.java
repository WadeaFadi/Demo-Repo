public class Array3 extends ArrayProcessor{
    public Array3() {
        filterMethod = new LessThanFilter();
        sortMethod = new InsertionSort();
        searchMethod = new LinearSearch();
    }
    @Override
    public int[] Filter(int[] array,int target){return filterMethod.Filter(array,target);}
    @Override
    public int[] Sort(int[] array){return sortMethod.Sort(array);}
    @Override
    public int Search(int[] array,int target){return searchMethod.Search(array,target);}
}

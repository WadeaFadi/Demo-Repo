public class BinarySearch implements SearchMethod{
    @Override
    public int Search(int[] array,int target)
    {
        int l = 0,r = array.length - 1,mid;
        while (l <= r)
        {
            mid = (l+r)/2;
            if (array[mid] == target){return array[mid];}
            else if (array[mid] > target){r = mid - 1;}
            else if (array[mid] < target){l = mid + 1;}
        }
        return -1;
    }
}

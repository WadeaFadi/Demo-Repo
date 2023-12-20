public class LinearSearch implements SearchMethod{
    @Override
    public int Search(int[] array,int target)
    {
        for (int j : array)
        {
            if (j == target)
            {
                return j;
            }
        }
        return -1;
    }
}

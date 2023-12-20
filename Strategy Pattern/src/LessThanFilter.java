import java.util.ArrayList;
public class LessThanFilter implements FilterMethod{
    @Override
    public int[] Filter(int[] array,int target)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j : array) {
            if (j < target) {
                ans.add(j);
            }
        }
        int [] ans1 = new int[ans.size()];
        for (int j = 0;j < ans.size();j++)
        {
            ans1[j] = ans.get(j);
        }
        return ans1;
    }
}

import java.util.ArrayList;
public class GreaterThanFilter implements FilterMethod{
    @Override
    public int[] Filter(int[] array,int target)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j : array) {
            if (j > target) {
                ans.add(j);
            }
        }
        int[] ans1 = new int[ans.size()];
        for (int i = 0;i < ans.size();i++)
        {
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}

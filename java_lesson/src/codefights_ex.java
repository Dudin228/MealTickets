/**
 * Created by User on 21.02.2018.
 */
public class codefights_ex
{
    int firstDuplicate(int[] a)
    {
        int result = -1;
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                    return a[j];
            }
        }
        return result;
    }

}

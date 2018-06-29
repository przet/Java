//package school;
public class School
{
    public static int getAverage(int[] marks)
    {
        if (marks.length == 0)
        {
            System.out.println("input array is empty!");
            return 0;
        }
        int sum = 0;
        for (int mark : marks)
        {
            sum+=mark;
        }
        return Math.round(sum/marks.length);
    }
}

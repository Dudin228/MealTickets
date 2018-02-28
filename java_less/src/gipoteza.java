/**
 * Created by User on 28.02.2018.
 */
import java.util.Scanner;

public class gipoteza
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int expected_result = 1;

        while (num != expected_result)
        {
            if (num % 2 == 0)
            {
                num /= 2;
                System.out.println(num);
            }
            else if (num % 2 != 0)
            {
                num = ((num * 3) + 1) / 2;
                System.out.println(num);
            }
        }
        if (num == expected_result)
        {
            System.out.println("Гипотеза верна!");
        }
    }
}

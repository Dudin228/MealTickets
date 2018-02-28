/**
 * Created by User on 21.02.2018.
 */
import java.util.Scanner;
import java.util.Random;

public class array_practice
{
    public static void main(String[] args)
    {

        int prirost = 15;
        float current_prirost = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite zapas: ");
        float zapas = scanner.nextInt();
        System.out.print("Vvedite otlov: ");
        Random rnd = new Random();
        float otlov = scanner.nextInt();
        System.out.print("Vvedite min zapas: ");
        float min_zapas = scanner.nextInt();
        int years = 0;
        float zapas_2 = zapas;
        boolean flag = true;
        while (flag)
        {
            if ((zapas - otlov) + ((zapas - otlov) / 100 * prirost) > (min_zapas))
            {
                System.out.println("S takimi tempami zapasa hvatit eshe na odin god");
                years++;
            }
            else
            {
                System.out.println("Ribi bolshe ne hvatit!");
                System.out.println("Vsego ribi hvatilo na " + years + " let");
                flag = false;
            }

            zapas_2 = zapas - otlov;
            current_prirost = (((zapas_2) / 100) * prirost);
            zapas = (zapas_2 + current_prirost);
            System.out.println("Tekushii zapas sostavlyaet: " + zapas_2);
            System.out.println("Tekushii prirost sostavlyaet: " + current_prirost);
            System.out.println("Zapas na sled god sostavit: " + (zapas));
            System.out.println("Vvedite otlov na sleduyshii god: ");
            otlov = scanner.nextInt();
        }

    }
}

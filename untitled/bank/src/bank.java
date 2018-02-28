/**
 * Created by User on 28.02.2018.
 */
public class bank
{
    public static void main(String[] args)
    {
        float first_deposit = 100000;
        float second_deposit = 200000;
        int years = 0;

        while (first_deposit <= second_deposit)
        {
            first_deposit = first_deposit + ((first_deposit / 100) * 10);
            System.out.println("Текущее состояние первого вклада: " + first_deposit);
            second_deposit = second_deposit + ((second_deposit / 100) * 2);
            System.out.println("Текущее состояние второго вклада: " + second_deposit);
            years ++;
        }
        System.out.println("Первый вклад превысил второй!");
        System.out.println("Это заняло " + years + " лет.");
    }
}

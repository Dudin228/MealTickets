package ticketmeal;

public class Main {

    public static int[] raz_mas(long i) { // Принимает число типа лонг, возвращает int массив,
        // где каждый элемент - один разряд числа
        int[] razryady = new int[6];
        int sch = 0;
        while (i > 0) {
            razryady[sch] = (int) i % 10;
            i /= 10;
            sch++;
        }
        return razryady;
    }

    public static void main(String[] args) {
        int count = 0; // Счетчик счастливых билетов
        for (long i = 0; i <= 999999; i++) {
            int[] get = raz_mas(i); // Массив разрядов числа
            if ((get[0] + get[1] + get[2]) == (get[3] + get[4] + get[5])) {
                System.out.println(i);
                count++;
            }
        }
        System.out.print("total: ");
        System.out.println(count);
    }
}

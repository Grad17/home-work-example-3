public class Main {
    public static void main(String[] args) {
// task 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
//task 2
        System.out.println();

        for (int fr = 5; fr <= 26; fr += 7) {

            System.out.println("Сегодня пятница " + fr + " - число. Необходимо подготовить отчет");
        }
//task 3

        int currentYear = 2022;

        for (int year = currentYear - 200 ; year <= currentYear + 100; year ++){
            if (year %79 == 0) {
                System.out.println("year = " + year);
            }
        }
    }
}
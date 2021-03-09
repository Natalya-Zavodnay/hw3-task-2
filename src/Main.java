public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int transfer = 1_500;
        int bonus;
        int minTransfer = 1_000;

        if (transfer > minTransfer) {

            bonus = (transfer / 100) * 1;
        } else {
            bonus = 0;
        }
        int finalBalance = startingBalance + transfer + bonus;

            System.out.println(finalBalance);
        }
    }



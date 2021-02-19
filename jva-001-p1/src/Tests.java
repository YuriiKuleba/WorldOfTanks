import java.util.Arrays;

class Tests {

    private static final String[][] birds = new String[10][5];
    private static int count = 0;

    static final int BIRD = 0;
    static final int PRICE_USD = 1;
    static final int AMOUNT = 2;
    static final int SOLD = 3;
    static final int INCOME_PRICE = 4;


    public static void main(String[] args) {

        birdAdd("crow", "10", "20", "3", "1");

        birdAdd("falcon", "50", "5", "4", "25");

        birdAdd("duck", "20", "40", "10","5");


        //We are trying to add existing bird
        birdAdd("crow", "10", "50", "3", "1");


        sellBird("crow", "25");
        addAmount("falcon", "5");
        changePrice("duck", "23");

        showBirds();

        sellBird("turkey", "1");
    }


    private static void birdAdd(String bird, String priceUSD, String amount, String sold, String incomePrice) {
        int birdIndex = checkBird(bird);
        if (birdIndex != -1) {
            birds[birdIndex][2] = String.valueOf(Integer.parseInt(birds[birdIndex][2]) + Integer.parseInt(amount));
        } else {
            birds[count][BIRD] = bird;
            birds[count][PRICE_USD] = priceUSD;
            birds[count][AMOUNT] = amount;
            birds[count][SOLD] = sold;
            birds[count][INCOME_PRICE] = incomePrice;
            count++;
        }
    }

    private static void addAmount(String bird, String amount) {
        int birdIndex = checkBird(bird);
        if (birdIndex != -1) {
            birds[birdIndex][AMOUNT] = String.valueOf(Integer.parseInt(birds[birdIndex][AMOUNT]) + Integer.parseInt(amount));

        }

    }

    private static void changePrice(String bird, String priceUSD) {
        int birdIndex = checkBird(bird);
        if (birdIndex != -1) {
            birds[birdIndex][PRICE_USD] = priceUSD;
        }

    }

    private static void sellBird(String bird, String amount) {
        int birdIndex = checkBird(bird);
        if (birdIndex != -1) {
            birds[birdIndex][AMOUNT] = String.valueOf(Integer.parseInt(birds[birdIndex][AMOUNT]) - Integer.parseInt(amount));
            birds[birdIndex][SOLD] = String.valueOf(Integer.parseInt(birds[birdIndex][SOLD]) + Integer.parseInt(amount));
        } else {
            System.out.println("Bird doesn't exist");
        }
    }

    private static void showBirds() {
        System.out.printf("|%10s| |%10s| |%10s| |%10s| |%10s|", "Bird", "priceUSD", "amount", "sold", "incomePrice");
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.printf("|%10s| |%10s| |%10s| |%10s| |%10s |",
                    birds[i][0], birds[i][1], birds[i][2], birds[i][3], birds[i][4]);
            System.out.println();
        }
    }

    private static int checkBird(String name) {
        for (int i = 0; i < count; i++) {
            if (birds[i][0].equals(name)) {
                return i;
            }
        }
        return -1;
    }

}


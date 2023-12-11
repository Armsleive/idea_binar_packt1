public class Main {
    public static void main(String[] args) {

        int price = 24000; // Цена билета

        int priceСoupon = 20; //  Цена за потраченные на билет для
        // начисления 1 имли

        int mile = (price / priceСoupon); //Сумма начисленных миль
        System.out.print("Цена билета 24000 рублей.");
        System.out.print("20 рублей для одной бонусной мили.");

        System.out.print("Миль полученно с купленного билета-");

        System.out.print(price / priceСoupon);
    }

}
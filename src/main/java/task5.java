public class task5 {
    public static void main(String[] args) {
        int euro = 1000;
        if (euro <= 100)
            System.out.println("Скидка 0%");
        else if (euro <= 500)
            System.out.println("Скидка 10%");
        else if (euro > 500)
            System.out.println("Скидка 20%");
    }
}

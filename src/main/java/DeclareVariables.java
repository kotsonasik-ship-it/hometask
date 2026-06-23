public class DeclareVariables {
    public static String declareVariables() {
        String customerName = "Sasha";
        int cupsOfCoffee = 1;
        double costOfCoffee = 99.9;
        boolean tip = true;
 /*
        Необходимо объявить и инициализировать глобальные переменные, указанные в тексте response,
        чтобы получить следующий текст:
        Dear Sasha, thank you for supporting our business!
        Cups of coffee bought: 1.
        Cost of 1 cup of coffee: $99.9.
        Your total is: $99.9.
        Tip is included? true.
  */
        String response = "";

        response = "Dear " + customerName + ", thank you for supporting our business!"
                + "Cups of coffee bought: " + cupsOfCoffee + ".Cost of 1 cup of coffee: $"
                + costOfCoffee + ".Your total is: $99.9.Tip is included? " + tip + ".";

        return response;
    }

    public static void main(String[] args) {
        System.out.println(declareVariables());
    }
}

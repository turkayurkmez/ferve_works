//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Product kettle = new Product();
        kettle.Name = "Xiaomi";
        kettle.Price = 2199;
        kettle.Description = "Mi Smart Kettle Pro 1500 Ml";

        kettle.Price = -500;
    }
}
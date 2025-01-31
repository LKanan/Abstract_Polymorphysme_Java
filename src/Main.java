//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Rectangle rectangle1 = new Rectangle("Rectangle 1", 10, 5);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Rectangle rectangle2 = new Rectangle("Rectangle", 10, 5);
       Triangle triangle1 = new Triangle("Triangle 1", 10, 5);
       System.out.println(triangle1.Surface());
    }
}
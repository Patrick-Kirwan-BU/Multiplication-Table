//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int size = 12;

        System.out.print("\t");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();


        for (int i = 1; i <= size; i++) {

            System.out.print(i + "\t");

            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }

            System.out.println();
        }
    }
}
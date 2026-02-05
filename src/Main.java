//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BookingSystem bs = new BookingSystem(4);

        bs.bookTaxi(1, 'A', 'B', 9);
        bs.bookTaxi(2, 'B', 'D', 9);
        bs.bookTaxi(3, 'B', 'C', 12);


    }
}
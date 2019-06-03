package bo.zhao.action.composite;

/**
 * @author Bo.Zhao
 * @since 19/5/24
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("\nMessage from the elves: ");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}

package bo.zhao.action.composite;

/**
 * 字母
 *
 * @author Bo.Zhao
 * @since 19/5/24
 */
public class Letter extends LetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    public void print() {
        System.out.print(c);
    }
}

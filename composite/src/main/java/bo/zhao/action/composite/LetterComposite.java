package bo.zhao.action.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bo.Zhao
 * @since 19/5/24
 */
public abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    /**
     * Print
     */
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}

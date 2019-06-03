package bo.zhao.action.composite;

import java.util.List;

/**
 * 单词
 *
 * @author Bo.Zhao
 * @since 19/5/24
 */
public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            this.add(letter);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}

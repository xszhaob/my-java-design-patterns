package bo.zhao.action.composite;

import java.util.List;

/**
 * 句子
 *
 * @author Bo.Zhao
 * @since 19/5/24
 */
public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word word : words) {
            this.add(word);
        }
    }


    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}

package bo.zhao.action.command.demo2;

import java.util.Objects;

public class Document implements Receiver {

    private String title;

    private String text;

    public Document(String title) {
        this.title = title;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String copy(int from, int to) {
        Objects.requireNonNull(text);
        return text.substring(from, to);
    }
}

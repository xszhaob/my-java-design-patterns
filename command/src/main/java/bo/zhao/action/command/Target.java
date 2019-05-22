package bo.zhao.action.command;

/**
 * @author Bo.Zhao
 * @since 19/5/22
 */
public abstract class Target {

    private Size size;

    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    public void printStatus() {
        System.out.println(String.format("%s, [size=%s] [visibility=%s]", this, size, visibility));
    }
}

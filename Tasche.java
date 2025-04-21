public class Tasche<T> {
    private T inhalt;

    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }

    public T getInhalt() {
        return inhalt;
    }

    @Override
    public String toString() {
        if (inhalt == null) {
            return "ist leer!";
        }else {
            return inhalt.toString();
        }
    }
}

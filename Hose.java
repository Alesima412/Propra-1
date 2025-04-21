public class Hose<links,rechts> {
    private Tasche<links> linkeTasche=new Tasche<>();
    private Tasche<rechts> rechteTasche=new Tasche<>();

    public static void main (String[] args){
        Hose<Taschentuch, Kaugummi> hose=new Hose<>();
        hose.linkeTasche.setInhalt(new Taschentuch());
        hose.rechteTasche.setInhalt(new Kaugummi());
        System.out.println(hose.linkeTasche.getInhalt().getClass().getSimpleName());
        System.out.println(hose.rechteTasche.getInhalt().getClass().getSimpleName());
    }
}

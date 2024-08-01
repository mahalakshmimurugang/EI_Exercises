package Bridge_pattern;

public class OnlineDisplay implements SubjectDisplay {
    @Override
    public void displayMath() {
        System.out.println("Displaying Math online");
    }

    @Override
    public void displayScience() {
        System.out.println("Displaying Science online");
    }
}

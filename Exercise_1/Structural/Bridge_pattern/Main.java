package Bridge_pattern;

public class Main {
    public static void main(String[] args) {
        SubjectDisplay onlineDisplay = new OnlineDisplay();
        Subject math = new Math(onlineDisplay);
        math.display();
    }
}

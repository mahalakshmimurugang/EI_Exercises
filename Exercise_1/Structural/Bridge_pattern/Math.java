package Bridge_pattern;

public class Math implements Subject {
    private SubjectDisplay subjectDisplay;

    public Math(SubjectDisplay subjectDisplay) {
        this.subjectDisplay = subjectDisplay;
    }

    @Override
    public void display() {
        subjectDisplay.displayMath();
    }
}

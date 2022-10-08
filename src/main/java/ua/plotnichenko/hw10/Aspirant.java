package ua.plotnichenko.hw10;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark,
                    String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public double getScholarship() {
        if (getAverageMark() >= 5) {
            return 200;
        } else {
            return 180;
        }

    }
}

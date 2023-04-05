public class Student {
    private String IDnumber;
    private int psychometric;
    private int grade899381;

    public Student(String IDnumber, int psychometric, int grade899381) {
        this.IDnumber = IDnumber;
        this.psychometric = psychometric;
        this.grade899381 = grade899381;
    }

    public String getIDnumber() { return this.IDnumber; }
    public int getPsychometric() { return this.psychometric; }
    public int getGrade899381() { return this.grade899381; }

    public boolean isAccepted() {
        if (this.getPsychometric() < 650) return false;
        if (this.getGrade899381() < 85) return false;

        return true;
    }
}

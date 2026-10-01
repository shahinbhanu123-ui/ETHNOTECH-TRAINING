class Teacher {

    String subname;
    String subject;
    int patienceLevel;

    Teacher(String subname, String subject, int patienceLevel) {
        this.subname = subname;
        this.subject = subject;
        this.patienceLevel = patienceLevel;
    }

    void givingNoAssignment() {
        if (this.patienceLevel > 5) {
            System.out.println(this.subname + " is giving no assignment.");
        } else {
            System.out.println(this.subname + " is giving assignment.");
        }
    }

    void teachingSkills() {
        if (this.patienceLevel > 5) {
            System.out.println(this.subname + " has good teaching skills.");
        } else {
            System.out.println(this.subname + " needs to improve teaching skills.");
        }
    }

    public static void main(String[] args) {

        Teacher t = new Teacher("BABJAN SIR", "Java", 8);

        System.out.println("Teacher: " + t.subname);
        System.out.println("Subject: " + t.subject);
        System.out.println("Patience Level: " + t.patienceLevel);

        t.givingNoAssignment();
        t.teachingSkills();
    }
}
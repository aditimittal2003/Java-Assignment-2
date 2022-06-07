interface details {
    // declare methods that are abstract by default
    void branch();

    void CPI();

    void prof();

    void subject();

    void Hostel();
}

// A class
class Student {
    public String name;
    public String surname;
    public int roll_no;

    // method to print name of student
    public void name() {
        System.out.println("First Name: " + this.name);
    }

    // method to print surname of student
    public void surname() {
        System.out.println("Last Name: " + this.surname);
    }

    // method to print roll number of student
    public void roll_no() {
        System.out.println("Student ID: " + this.roll_no);
    }
}

// A class that implements interface and inherits Student Class
class girls extends Student implements details {
    public String branch = "MnC";
    public float cpi = 9.3f;
    public String prof = "Dr. Tiya Bansal";

    // to print branch
    @Override
    public void branch() {
        System.out.println("Branch: " + this.branch);
    }

    // to find CPI
    @Override
    public void CPI() {
        System.out.println("CPI: " + this.cpi);
    }

    // to find the name of professor
    @Override
    public void prof() {
        System.out.println("Professor: " + this.prof);
    }

    // to represent grades in various subjects
    @Override
    public void subject() {
        System.out.println("Subject wise Grades: ");
        System.out.println("MA 102: A-");
        System.out.println("CSO 102: A");
        System.out.println("MA 111: A");
        System.out.println("H 106: S");
    }

    // to show hostel details
    @Override
    public void Hostel() {
        System.out.println("Hostel alloted: SC Dey");
        System.out.println("Room Number: 89");
    }
}

// Another class that implements interface and inherits Student Class
class boys extends Student implements details {
    public String branch = "CSE";
    public float cpi = 8.8f;
    public String prof = " Dr. Mayank Swarankar";

    // to print branch
    @Override
    public void branch() {
        System.out.println("Branch: " + this.branch);
    }

    // to print CPI
    @Override
    public void CPI() {
        System.out.println("Grades: " + this.cpi);
    }

    // to print name of the professor
    @Override
    public void prof() {
        System.out.println("Professor: " + this.prof);
    }

    // to print grades in all subjects
    @Override
    public void subject() {
        System.out.println("Subject wise Grades: ");
        System.out.println("MA 102: A-");
        System.out.println("CSO 102: A");
        System.out.println("MA 111: A-");
        System.out.println("H 106: S");
    }

    // printing hostel details
    @Override
    public void Hostel() {
        System.out.println("Hostel alloted: DG2");
        System.out.println("Room Number: 504");
    }
}

public class runfile {

    public static void main(String[] args) {
        // creating an inantance of students ,girls,boys
        Student s1 = new Student();
        girls g1 = new girls();

        Student s2 = new Student();
        boys b1 = new boys();

        // printing details of a girl
        System.out.println("Report Card of a girl");
        s1.name = "Aditi";
        s1.name();
        s1.surname = "Mittal";
        s1.surname();
        s1.roll_no = 21124003;
        s1.roll_no();
        g1.Hostel();
        g1.branch();
        g1.CPI();
        g1.subject();
        g1.prof();
        System.out.println();
        // printing details of a boy
        System.out.println("Report Card of a boy");
        s2.name = "Ajay";
        s2.name();
        s2.surname = "Jain";
        s2.surname();
        s2.roll_no = 21134033;
        s2.roll_no();
        b1.Hostel();
        b1.branch();
        b1.CPI();
        b1.subject();
        b1.prof();
    }
}
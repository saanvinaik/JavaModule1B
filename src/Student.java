 class StudentDetails {
    public static void main(String[] args)
    {
        Student[] obj = new Student[10];
        obj[0] = new Student(19, "Shlok", "Cosmos Complex, Bandra West, Mumbai.");
        obj[1] = new Student(18, "Grace", "Lotus Apartments, Dadar East, Mumbai.");
        obj[2] = new Student(17, "Tushar", "Rustomjee Apartments, Chembur West, Mumbai.");
        obj[3] = new Student(19, "Amey", "Dosti Vihar Complex, Thane West, Mumbai.");
        obj[4] = new Student(18, "Rohan", "Ruju Buildings, Andheri East, Mumbai.");
        obj[5] = new Student(16, "Saniya", "Vasant Lawns, Goregaon East, Mumbai.");
        obj[6] = new Student(18, "Sonal", "Ashar Complex, Thane East, Mumbai.");
        obj[7] = new Student(17, "Anushka", "Kohinoor Apartments, Kurla West, Mumbai.");
        obj[8] = new Student(19, "Riya", "Aqurina Buildings, Kalyan East, Mumbai.");
        obj[9] = new Student(16, "Atharva", "Blossom Society, Andheri West, Mumbai.");

        System.out.println("Student 1");
        obj[0].display();
        System.out.println("Student 2");
        obj[1].display();
        System.out.println("Student 3");
        obj[2].display();
        System.out.println("Student 4");
        obj[3].display();
        System.out.println("Student 5");
        obj[4].display();
        System.out.println("Student 6");
        obj[5].display();
        System.out.println("Student 7");
        obj[6].display();
        System.out.println("Student 8");
        obj[7].display();
        System.out.println("Student 9");
        obj[8].display();
        System.out.println("Student 10");
        obj[9].display();
    }
}

class Student
{
    Student(int sage, String sname, String saddress)
    {
        age = sage;
        name = sname;
        address = saddress;
    }
    int age;
    String name;
    String address;
    public Student()
    {
        this.name = "unknown";
        this.age = 0;
        this.address = "not avaliable";
    }
    public void setInfo(int age, String name)
    {
        this.name = name;
        this.age = age;
    }
    public void setInfo(int age, String name, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display() {
        System.out.println("Name : " + name + "  " + "\nAge : " + age + "\nAddress : " + address);
        System.out.println();
    }
}
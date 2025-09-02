package OOPs;
//create student management project
class Student{
    private String name;
    private String course;
    private int grade;

    //constructor
    Student(String cName,String cCourse,int cGrade){
        this.name=cName;
        this.course=cCourse;
        this.grade=cGrade;
    }

    //getter
    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getGrade() {
        return grade;
    }


    //setter
    public void setName(String name){
        this.name=name;
    }

    public void setCourse(String course){
        this.course=course;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }


    public String gradeCalculation() {
        return null;
    }

    //print details
    void display(){
        System.out.println("Name : "+name+" Course : "+course+" Grade : "+gradeCalculation());
    }
}

class UnderGraduate extends Student{
    public UnderGraduate(String name, String course, int grade){
        super(name,course,grade);
    }

    @Override
    public String gradeCalculation(){
        if (getGrade()>=60){
            return "Pass UG";
        }else {
            return "Fail UG";
        }
    }
}

class PostGraduate extends Student{
    public PostGraduate(String name,String course,int grade){
        super(name,course,grade);
    }

    public String gradeCalculation(){
        if (getGrade()>=60){
            return "Pass PG";
        }else {
            return "Fail PG";
        }
    }
}
public class studentMangmentSystem {
    public static void main(String[] args) {
        //for some space
        System.out.println(" ");
        System.out.println(" ");


        UnderGraduate ug1=new UnderGraduate("Amit","BCA",80);
        UnderGraduate ug2=new UnderGraduate("Pankaj","B.com",50);
        UnderGraduate ug3=new UnderGraduate("Prakash","Btech",90);
        UnderGraduate ug4=new UnderGraduate("Mohan","B.sc",30);
        UnderGraduate ug5=new UnderGraduate("Priya","B.Pharma",90);

        //Displaying student details
        System.out.println("====UG Student Records====");
        ug1.display();
        ug2.display();
        ug3.display();


        //for space
        System.out.println(" ");
        System.out.println(" ");


        PostGraduate pg1=new PostGraduate("Pradeep","MA",33);
        PostGraduate pg2=new PostGraduate("Rohan","M.com",89);
        PostGraduate pg3=new PostGraduate("Shani","Mtech",70);
        PostGraduate pg4=new PostGraduate("Shivam","Intermediate",30);
        PostGraduate pg5=new PostGraduate("Ravi","M.sc",85);
        //Displaying student details
        System.out.println("====PG Student Records====");
        pg1.display();
        pg2.display();
        pg3.display();
        pg4.display();
        pg5.display();
    }
}

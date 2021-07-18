class student
{
    int m1,m2,m3, total;
    void process(int mark1, int mark2, int mark3)
    {
        m1=mark1;
        m2=mark2;
        m3=mark3;
    }
    int display()
    {
        total=m1+m2+m3;
        System.out.println("The total marks are " + total);
        return total;
    }
}

public class return_type {
    public static void main(String []args)
    {
        int t;
        student s=new student();
       s.process(90,97,99);
        t=s.display();
        System.out.println(t);
    }
}

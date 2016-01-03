import Student;

class GraduateStudent extends Student {
    public int maxCredits() { return 12; }


public static void main(String[] args){
Student s, s1;
s = new Student();
s.getMaxCredits(); // which maxCredits method?
s1 = new GraduateStudent();
S1.getMaxCredits(); // which maxCredits method?
}}

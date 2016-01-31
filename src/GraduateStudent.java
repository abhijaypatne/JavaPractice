

class GraduateStudent extends Student {
    public int maxCredits() { return 12; }


public static void main(String[] args){
Student s, s1;
s = new Student();
s.maxCredits(); // which maxCredits method?
s1 = new GraduateStudent();
s1.maxCredits(); // which maxCredits method?
}}

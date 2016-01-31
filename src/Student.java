public class Student {
    public String name; 
    public int age;
    
    public Student(){
    	
    }
    
    public Student(String name,int age){
        this.name = name; 
        this.age = age; 
        }
    
    public int maxCredits() { return 15; }
    
    public String customShow(Function<Student,String> fun){
        return fun.apply(this); } }
        for(Student st: list){
            System.out.println(st.customShow(s->s.name+": "+s.name)); }
            Function<Student,String> styleOne = s->{
                String result = "Name:"+s.name +" and Age:"+s.age; return result; };
for(Student st: list){
    System.out.println(st.customShow(styleOne));
}


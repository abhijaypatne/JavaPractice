/*
public class Hello {
    Runnable r1 = ()->(System.out.println(this);};
            Runnable r2 = ()->(System.out.println(toString());};
                public String toString(){return “Howdy!”;}
                public static void main(String args) {
                    new Hello().r1.run();
                    new Hello().r2.run();
                }
                }

  */             

import java.util.*;
import java.lang.*;

public class Hello {
    Runnable r1 = ()->(System.out.println(this));};
    Runnable r2 = ()->(System.out.println(toString());};
        public String toString(){return "Howdy!";}
        public static void main(String args) {
//            new Hello().r1.run();
  //          new Hello().r2.run();
          Hello h1 = new Hello();
          Hello h2 = new Hello();

            h1.r1.run();
            h2.r2.run();
        }
        }

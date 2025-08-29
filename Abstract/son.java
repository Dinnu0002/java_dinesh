public class son {
    public  interface  Father {
        String name= "Anuj";
        static int age =10;    // static variable
        void add () ;
        public  static void demo(){
            System.out.println("caring");
        }

           

        }
        public interface Mother {
            void add();
            public static void demo(){
                System.out.println("Father static method");
            }
        }
        public static void main(String[] args) {
            
      
        son s = new son();
    Father.demo();
    

     

        }
    }


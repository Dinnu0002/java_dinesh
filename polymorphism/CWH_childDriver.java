

public class CWH_childDriver {
    public class parent{
        public static void demo(){
            System.out.println("parent demo class");
        }
        public class child extends parent{
            public static void demo(){
                System.out.println("chiid demo Method");
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("++++=======Parent object");
        CWH_childDriver c1  = new CWH_childDriver();
    

    }

}

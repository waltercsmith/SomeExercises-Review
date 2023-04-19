


    public class SomeMethods {

        public static String sayHey(String input){
            return "Hey, " + input;
        }

        public static String sayYo(int input2){
            return "Yo, " + input2;
        }

        public static void changeString(String s) {
            s = "Wub a lub a dub dub";
        }
//      Prints Three
        public static void printThree(){
            System.out.println("Three");
        }

        public static String greetVisitor(String name){
            return "Welcome " + name + " !";
        }

        public static String greetUser(String user){
            return "Welcome Back " + user + " !";
        }
        public static void main(String[] args){


//            sayHey("Walter");
//            String sayHeyWalter = sayHey("Walter"); // ---> called/invoked sayHey method
//
//            System.out.println(sayHey("Walter"));
//
//
//            System.out.println(sayHeyWalter);
//
//            System.out.println(sayYo(5));

        User newUser = new User();

        newUser.userName = "Walt243";

        newUser.firstName = "Walt";

        newUser.surName = "Smith";

        newUser.createPost();

//        Invoke/Call printThree method
            printThree();


//        Invoke/Call greetVisitor method BUT in order to print the return need to use the System.out.print
            greetVisitor("Walt");

            System.out.println(greetVisitor("Walt"));







        }
    }

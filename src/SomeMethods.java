
class User{
    public void createPost(){
        System.out.println("Created New Post");
    }

    public void deletePost(){
        System.out.println("Deleted Post");
    }

    public void updatePost(){
        System.out.println("Updated Post");
    }
}
    public class SomeMethods {

        public static String sayHey(String input){
            return "Hey, " + input;
        }

        public static String sayYo(int input2){
            return "Yo, " + input2;
        }

        public static String drinkBeverage(String input3){
            return "Drinking beverage called: " + input3;
        }

        public static void main(String[] args){


            sayHey("Walter");
            String sayHeyWalter = sayHey("Walter");

            System.out.println(sayHey("Walter"));


            System.out.println(sayHeyWalter);

            System.out.println(sayYo(5));

            System.out.println(drinkBeverage("Coffee"));

            User newPerson = new User();
            newPerson.createPost();






        }
    }

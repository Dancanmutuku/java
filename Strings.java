public class Strings{
    public static void main(String[] args){
        String message = "Hello world" + "!!";
        System.out.println(message);
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.lastIndexOf("W"));
        System.out.println(message.replace("Hello" , "Fuck you"));
        System.out.println(message.trim());
        int [] numbers = new int [5];
        numbers [0] = 1;
        numbers[1] =2;
        

    }
}
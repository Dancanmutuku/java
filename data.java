import java.util.Arrays;
public class data {
    /**
     * @param args
     */
    public static void main(String[] args){
        int age = 19;
        System.out.println(age);
            String message = "Hello world" + "!!";
            System.out.println(message);
            System.out.println(message.startsWith("!!"));
            System.out.println(message.length());
            System.out.println(message.lastIndexOf("W"));
            System.out.println(message.replace("Hello" , "Fuck you"));
            System.out.println(message.trim());
            int [] Numbers = new int [5];
            Numbers [0] = 1;
            Numbers[1] =2;
            Arrays.toString(Numbers);
            System.out.println(Arrays.toString(Numbers));
            /* 
            int[] numbers = { 2, 3, 5, 6, 7};
            System.out.println(numbers);
            System.out.println(numbers.length);*/
            /* dimensional arrays */
            int [][][] numbers = new int[2][3][5];
            numbers[0][2][0] =1;
            System.out.println(Arrays.deepToString(numbers));
            /* arithemtic */
            double result = (double)10 / (double)3;
            System.out.println(result);
            int x = 3;
            int y=x++;
            ++x;
            System.out.println(x);
            System.out.println(y);
            /*Order of operations */
            int z = (10+7)*2;
            System.out.println(z);
            //casting and conversion
            //implicit casting 
            //byte > short > int > long 
            double d = 1.1;
           double e = d + 2;
           System.out.println(e); 
           int day = 4;
           switch (day) {
             case 1:
               System.out.println("Monday");
               break;
             case 2:
               System.out.println("Tuesday");
               break;
             case 3:
               System.out.println("Wednesday");
               break;
             case 4:
               System.out.println("Thursday");
               break;
             case 5:
               System.out.println("Friday");
               break;
             case 6:
               System.out.println("Saturday");
               break;
             case 7:
               System.out.println("Sunday");
               break;
           }
    }
}
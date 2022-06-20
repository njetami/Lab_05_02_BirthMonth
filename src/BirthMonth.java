import javax.swing.*;

public class BirthMonth
{
    public static void main(String[] args) {
       int birthMonth = 5;

               if (birthMonth >12)


        {
            System.out.println("You entered an incorrect Month value " + birthMonth);
        }
                else if(birthMonth <1)
                {
                    System.out.println("You entered an incorrect Month value " + birthMonth);
                }
                else{
                   System.out.println("You entered a correct Month value" + birthMonth);
               }
    }
}

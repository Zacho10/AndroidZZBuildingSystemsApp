import java.util.Scanner;
public class Controller {

    public static void main(String[] args){
        Calculator calculatorObject = new Calculator();
        while(true){
            Scanner myReader = new Scanner(System.in);

            int width, height;
        System.out.println("Welcome to ZZ Building Systems app");


        System.out.println("Please enter Door specification in the following format and press Enter:(1or2)(fire resistance-type)(minutes)");
        System.out.println("Available types: 1ei60, 2ei60, 2ei90, 1ei120, 1rei60, 2rei60, 1rei120, 2rei120 or type stop , to end program");
        String type = myReader.nextLine();
        if("end".equals(type)) break ;

        System.out.println("Please enter width :");
        width = myReader.nextInt();
        System.out.println("Please enter height :");
        height = myReader.nextInt();
        System.out.println("Price for " +type.toUpperCase() +" "+width +"x"+height + " is:  " +calculatorObject.calculatePrice(width,height,type));



    }
    }
}

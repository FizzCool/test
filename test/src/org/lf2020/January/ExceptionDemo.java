package f16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Liang Fei
 * @Date 1/16/2020 1:03 PM
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
            method1();
            try{
                method2();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            throw new NullPointerException();

//        System.out.println("-----------------------");
//        System.out.println("Application end");
//

    }
    public static void method1() throws ParseException {
        String date ="2020-01-06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(date);
        System.out.println(date1);
    }
    public static void method2() throws ArrayIndexOutOfBoundsException{

            throw new ArrayIndexOutOfBoundsException();
    }

}

import java.util.Scanner;

public class MyClass7 {
    public static void main(String[] args){

        //1. Написать простой булев калькулятор. Это задание не на знание программирования, а на понимание логики.
        // Вы можете как и сами написать код с нуля, так и заполнить недостающие данные на рисунке 1.
        // Условия задания:Пользователь, в одну строку, вводит первый операнд (1 или 0), оператор (& или |) и
        // второй операнд (1 или 0), результат будет True,  False или Неизвестный оператор.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter boolean expression:");
        String expr = scanner.nextLine();

        char s1 = expr.charAt(0);
        char op = expr.charAt(1);
        char s2 = expr.charAt(2);

        boolean res1;
        if(s1 == '1'){
            res1 = true;
        } else{
            res1 = false;
        }

        boolean res2;
        if(s2 == '1'){
            res2 = true;
        } else{
            res2 = false;
        }

        if(op == '&'){
            System.out.println(res1 && res2);
        } else if(op == '|'){
            System.out.println(res1 || res2);
        } else{
            System.out.println("Unknown operator");
        }

        //2.Эту задачку(условие переписывать сюда не буду, оно очень длинное), я решил, немного сам, потом всё таки
        //посмотрел в интернете) Мне всё таки не очень понравилась задача эта, не особо логическая, так как там
        // не только по условиям, а и по диалогу между ними надо судить о её дне рождения, уже к
        // психолгии какие-то отсылки, неоднозначная задача...
        //ответ 16 июля родилась Шерил.


    }
}

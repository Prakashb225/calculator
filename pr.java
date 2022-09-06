import java.util.Scanner;

public class pr {
    public static void main(String[] args){
        char operator;
        int num1,num2,result;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an operator:+,-,*, or /");
        operator=input.next().charAt(0);
        System.out.println("enter the first no:");
        num1=input.nextInt();
        System.out.println("enter a second no:");
        num2=input.nextInt();
        switch(operator){
            case '+':
            result=num1 + num2;
            System.out.println(num1 +"+"+num2 +"=" +result);
            break;
            case '-':
            result=num1-num2;
            System.out.println(num1+"-"+num2+"="+result);
            break;
            
            case '*':
            result=num1*num2;
            System.out.println(num1+"*"+num2+"="+result);
            break;
            case '/':
            result=num1/num2;
            System.out.println(num1+"/"+num2+"="+result);
            break;
            default:
            
            System.out.println("Invalid operator");
            break;

        }
        input.close();

    

    }
}

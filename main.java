
/*
Author : Eric Muli
Github : github.com/EricRootLee
Page Title : Java Conditions , loops and Data types
Platform : Any Os
Target : N/A 
*/

public class main {
    public static void main(String[] args) {

        System.out.print("Hello");

        int num = 0;
        while (num <= 100) {
            num++;
            switch (num) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 50:
                System.out.println("50");
            default:
                System.out.println("null " + num);
            }
        }

    }

}
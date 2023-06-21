import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // sử dụng Queue để kiểm tra xem 1 chuỗi có dối xứng không
        Scanner sc=  new Scanner( System.in);
        // cho phép người dùng nhập vào 1 chuỗi
        System.out.println("Nhập vào chuỗi cần kiểm tra");
        String input = sc.nextLine();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = input.length()-1; i >=0 ; i--) {
            queue.offer(input.charAt(i));
        }

        String reverseInput = "";
        while (!queue.isEmpty()){
            reverseInput+=queue.poll();
        }
        if(input.equals(reverseInput)){
            System.out.println("Chuỗi bạn vừa nhập là chuỗi Palindrome");
        }else {
            System.out.println("Chuỗi bạn vừa nhập ko phải là chuỗi Palindrome");
        }
    }
}
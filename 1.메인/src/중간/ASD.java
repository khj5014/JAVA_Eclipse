package 중간;

import java.util.Scanner;
class ASD {
  public static void main(String[] args) {
    int first,second,third,fourth;
    Scanner s = new Scanner(System.in);
    System.out.print("첫 번째로 계산할첫 번째 계산할 값을 입력하세요 ->");
    first= s.nextInt();
        System.out.print("두 번째로 계산할첫 번째 계산할 값을 입력하세요 ->");
    second= s.nextInt();
        System.out.print("세 번째로 계산할첫 번째 계산할 값을 입력하세요 ->");
    third= s.nextInt();
        System.out.print("네 번째로 계산할첫 번째 계산할 값을 입력하세요 ->");
    fourth= s.nextInt();

    System.out.print(first + " + " + second + " - " + third + " + "+ fourth + " = " +(first+second-third+fourth));

  }
}

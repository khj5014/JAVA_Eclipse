package �߰�;

import java.util.Scanner;
class ASD {
  public static void main(String[] args) {
    int first,second,third,fourth;
    Scanner s = new Scanner(System.in);
    System.out.print("ù ��°�� �����ù ��° ����� ���� �Է��ϼ��� ->");
    first= s.nextInt();
        System.out.print("�� ��°�� �����ù ��° ����� ���� �Է��ϼ��� ->");
    second= s.nextInt();
        System.out.print("�� ��°�� �����ù ��° ����� ���� �Է��ϼ��� ->");
    third= s.nextInt();
        System.out.print("�� ��°�� �����ù ��° ����� ���� �Է��ϼ��� ->");
    fourth= s.nextInt();

    System.out.print(first + " + " + second + " - " + third + " + "+ fourth + " = " +(first+second-third+fourth));

  }
}

package array;

import java.util.Scanner;

public class ArrQuestion2 {
    public static void main(String[] args) {
//        /*
//            [문제6] 가장 작은 수, 큰 수 찾기
//            - 사용자로부터 n개의 정수 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램
//         */
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
//        int length = scanner.nextInt();
//
//        int[] arr = new int[length];
//        int min = 0;
//        int max = 0;
//
//        System.out.println(length + "개의 정수를 입력하세요");
//
//        for (int i = 0; i < length; i++) {
//            int number = scanner.nextInt();
//            arr[i] = number;
//
//            if (i == 0) {
//                min = number;
//                max = number;
//            }
//            else {
//                min = min > number ? number : min ;
//                max = max > number ? max : number;
//            }
//        }
//
//        System.out.println("가장 작은 정수: " + min);
//        System.out.println("가장 큰 정수:" + max);

        /*
            [문제7] 2차원 배열1
            - 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램
         */
        Scanner scanner = new Scanner(System.in);

        Number[][] gradeArr = new Number[4][2];

        for(int i = 0; i < 4; i++) {
            // TODO: 고민 필요! 아니면 선생님 방식대로 반복문 나눠서 전개하기
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            double korean = scanner.nextInt();
            System.out.print("영어 점수:");
            double english = scanner.nextInt();
            System.out.print("수학 점수:");
            double math = scanner.nextInt();

            gradeArr[i][0] = (korean + english + math);
            gradeArr[i][1] = (korean + english + math) / 3;

            System.out.println((i + 1) + "번 학생의 총점:" + gradeArr[i][0] + ", 평균: " + gradeArr[i][1]);
        }
    }
}

package array;

public class Array1 {
    /*
        기본형 vs 참조형
        자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있다.

        [기본형] Primitive Type
        int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입

        [참조형] Reference Type
        students[0] 처럼 데이터에 접근하기 위한 메모리의 참조(주소)를 저장하는 데이터 타입
        배열, 객체나 클래스를 담을 수 있는 변수들도 모두 참조형이다.

        Q. 배열은 왜 참조형을 쓸까?
        A1. 기본형은 모두 사이즈가 명확하게 정해져있지만, 배열은 동적으로 사이즈를 변경할 수 있다.

            int i; // 4byte
            long l; // 8byte
            double d; //8byte

            int size = 10000; // 사용자가 입력한 값을 넣었다고 가정하면 사이즈를 가늠할 수 없다.
            new int[size]; // 이 코드가 실행되는 시점에 배열의 크기가 정해진다.

        A2. 기본형은 사용할 값을 직접 저장한다. 반면에 참조형은 메모리에 저장된 배열이나 객체의 참조를 저장한다.
            이로 인해 참조형은 더 복잡한 데이터 구조를 만들고 관리할 수 있다. 반면 기본형은 더 빠르고 메모리를 효율적으로 처리한다.
     */
    public static void main(String[] args) {
        int [] students; // 배열 변수 선언
        students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}

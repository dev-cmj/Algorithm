import java.io.*;

public class Main {

    // 클래스 이름은 항상 Main이어야 합니다.

    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 BufferedReader와 BufferedWriter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 한 줄을 읽어 정수로 변환 (입력 프롬프트 제거)
        int year = Integer.parseInt(br.readLine());

        // 윤년 판별 로직
        // 4의 배수이면서 100의 배수가 아닐 때 (year % 4 == 0 && year % 100 != 0)
        // 또는 400의 배수일 때 (year % 400 == 0)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            bw.write("1\n"); // 윤년인 경우 1 출력
        } else {
            bw.write("0\n"); // 윤년이 아닌 경우 0 출력
        }

        // 버퍼에 남아있는 내용을 모두 출력하고 스트림 닫기
        bw.flush();
        bw.close();
        br.close();
    }
}

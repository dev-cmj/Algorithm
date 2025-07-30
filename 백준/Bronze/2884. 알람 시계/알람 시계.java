import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] timeParts = br.readLine().split(" ");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        int earlyTime = 45;

        if (minute < earlyTime) {
            hour--;
        }
        minute = (minute + 60 - earlyTime) % 60;

        if (hour < 0) {
            hour = 23;
        }

        bw.write(String.format("%d %d\n", hour, minute));

        bw.flush();
        bw.close();
        br.close();
    }
}
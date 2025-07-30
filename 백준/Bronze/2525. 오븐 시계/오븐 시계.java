import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] timeParts = br.readLine().split(" ");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        int plusMinute = Integer.parseInt(br.readLine());

        minute = minute + plusMinute;

        //23시 59분 + 3분
        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }

        if (hour >= 24) {
            hour = hour % 24;
        } else if (hour < 0) {
            hour = 24 + (hour % 24);
        }

        bw.write(String.format("%d %d\n", hour, minute));

        bw.flush();
        bw.close();
        br.close();
    }
}
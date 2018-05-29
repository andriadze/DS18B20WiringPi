import java.util.StringTokenizer;

public class TempSensorJNI {
    static {
        System.load("/home/pi/temp/libds18temp.so");
    }

    private native double getTemp();

    public static void main(String[] args) {
        String property = System.getProperty("java.library.path");
        StringTokenizer parser = new StringTokenizer(property, ";");
        while (parser.hasMoreTokens()) {
            System.err.println(parser.nextToken());
        }

        System.out.println("GOT TEMP FROM C " + new TempSensorJNI().getTemp());
    }
}

package p01_classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Box box = new Box(length, width, height);

        System.out.println(box.getSurfaceAreaAnswer());
        System.out.println(box.getLateralSurfaceAreaAnswer());
        System.out.println(box.getVolumeAnswer());

        //main ends here
    }
}

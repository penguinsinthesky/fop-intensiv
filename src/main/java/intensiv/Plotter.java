package intensiv;

import org.math.plot.Plot2DPanel;

import javax.swing.*;
import java.util.Arrays;

public class Plotter {

    private static final double STEP_SIZE = 0.01;

    public static void plot(DoubleToDoubleFunction f) {
        Plot2DPanel plot = new Plot2DPanel();

        plot(plot, f, -20.0, 100.0);

        JFrame frame = new JFrame("Plotter");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(plot);
        frame.setVisible(true);
    }

    private static void plot(Plot2DPanel panel, DoubleToDoubleFunction f, double from, double to) {
        int maxArraySize = (int) Math.ceil((to - from) / STEP_SIZE);
        double[] xValues = new double[maxArraySize];
        double[] yValues = new double[maxArraySize];

        int arrayOffset = 0;

        double currentX = from;
        while (currentX <= to) {
            if (f.isDefined(currentX)) {
                xValues[arrayOffset] = currentX;
                yValues[arrayOffset] = f.apply(currentX);
                ++arrayOffset;
            }

            currentX += STEP_SIZE;
        }

        double[] croppedX = Arrays.copyOf(xValues, arrayOffset);
        double[] croppedY = Arrays.copyOf(yValues, arrayOffset);

        panel.addLinePlot("f(x)", croppedX, croppedY);
    }

}

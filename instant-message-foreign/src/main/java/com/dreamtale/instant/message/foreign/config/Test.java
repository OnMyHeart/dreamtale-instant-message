package com.dreamtale.instant.message.foreign.config;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Test {

    public static void main(String[] args){
        XYSeries series = new XYSeries("xySeries");
        for (int x = -100; x < 100; x++) {
            int y = x*x;
            series.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart(
                // chart title
                "y = x^2",
                // x axis label
                "x",
                // y axis label
                "y",
                // data
                dataset,
                PlotOrientation.VERTICAL,
                // include legend
                false,
                // tooltips
                false,
                // urls
                false
        );

        ChartFrame frame = new ChartFrame("my picture", chart);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

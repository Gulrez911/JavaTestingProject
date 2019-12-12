package com.gul.test;

import java.text.DateFormatSymbols;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class StackedBarChartDemo5 extends ApplicationFrame {

	public StackedBarChartDemo5(final String title) {
		super(title);
		final CategoryDataset dataset = createDataset();
		final JFreeChart chart = createChart(dataset);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(990, 650));
		setContentPane(chartPanel);
	}

	private CategoryDataset createDataset() {
		DefaultCategoryDataset result = new DefaultCategoryDataset();

		String[] month = new DateFormatSymbols().getShortMonths();

		for (int i = 0; i < 12; i++) {
			result.addValue(20, "Present", month[i]);
			result.addValue(5, "Absent", month[i]);
			result.addValue(3, "Half-Date", month[i]);
			result.addValue(4, "Week-Day", month[i]);
		}
//		result.addValue(20, "Present", "Jan");
//		result.addValue(5, "Absent", "Jan");
//		result.addValue(1, "Half-Day", "Jan");
//		result.addValue(3, "Week-Day", "Jan");
//		result.addValue(21, "Present", "Feb");
//		result.addValue(6, "Absent", "Feb");
//		result.addValue(2, "Half-Day", "Feb");
//		result.addValue(5, "Week-Day", "Feb");

		return result;
	}

	private JFreeChart createChart(final CategoryDataset dataset) {

		final JFreeChart chart = ChartFactory.createStackedBarChart("Stacked Bar Chart Demo 4", // chart title
				"Category", // domain axis label
				"Value", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // the plot orientation
				true, // legend
				true, // tooltips
				false // urls
		);

		return chart;

	}

	private LegendItemCollection createLegendItems() {
		LegendItemCollection result = new LegendItemCollection();
		return result;
	}

	public static void main(final String[] args) {
		final StackedBarChartDemo5 demo = new StackedBarChartDemo5("Stacked Bar Chart Demo 4");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

package com.gul.test;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class StackedBarChartDemo4 extends ApplicationFrame {

	public StackedBarChartDemo4(final String title) {
		super(title);
		final CategoryDataset dataset = createDataset();
		final JFreeChart chart = createChart(dataset);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(990, 650));
		setContentPane(chartPanel);
	}

	private CategoryDataset createDataset() {
		DefaultCategoryDataset result = new DefaultCategoryDataset();

		result.addValue(20, "Present", "Jan");
		result.addValue(5, "Absent", "Jan");
		result.addValue(1, "Half-Day", "Jan");
		result.addValue(21, "Present", "Feb");
		result.addValue(6, "Absent", "Feb");
		result.addValue(2, "Half-Day", "Feb");
		result.addValue(19, "Present", "Apr");
		result.addValue(7, "Absent", "Apr");
		result.addValue(3, "Half-Day", "Apr");
		result.addValue(19, "Present", "Mar");
		result.addValue(7, "Absent", "Mar");
		result.addValue(3, "Half-Day", "Mar");
		result.addValue(19, "Present", "May");
		result.addValue(7, "Absent", "May");
		result.addValue(3, "Half-Day", "May");
		result.addValue(19, "Present", "June");
		result.addValue(7, "Absent", "June");
		result.addValue(3, "Half-Day", "June");
		result.addValue(19, "Present", "July");
		result.addValue(7, "Absent", "July");
		result.addValue(3, "Half-Day", "July");
		result.addValue(19, "Present", "Aug");
		result.addValue(7, "Absent", "Aug");
		result.addValue(3, "Half-Day", "Aug");
		result.addValue(19, "Present", "Sept");
		result.addValue(7, "Absent", "Sept");
		result.addValue(3, "Half-Day", "Sept");
		result.addValue(19, "Present", "Oct");
		result.addValue(7, "Absent", "Oct");
		result.addValue(3, "Half-Day", "Oct");
		result.addValue(19, "Present", "Nov");
		result.addValue(7, "Absent", "Nov");
		result.addValue(3, "Half-Day", "Nov");
		result.addValue(19, "Present", "Dec");
		result.addValue(7, "Absent", "Dec");
		result.addValue(3, "Half-Day", "Dec");

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
		final StackedBarChartDemo4 demo = new StackedBarChartDemo4("Stacked Bar Chart Demo 4");
		demo.pack();
		RefineryUtilities.centerFrameOnScreen(demo);
		demo.setVisible(true);
	}

}

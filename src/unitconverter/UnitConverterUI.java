package unitconverter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import unitconverter.UnitConverter.UnitTypes;

/**
 * User Interface for unit converter application
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public class UnitConverterUI extends JFrame {
	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItem, exitItem;
	private JPanel body;
	private JComboBox<String> leftBox, rightBox;
	private JTextField leftText, rightText;
	private UnitConverter converter;
	private JButton convertbtn, clearbtn;

	/**
	 * Initialize setting application
	 */
	public UnitConverterUI() {
		super("Unit Converter");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(100, 2500);
		initComponent();

	}

	/**
	 * Method for initialize all components.
	 */
	public void initComponent() {
		converter = new UnitConverter();
		// setting selected menu of unit types
		menu = new JMenu("UnitType");
		for (UnitTypes unit : UnitTypes.class.getEnumConstants()) {
			menuItem = new JMenuItem(unit.toString());
			menuItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					clear();
					leftBox.setModel(new DefaultComboBoxModel(converter.getUnits(unit)));
					rightBox.setModel(new DefaultComboBoxModel(converter.getUnits(unit)));
				}
			});
			menu.add(menuItem);
		}
		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);

			}
		});
		menu.add(exitItem);
		menuBar = new JMenuBar();
		menuBar.add(menu);
		setJMenuBar(menuBar);

		// setting converter body
		leftText = new JTextField("");
		leftBox = new JComboBox<>();
		leftBox.setModel(new DefaultComboBoxModel(converter.getUnits(UnitTypes.LENGTH)));
		rightText = new JTextField("");
		rightBox = new JComboBox<>();
		rightBox.setModel(new DefaultComboBoxModel(converter.getUnits(UnitTypes.LENGTH)));

		body = new JPanel();
		body.setLayout(new GridLayout(1, 7));
		body.add(leftText);
		body.add(leftBox);
		JLabel equalSign = new JLabel("=", SwingConstants.CENTER);
		equalSign.setAlignmentX(CENTER_ALIGNMENT);
		body.add(equalSign);
		body.add(rightText);
		body.add(rightBox);

		// add convert and clear button
		convertbtn = new JButton("   Convert!   ");
		convertbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double resultConvert = 0;
				if (rightText.getText().equals("")) {
					resultConvert = converter.convert(Double.parseDouble(leftText.getText()),
							(Unit) leftBox.getSelectedItem(), (Unit) rightBox.getSelectedItem());
					rightText.setText(String.format("%.4g", resultConvert));
				} else {
					resultConvert = converter.convert(Double.parseDouble(rightText.getText()),
							(Unit) rightBox.getSelectedItem(), (Unit) leftBox.getSelectedItem());
					leftText.setText(String.format("%.4g", resultConvert));
				}
				System.out.println(resultConvert);

			}
		});
		clearbtn = new JButton("   Clear   ");
		clearbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clear();

			}
		});

		body.add(convertbtn);
		body.add(clearbtn);
		add(body);

		pack();
	}

	/**
	 * clear all text field
	 */
	public void clear() {
		leftText.setText("");
		rightText.setText("");
	}

	/** Display the game window */
	public void run() {
		setVisible(true);
	}
}

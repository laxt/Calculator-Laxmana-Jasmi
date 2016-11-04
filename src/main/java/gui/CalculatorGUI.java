package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import otherclasses.MethodsForAdvancedCalculator;
import otherclasses.MethodsForSimpleCalculations;
import java.awt.Font;



public class CalculatorGUI implements ActionListener{
	private JFrame frame;
	private JTextField textDisplay;
	private JButton btn1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton btnminus;
	private JButton btnplus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnPi;
	private JButton btnEqual;
	private JButton btnSquareRoot;
	private JButton btnSquare;
	private JButton btnLog;
	private JButton btnDot;
	private JButton btnSin;
	private JButton btnCos;
	private JButton btnTan;

	private  MethodsForSimpleCalculations MSCalc;
	private String mathInputString;
	private Object result;
	private ScriptEngineManager manager = new ScriptEngineManager();
	private ScriptEngine engine = manager.getEngineByName("js");

	private MethodsForAdvancedCalculator mca = new MethodsForAdvancedCalculator();
	private JButton btnAC;


	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	
	public static void main(String[] args) {
		CalculatorGUI window = new CalculatorGUI();
		window.frame.setVisible(true);
		}

	public CalculatorGUI() {
		CreateUI();
		addComponentsToFrame();
		addActionListeners();
	}

	
			public void CreateUI() {
					
					frame = new JFrame("Calculator-Lax-Jasmi");
					frame.setResizable(false);
					frame.setFont(new Font("Dialog", Font.PLAIN, 10));
					frame.setBounds(100, 100, 421, 254);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.getContentPane().setLayout(null);

					
					textDisplay = new JTextField();
					textDisplay.setBounds(0, 6, 397, 36);
					textDisplay.setColumns(10);
					
					btn1 = new JButton("0");
					btn1.setBounds(0, 48, 51, 29);
					
					button = new JButton("1");
					button.setBounds(61, 48, 51, 29);
					
					button_1 = new JButton("2");
					button_1.setBounds(129, 48, 51, 29);
					
					button_2 = new JButton("3");
					button_2.setBounds(0, 93, 51, 29);
					
					button_3 = new JButton("4");
					button_3.setBounds(61, 93, 51, 29);
					
					button_4 = new JButton("5");
					button_4.setBounds(129, 93, 51, 29);
					
					button_5 = new JButton("6");
					button_5.setBounds(0, 134, 51, 29);
					
					button_6 = new JButton("7");
					button_6.setBounds(61, 134, 51, 29);
					
					button_7 = new JButton("8");
					button_7.setBounds(129, 134, 51, 29);
					
					button_8 = new JButton("9");
					button_8.setBounds(0, 172, 51, 29);
					
					btnminus = new JButton("-");
					btnminus.setBounds(61, 172, 51, 29);
					
					btnplus = new JButton("+");
					btnplus.setBounds(129, 172, 51, 29);
					
					btnMultiply = new JButton("*");
					btnMultiply.setBounds(195, 48, 51, 29);
					
					btnDivide = new JButton("/");
					btnDivide.setBounds(195, 93, 51, 29);
					
					btnPi = new JButton("\u03C0 ");
					btnPi.setBounds(195, 134, 51, 29);
					
					btnEqual = new JButton("=");
					btnEqual.setBounds(195, 172, 51, 29);
					
					btnSquareRoot = new JButton("\u221A");
					btnSquareRoot.setBounds(261, 48, 64, 29);
					
					btnSquare = new JButton("pow");
					btnSquare.setBounds(261, 93, 64, 29);
					
					btnLog = new JButton("log");
					btnLog.setBounds(261, 134, 64, 29);
					
					btnDot = new JButton(".");
					btnDot.setBounds(261, 172, 64, 29);
					
					btnSin = new JButton("Sin");
					btnSin.setBounds(340, 48, 64, 29);
					
					btnCos = new JButton("Cos");
					btnCos.setBounds(340, 93, 64, 29);
					
					btnTan = new JButton("Tan");
					btnTan.setBounds(340, 134, 64, 29);
					
					btnAC = new JButton("AC");
					btnAC.setBounds(340, 172, 64, 29);

					MSCalc= new MethodsForSimpleCalculations();
					
				}
	

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void addComponentsToFrame(){
		frame.getContentPane().add(textDisplay);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(button);
		frame.getContentPane().add(button_1);
		frame.getContentPane().add(button_2);
		frame.getContentPane().add(button_3);
		frame.getContentPane().add(button_4);
		frame.getContentPane().add(button_5);
		frame.getContentPane().add(button_6);
		frame.getContentPane().add(button_7);
		frame.getContentPane().add(button_8);

		frame.getContentPane().add(btnminus);
		frame.getContentPane().add(btnplus);
		frame.getContentPane().add(btnMultiply);
		frame.getContentPane().add(btnDivide);

		frame.getContentPane().add(btnPi);
		frame.getContentPane().add(btnEqual);
		frame.getContentPane().add(btnSquareRoot);
		frame.getContentPane().add(btnSquare);
		frame.getContentPane().add(btnLog);
		frame.getContentPane().add(btnDot);
		frame.getContentPane().add(btnSin);
		frame.getContentPane().add(btnCos);
		frame.getContentPane().add(btnTan);
		frame.getContentPane().add(btnAC);


	}

	public void addActionListeners(){
		btn1.addActionListener(this);		
		button.addActionListener(this);
		button_1.addActionListener(this);
		button_2.addActionListener(this);
		button_3.addActionListener(this);
		button_4.addActionListener(this);
		button_5.addActionListener(this);
		button_6.addActionListener(this);
		button_7.addActionListener(this);
		button_8.addActionListener(this);
		btnminus.addActionListener(this);
		btnplus.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnPi.addActionListener(this);
		btnEqual.addActionListener(this);
		btnSquareRoot.addActionListener(this);
		btnSquare.addActionListener(this);
		btnLog.addActionListener(this);
		btnDot.addActionListener(this);
		btnSin.addActionListener(this);
		btnCos.addActionListener(this);
		btnTan.addActionListener(this);
		btnAC.addActionListener(this);

	}

	public void equalButtonMethod () {
		mathInputString = textDisplay.getText();
		try {
			result = engine.eval(mathInputString);
			textDisplay.setText(""+result);
		} catch(Exception s) {
			s.getMessage();
		}
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==btnAC){
			textDisplay.setText(null);
		}			

		if (e.getSource()==btn1){
			String EnterNumber = textDisplay.getText() +btn1.getText();
			textDisplay.setText(EnterNumber);
		}			
	
		if (e.getSource()==button){
			String EnterNumber = textDisplay.getText() +button.getText();
			textDisplay.setText(EnterNumber);

		}
		

		if (e.getSource()==button_1){
			String EnterNumber = textDisplay.getText() +button_1.getText();
			textDisplay.setText(EnterNumber);

		}
		
		if (e.getSource()==button_2){
			String EnterNumber = textDisplay.getText() +button_2.getText();
			textDisplay.setText(EnterNumber);

		}
		if (e.getSource()==button_3){
			String EnterNumber = textDisplay.getText() +button_3.getText();
			textDisplay.setText(EnterNumber);

		}
		if (e.getSource()==button_4){
			String EnterNumber = textDisplay.getText() +button_4.getText();
			textDisplay.setText(EnterNumber);

		}
		if (e.getSource()==button_5){
			String EnterNumber = textDisplay.getText() +button_5.getText();
			textDisplay.setText(EnterNumber);

		}
		if (e.getSource()==button_6){
			String EnterNumber = textDisplay.getText() +button_6.getText();
			textDisplay.setText(EnterNumber);

		}
		if (e.getSource()==button_7){
			String EnterNumber = textDisplay.getText() +button_7.getText();
			textDisplay.setText(EnterNumber);

		}

		if (e.getSource()==button_8){
			String EnterNumber = textDisplay.getText() +button_8.getText();
			textDisplay.setText(EnterNumber);

		}


		if (e.getSource()==btnplus){
			textDisplay.setText(textDisplay.getText()+"+");
	}

		if (e.getSource()==btnminus){
			textDisplay.setText(textDisplay.getText()+"-");
	}
		if (e.getSource()==btnMultiply){
			textDisplay.setText(textDisplay.getText()+"*");
	}
		if (e.getSource()==btnDivide){
			textDisplay.setText(textDisplay.getText()+"/");
	}
		if (e.getSource() == btnDot) {
			textDisplay.setText(textDisplay.getText()+".");
		}


		if (e.getSource()==btnEqual){
			equalButtonMethod ();
			}

		if (e.getSource()== btnPi){
			try {
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.pi(txt2dbl1);
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}		
		} 
		
		if (e.getSource() == btnSquareRoot){
			try {
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.squareRoot(txt2dbl1);
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}
		}

		
		if (e.getSource() == btnSin){
			try {
				
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.sin(txt2dbl1);				
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}

		
		if (e.getSource() == btnCos){
			try {
				
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.cos(txt2dbl1);				
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}
			
		if (e.getSource() == btnTan){
			try {
				
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.tan(txt2dbl1);				
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}

		if (e.getSource() == btnLog){
			try {
				
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.log(txt2dbl1);				
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}

		if (e.getSource() == btnSquare){
			try {
				
				String firstField = textDisplay.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = mca.pow(txt2dbl1,txt2dbl1);				
				textDisplay.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}

		
	}
}

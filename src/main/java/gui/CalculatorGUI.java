package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



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
	private JButton btnClear;
	private JButton btnSquareRoot;
	private JButton btnSquare;
	private JButton btnLog;
	private JButton btnAc;
	private JButton btnSin;
	private JButton btnCos;
	private JButton btnTan;



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
	}

	
			public void CreateUI() {
					
					frame = new JFrame("Calculator-Lax-Jasmi");
					frame.getContentPane().setLayout(null);
					
					textDisplay = new JTextField();
					textDisplay.setBounds(0, 6, 400, 36);
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
					
					btnClear = new JButton("=");
					btnClear.setBounds(195, 172, 51, 29);
					
					btnSquareRoot = new JButton("\u221A");
					btnSquareRoot.setBounds(261, 48, 64, 29);
					
					btnSquare = new JButton("pow");
					btnSquare.setBounds(261, 93, 64, 29);
					
					btnLog = new JButton("log");
					btnLog.setBounds(261, 134, 64, 29);
					
					btnAc = new JButton("AC");
					btnAc.setBounds(261, 172, 64, 29);
					
					btnSin = new JButton("Sin");
					btnSin.setBounds(340, 48, 64, 29);
					
					btnCos = new JButton("Cos");
					btnCos.setBounds(340, 93, 64, 29);
					
					btnTan = new JButton("Tan");
					btnTan.setBounds(340, 134, 64, 29);
					
					

					
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
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnSquareRoot);
		frame.getContentPane().add(btnSquare);
		frame.getContentPane().add(btnLog);
		frame.getContentPane().add(btnAc);
		frame.getContentPane().add(btnSin);
		frame.getContentPane().add(btnCos);
		frame.getContentPane().add(btnTan);


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
		btnClear.addActionListener(this);
		btnSquareRoot.addActionListener(this);
		btnSquare.addActionListener(this);
		btnLog.addActionListener(this);
		btnAc.addActionListener(this);
		btnSin.addActionListener(this);
		btnCos.addActionListener(this);
		btnTan.addActionListener(this);
	
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==btnClear){
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

		
		
	}
}

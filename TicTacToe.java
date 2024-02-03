import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TicTacToe {

	public ArrayList<String> cols= new ArrayList<String>();
	public boolean isWinner=false,Draw = false;
	public JFrame frmTicTacToe;
	public JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset;
	public JLabel lbl,X_O;
	public boolean run = true;
	public String[] TicTacToe = {"X","O"}; 
	public int Xscore = 0, Oscore = 0;
	public int random = randomRangeRandom(0,1);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XOgame window = new XOgame();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public XOgame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) 
		{
			e.printStackTrace();
		}
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.setResizable(false);
		frmTicTacToe.setBounds(100, 100, 450, 300);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(null);
		
		cols.add("-");//0
		cols.add("-");//1
		cols.add("-");//2
		cols.add("-");//3
		cols.add("-");//4
		cols.add("-");//5
		cols.add("-");//6
		cols.add("-");//7
		cols.add("-");//8
		
		
		lbl = new JLabel(TicTacToe[random]);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl.setBounds(271, 95, 89, 27);
		frmTicTacToe.getContentPane().add(lbl); 
		
		JLabel lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(254, 142, 118, 14);
		frmTicTacToe.getContentPane().add(lbl2); 
		
		findWinner(lbl2);
		
		btn0 = new JButton("-");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn0.getText() == "-") {
				if(lbl.getText() == "X") {
					btn0.setText("X");
					cols.set(0, "X");
					
					lbl.setText("O");
				}
				else if(lbl.getText() == "O") {
					btn0.setText("O");
					cols.set(0, "O");
					lbl.setText("X");
				}
				
		}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn0.setBounds(22, 21, 62, 58);
		frmTicTacToe.getContentPane().add(btn0);
		
		btn1 = new JButton("-");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn1.getText() == "-") {
					if(lbl.getText() == "X") {
						btn1.setText("X");
						cols.set(1, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn1.setText("O");
						cols.set(1, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn1.setBounds(84, 21, 62, 58);
		frmTicTacToe.getContentPane().add(btn1);
		
		btn2 = new JButton("-");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn2.getText() == "-") {
					if(lbl.getText() == "X") {
						btn2.setText("X");
						cols.set(2, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn2.setText("O");
						cols.set(2, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn2.setBounds(147, 21, 62, 58);
		frmTicTacToe.getContentPane().add(btn2);
		
	btn3 = new JButton("-");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn3.getText() == "-") {
					if(lbl.getText() == "X") {
						btn3.setText("X");
						cols.set(3, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn3.setText("O");
						cols.set(3, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn3.setBounds(22, 81, 62, 58);
		frmTicTacToe.getContentPane().add(btn3);
		
		btn4 = new JButton("-");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn4.getText() == "-") {
					if(lbl.getText() == "X") {
						btn4.setText("X");
						cols.set(4, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn4.setText("O");
						cols.set(4, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn4.setBounds(84, 81, 62, 58);
		frmTicTacToe.getContentPane().add(btn4);
		
		btn5 = new JButton("-");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn5.getText() == "-") {
					if(lbl.getText() == "X") {
						btn5.setText("X");
						cols.set(5, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn5.setText("O");
						cols.set(5, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn5.setBounds(147, 81, 62, 58);
		frmTicTacToe.getContentPane().add(btn5);
		
		btn6 = new JButton("-");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn6.getText() == "-") {
					if(lbl.getText() == "X") {
						btn6.setText("X");
						cols.set(6, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn6.setText("O");
						cols.set(6, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn6.setBounds(22, 142, 62, 58);
		frmTicTacToe.getContentPane().add(btn6);
		
		btn7 = new JButton("-");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn7.getText() == "-") {
					if(lbl.getText() == "X") {
						btn7.setText("X");
						cols.set(7, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn7.setText("O");
						cols.set(7, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn7.setBounds(84, 142, 62, 58);
		frmTicTacToe.getContentPane().add(btn7);
		
		btn8 = new JButton("-");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn8.getText() == "-") {
					if(lbl.getText() == "X") {
						btn8.setText("X");
						cols.set(8, "X");
						lbl.setText("O");
					}
					else if(lbl.getText() == "O") {
						btn8.setText("O");
						cols.set(8, "O");
						lbl.setText("X");
					}
					
			}
				findWinner(lbl2);
				Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
				System.out.println(cols);
			}
		});
		btn8.setBounds(147, 142, 62, 58);
		frmTicTacToe.getContentPane().add(btn8);
		
		reset = new JButton("Restart");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				reset.setEnabled(false);
			}
		});
		reset.setEnabled(false);
		reset.setBounds(271, 167, 89, 23);
		frmTicTacToe.getContentPane().add(reset);
		
		JLabel Author = new JLabel("Made by @IbrahimSensei");
		Author.setFont(new Font("Monospaced", Font.PLAIN, 14));
		Author.setBounds(225, 221, 199, 14);
		frmTicTacToe.getContentPane().add(Author);
		
		JLabel lblNewLabel_1 = new JLabel("Tic Tac Toe");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(51, 222, 95, 14);
		frmTicTacToe.getContentPane().add(lblNewLabel_1);
		
		
		//while(run) {findWinner(lbl2);}
		//collems.toArray();
		System.out.println(cols);
		Reset(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,reset,lbl2);
		
		JLabel lblNewLabel = new JLabel("Beta 2");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblNewLabel.setBounds(135, 236, 37, 14);
		frmTicTacToe.getContentPane().add(lblNewLabel);
		
		JLabel SCORE = new JLabel("SCORE");
		SCORE.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		SCORE.setBounds(296, 11, 46, 14);
		frmTicTacToe.getContentPane().add(SCORE);
		
		JLabel XOSCORE = new JLabel("X  -  O");
		XOSCORE.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		XOSCORE.setHorizontalAlignment(SwingConstants.CENTER);
		XOSCORE.setBounds(296, 32, 46, 14);
		frmTicTacToe.getContentPane().add(XOSCORE);
		
		X_O = new JLabel("");
		X_O.setText(Xscore + " - " + Oscore);
		X_O.setHorizontalAlignment(SwingConstants.CENTER);
		X_O.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		X_O.setBounds(296, 53, 46, 14);
		frmTicTacToe.getContentPane().add(X_O);
		
	
	}
	public String[][] divBoard(ArrayList<String> arr){
		String[][] div = {
				//rows
				{arr.get(0),arr.get(1),arr.get(2)},
				{arr.get(3),arr.get(4),arr.get(5)},
				{arr.get(6),arr.get(7),arr.get(8)},
				//
				{arr.get(0),arr.get(3),arr.get(6)},
				{arr.get(1),arr.get(4),arr.get(7)},
				{arr.get(2),arr.get(5),arr.get(8)},
				
				{arr.get(0),arr.get(4),arr.get(8)},
				{arr.get(2),arr.get(4),arr.get(6)}
				};
		return div;
	}
	public void Reset(JButton btn0,JButton btn1,JButton btn2,JButton btn3,JButton btn4,JButton btn5
			,JButton btn6,JButton btn7,JButton btn8,JButton reset,JLabel lbl2) {
		if(isWinner||Draw) {
			btn0.setEnabled(false);
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn0.setText("-");
			btn1.setText("-");
			btn2.setText("-");
			btn3.setText("-");
			btn4.setText("-");
			btn5.setText("-");
			btn6.setText("-");
			btn7.setText("-");
			btn8.setText("-");
			
			X_O.setText(Xscore + " - " + Oscore);
			cols.set(0,"-");//0
			cols.set(1,"-");//1
			cols.set(2,"-");//2
			cols.set(3,"-");//3
			cols.set(4,"-");//4
			cols.set(5,"-");//5
			cols.set(6,"-");//6
			cols.set(7,"-");//7
			cols.set(8,"-");//8
			lbl.setText("");
			reset.setEnabled(true);
		}
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				random = randomRangeRandom(0,1);
				lbl.setText(TicTacToe[random]);
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				reset.setEnabled(false);
				lbl2.setText("");
				isWinner = false;
				Draw = false;
			}
		});
	}
	
	public void findWinner(JLabel lbl2) {
		String[][] div = divBoard(cols);
		for(int i =0; i <8;i++) {
			if(div[i][0] == div[i][1] && div[i][1] == div[i][2] && div[i][2] == div[i][0]){
				
				if(div[i][1] == "X") {
				String Winner = "The winner is " + div[i][1];
				lbl2.setText(Winner);Xscore++;isWinner = true;
				}
				else if(div[i][1] == "O") {
					
					String Winner = "The winner is " + div[i][1];
					lbl2.setText(Winner);Oscore++;isWinner = true;
					}
				
				
			}
			if(isWinner == false && isFilled() == true) {
				lbl2.setText("DRAW");
				Draw = true;
			}
			
		}
		
		
	}
	public boolean isFilled() {
		if(cols.get(0) != "-" && cols.get(1) != "-" && cols.get(2) != "-" &&
				cols.get(3) != "-" && cols.get(4) != "-" && cols.get(5) != "-" &&
						cols.get(6) != "-" && cols.get(7) != "-" && cols.get(8) != "-") {
			return true;
		}
		return false;
	}
	public int randomRangeRandom(int start, int end) {
	    Random random = new Random();
	    int number = random.nextInt((end - start) + 1) + start; // see explanation below
	    return number;
	}
}

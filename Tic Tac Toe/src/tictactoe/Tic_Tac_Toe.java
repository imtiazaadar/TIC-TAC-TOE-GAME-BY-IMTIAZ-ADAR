package tictactoe;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
/*
 * Imtiaz Adar
 * Email : imtiaz-adar@hotmail.com
 * Project : Tic Tac Toe
 * Language Used : Java
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Tic_Tac_Toe extends JFrame implements ActionListener{
	private Container c;
	private JLabel introLabel;
	private JLabel playerLabel;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton newGame;
	private JButton exit;
	private ImageIcon icon;
	private Font font1 = new Font("Comic Sans Ms", Font.BOLD, 35);
	private Font font2 = new Font("DS-DIGITAL", Font.PLAIN, 25);
	private Font font3 = new Font("Verdana", Font.PLAIN, 72);
	private Font font4 = new Font("Ink Free", Font.BOLD, 40);
	private Font font5 = new Font("Ink Free", Font.BOLD, 45);
	private Font font6 = new Font("Verdana", Font.BOLD, 15);
	private Font font7 = new Font("Comic Sans Ms", Font.BOLD, 30);
	private Color whitecolor = Color.WHITE;
	private Color blackcolor = Color.BLACK;
	private Color color1 = new Color(32, 32, 32);
	private Color color2 = new Color(102, 0, 51);
	private Color color3 = new Color(23, 161, 78);
	private Color color4 = new Color(224, 224, 224);
	private Color color5 = new Color(233, 44, 76);
	private Color color6 = new Color(174, 22, 22);
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private Border border1 = new BevelBorder(BevelBorder.LOWERED);
	private Border border2 = new LineBorder(color1, 1, true);
	private Border border3 = new LineBorder(color2, 2, true);
	private Border border4 = new LineBorder(whitecolor, 2, true);
	private Border border5 = new LineBorder(color6, 2, true);
	private boolean gameOver = false, ok = false;
	private String move = "O", win = "";
	private int count = 0;
	
	public Tic_Tac_Toe() {
		inComponent();
	}
	
	public void inComponent() {
		c = new Container();
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(whitecolor);
		icon = new ImageIcon(getClass().getResource("tictactoe.png"));
		setIconImage(icon.getImage());
		JPanel panel = new JPanel();
		panel.setBounds(2, 0, 600, 600);
		panel.setLayout(new GridLayout(3, 3));
		c.add(panel);
		
		one = new JButton();
		one.setCursor(cursor);
		one.setForeground(blackcolor);
		one.setBackground(whitecolor);
		one.setFont(font3);
		one.setFocusPainted(false);
		one.setHorizontalAlignment(JButton.CENTER);
		one.setVerticalAlignment(JButton.CENTER);
		one.setBorder(border2);
		panel.add(one);
		
		two = new JButton();
		two.setCursor(cursor);
		two.setForeground(blackcolor);
		two.setBackground(whitecolor);
		two.setFont(font3);
		two.setFocusPainted(false);
		two.setHorizontalAlignment(JButton.CENTER);
		two.setVerticalAlignment(JButton.CENTER);
		two.setBorder(border2);
		panel.add(two);
		
		three = new JButton();
		three.setCursor(cursor);
		three.setForeground(blackcolor);
		three.setBackground(whitecolor);
		three.setFont(font3);
		three.setFocusPainted(false);
		three.setHorizontalAlignment(JButton.CENTER);
		three.setVerticalAlignment(JButton.CENTER);
		three.setBorder(border2);
		panel.add(three);
		
		four = new JButton();
		four.setCursor(cursor);
		four.setForeground(blackcolor);
		four.setBackground(whitecolor);
		four.setFont(font3);
		four.setFocusPainted(false);
		four.setHorizontalAlignment(JButton.CENTER);
		four.setVerticalAlignment(JButton.CENTER);
		four.setBorder(border2);
		panel.add(four);
		
		five = new JButton();
		five.setCursor(cursor);
		five.setForeground(blackcolor);
		five.setBackground(whitecolor);
		five.setFont(font3);
		five.setFocusPainted(false);
		five.setHorizontalAlignment(JButton.CENTER);
		five.setVerticalAlignment(JButton.CENTER);
		five.setBorder(border2);
		panel.add(five);
		
		six = new JButton();
		six.setCursor(cursor);
		six.setForeground(blackcolor);
		six.setBackground(whitecolor);
		six.setFont(font3);
		six.setFocusPainted(false);
		six.setHorizontalAlignment(JButton.CENTER);
		six.setVerticalAlignment(JButton.CENTER);
		six.setBorder(border2);
		panel.add(six);
		
		seven = new JButton();
		seven.setCursor(cursor);
		seven.setForeground(blackcolor);
		seven.setBackground(whitecolor);
		seven.setFont(font3);
		seven.setFocusPainted(false);
		seven.setHorizontalAlignment(JButton.CENTER);
		seven.setVerticalAlignment(JButton.CENTER);
		seven.setBorder(border2);
		panel.add(seven);
		
		eight = new JButton();
		eight.setCursor(cursor);
		eight.setForeground(blackcolor);
		eight.setBackground(whitecolor);
		eight.setFont(font3);
		eight.setFocusPainted(false);
		eight.setHorizontalAlignment(JButton.CENTER);
		eight.setVerticalAlignment(JButton.CENTER);
		eight.setBorder(border2);
		panel.add(eight);
		
		nine = new JButton();
		nine.setCursor(cursor);
		nine.setForeground(blackcolor);
		nine.setBackground(whitecolor);
		nine.setFont(font3);
		nine.setFocusPainted(false);
		nine.setHorizontalAlignment(JButton.CENTER);
		nine.setVerticalAlignment(JButton.CENTER);
		nine.setBorder(border2);
		panel.add(nine);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(color1);
		panel1.setBounds(604, 0, 700, 604);
		panel1.setLayout(null);
		c.add(panel1);
		
		introLabel = new JLabel("TIC TAC TOE GAME BY IMTIAZ ADAR");
		//introLabel.setBackground(whitecolor);
		introLabel.setForeground(whitecolor);
		introLabel.setFont(font6);
		introLabel.setBounds(137, 80, 380, 15);
		panel1.add(introLabel);
		
		playerLabel = new JLabel("X'S TURN");
		//playerLabel.setBackground(whitecolor);
		playerLabel.setForeground(whitecolor);
		playerLabel.setFont(font5);
		playerLabel.setBounds(198, 170, 350, 140);
		panel1.add(playerLabel);
		
		newGame = new JButton("NEW GAME");
		newGame.setBounds(134, 380, 320, 70);
		newGame.setCursor(cursor);
		newGame.setFocusPainted(false);
		newGame.setHorizontalAlignment(JButton.CENTER);
		newGame.setForeground(whitecolor);
		newGame.setBackground(color2);
		newGame.setFont(font1);
		newGame.setFocusPainted(false);
		newGame.setBorder(border3);
		panel1.add(newGame);
		
		exit = new JButton("EXIT");
		exit.setBounds(134, 451, 320, 70);
		exit.setCursor(cursor);
		exit.setFocusPainted(false);
		exit.setHorizontalAlignment(JButton.CENTER);
		exit.setForeground(whitecolor);
		exit.setBackground(color6);
		exit.setFont(font1);
		exit.setFocusPainted(false);
		exit.setBorder(border5);
		panel1.add(exit);
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		newGame.addActionListener(this);
		exit.addActionListener(this);
		newGame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				newGame.setBackground(whitecolor);
				newGame.setForeground(color2);
				newGame.setBorder(border4);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				newGame.setBackground(color2);
				newGame.setForeground(whitecolor);
				newGame.setBorder(border3);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				newGame.setBackground(whitecolor);
				newGame.setForeground(color2);
				newGame.setBorder(border4);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				newGame.setBackground(whitecolor);
				newGame.setForeground(color2);
				newGame.setBorder(border4);
			}
		});
		exit.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				exit.setBackground(whitecolor);
				exit.setForeground(color6);
				exit.setBorder(border4);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				exit.setBackground(color6);
				exit.setForeground(whitecolor);
				exit.setBorder(border5);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				exit.setBackground(whitecolor);
				exit.setForeground(color6);
				exit.setBorder(border4);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				exit.setBackground(whitecolor);
				exit.setForeground(color6);
				exit.setBorder(border4);
			}
		});
	}
	
	public String changePlayer() {
		if(move.equals("X"))
			move = "O";
		else move = "X";
		return move;
	}
	
	public void resetBoard() {
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		one.setBackground(whitecolor);
		two.setBackground(whitecolor);
		three.setBackground(whitecolor);
		four.setBackground(whitecolor);
		five.setBackground(whitecolor);
		six.setBackground(whitecolor);
		seven.setBackground(whitecolor);
		eight.setBackground(whitecolor);
		nine.setBackground(whitecolor);
		one.setText("");
		two.setText("");
		three.setText("");
		four.setText("");
		five.setText("");
		six.setText("");
		seven.setText("");
		eight.setText("");
		nine.setText("");
		count = 0;
		gameOver = false;
		ok = false;
		win = "";
		move = "O";
		playerLabel.setBounds(198, 170, 350, 140);
		playerLabel.setFont(font5);
		playerLabel.setText("X'S TURN");
	}
	
	public void placeWin() {
		if(win == "X") {
			playerLabel.setBounds(125, 170, 350, 140);
			playerLabel.setText("PLAYER " + move + " WON !!");
		}
		else if(win == "O") {
			playerLabel.setBounds(115, 170, 380, 140);
			playerLabel.setText("PLAYER " + move + " WON !!");
		}
		else if(win == "DRAW") {
			playerLabel.setBounds(85, 170, 430, 140);
			playerLabel.setFont(font4);
			playerLabel.setText("MATCH HAS DRAWN !!");
		}
	}
	
	public void checkWinner() {
		if(one.getText() == "X" && two.getText() == "X" && three.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			one.setBackground(color3);
			two.setBackground(color3);
			three.setBackground(color3);
			
			four.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		else if(one.getText() == "O" && two.getText() == "O" && three.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			one.setBackground(color3);
			two.setBackground(color3);
			three.setBackground(color3);
			
			four.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		
		if(four.getText() == "X" && five.getText() == "X" && six.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			four.setBackground(color3);
			five.setBackground(color3);
			six.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		else if(four.getText() == "O" && five.getText() == "O" && six.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			four.setBackground(color3);
			five.setBackground(color3);
			six.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		
		if(seven.getText() == "X" && eight.getText() == "X" && nine.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			seven.setBackground(color3);
			eight.setBackground(color3);
			nine.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			four.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			placeWin();
		}
		else if(seven.getText() == "O" && eight.getText() == "O" && nine.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			seven.setBackground(color3);
			eight.setBackground(color3);
			nine.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			four.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			placeWin();
		}
		if(one.getText() == "X" && five.getText() == "X" && nine.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			one.setBackground(color3);
			five.setBackground(color3);
			nine.setBackground(color3);
			
			four.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			eight.setBackground(color4);
			
			four.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			eight.setEnabled(false);
			placeWin();
		}
		else if(one.getText() == "O" && five.getText() == "O" && nine.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			one.setBackground(color3);
			five.setBackground(color3);
			nine.setBackground(color3);
			
			four.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			two.setBackground(color4);
			three.setBackground(color4);
			eight.setBackground(color4);
			
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			placeWin();
		}
		if(three.getText() == "X" && five.getText() == "X" && seven.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			three.setBackground(color3);
			five.setBackground(color3);
			seven.setBackground(color3);
			
			four.setBackground(color4);
			one.setBackground(color4);
			six.setBackground(color4);
			two.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			four.setEnabled(false);
			one.setEnabled(false);
			six.setEnabled(false);
			two.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		else if(three.getText() == "O" && five.getText() == "O" && seven.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			three.setBackground(color3);
			five.setBackground(color3);
			seven.setBackground(color3);
			
			four.setBackground(color4);
			one.setBackground(color4);
			six.setBackground(color4);
			two.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			six.setEnabled(false);
			four.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		
		if(one.getText() == "X" && four.getText() == "X" && seven.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			one.setBackground(color3);
			four.setBackground(color3);
			seven.setBackground(color3);
			
			two.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			three.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			two.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			three.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		else if(one.getText() == "O" && four.getText() == "O" && seven.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			one.setBackground(color3);
			four.setBackground(color3);
			seven.setBackground(color3);
			
			two.setBackground(color4);
			five.setBackground(color4);
			six.setBackground(color4);
			three.setBackground(color4);
			eight.setBackground(color4);
			nine.setBackground(color4);
			
			two.setEnabled(false);
			three.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		
		if(two.getText() == "X" && five.getText() == "X" && eight.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			five.setBackground(color3);
			two.setBackground(color3);
			eight.setBackground(color3);
			
			four.setBackground(color4);
			one.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			three.setBackground(color4);
			nine.setBackground(color4);
			
			four.setEnabled(false);
			one.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			three.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		else if(two.getText() == "O" && five.getText() == "O" && eight.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			two.setBackground(color3);
			five.setBackground(color3);
			eight.setBackground(color3);
			
			four.setBackground(color4);
			one.setBackground(color4);
			six.setBackground(color4);
			seven.setBackground(color4);
			three.setBackground(color4);
			nine.setBackground(color4);
			
			one.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
		if(three.getText() == "X" && six.getText() == "X" && nine.getText() == "X") {
			gameOver = true;
			ok = true;
			win = "X";
			six.setBackground(color3);
			nine.setBackground(color3);
			three.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			four.setBackground(color4);
			five.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			placeWin();
		}
		else if(three.getText() == "O" && six.getText() == "O" && nine.getText() == "O") {
			gameOver = true;
			ok = true;
			win = "O";
			three.setBackground(color3);
			six.setBackground(color3);
			nine.setBackground(color3);
			
			one.setBackground(color4);
			two.setBackground(color4);
			four.setBackground(color4);
			five.setBackground(color4);
			seven.setBackground(color4);
			eight.setBackground(color4);
			
			one.setEnabled(false);
			two.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			placeWin();
		}	
		
		else if(count >= 8 && !ok && !gameOver) {
			gameOver = true;
			ok = true;
			win = "DRAW";
			one.setBackground(color5);
			two.setBackground(color5);
			three.setBackground(color5);
			four.setBackground(color5);
			five.setBackground(color5);
			six.setBackground(color5);
			seven.setBackground(color5);
			eight.setBackground(color5);
			nine.setBackground(color5);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			placeWin();
		}
	}
	public static void main(String[] args) {
		Tic_Tac_Toe frame = new Tic_Tac_Toe();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(162, 115, 1204, 638);
		frame.setTitle("TIC TAC TOE GAME BY IMTIAZ ADAR");
		frame.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == newGame) {
			try {
				Thread.sleep(300);
				resetBoard();
			}
			catch(InterruptedException adar) {
				adar.printStackTrace();
			}
		}
		
		if(e.getSource() == exit) {
			System.exit(0);
		}
		
		if(e.getSource() == one) {
			if(one.getText() == "") {
				one.setBackground(color4);
				one.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == two) {
			if(two.getText() == "") {
				two.setBackground(color4);
				two.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == three) {
			if(three.getText() == "") {
				three.setBackground(color4);
				three.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == four) {
			if(four.getText() == "") {
				four.setBackground(color4);
				four.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == five) {
			if(five.getText() == "") {
				five.setBackground(color4);
				five.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == six) {
			if(six.getText() == "") {
				six.setBackground(color4);
				six.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == seven) {
			if(seven.getText() == "") {
				seven.setBackground(color4);
				seven.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == eight) {
			if(eight.getText() == "") {
				eight.setBackground(color4);
				eight.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
		
		if(e.getSource() == nine) {
			if(nine.getText() == "") {
				nine.setBackground(color4);
				nine.setText(changePlayer());
				if(move == "X") {
					playerLabel.setText("O" + "'S TURN");
				}
				else {
					playerLabel.setText("X" + "'S TURN");
				}
				checkWinner();
				count++;
			}
		}
	}
}

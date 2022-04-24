package pacman;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Pacman extends JFrame{
	
	public Pacman()
	{
		initUI();
	}

	private void initUI() {
		// TODO Auto-generated method stub
		add(new Board());
		
		setTitle("Pacman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380, 420);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(()->{
			Pacman ex = new Pacman();
			ex.setVisible(true);
		});
	}

}

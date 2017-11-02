package Coches;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class gauge extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gauge frame = new gauge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gauge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		
		JProgressBar progressBar = new JProgressBar();
		contentPane.add(progressBar, BorderLayout.CENTER);
		progressBar.setValue(0);
		Avanzador avanzador=new Avanzador(progressBar);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnAselera = new JButton("Aselera");
		btnAselera.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				avanzador.acelera(true);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				avanzador.acelera(false);
			}
		});
		panel.add(btnAselera);
		
		JButton btnFresna = new JButton("fresna");
		btnFresna.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				avanzador.frena(true);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				avanzador.frena(false);
			}
		});
		panel.add(btnFresna);
		avanzador.start();
	}

}

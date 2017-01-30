package apaweh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class apaweh {

	private JFrame frame;
	private JTextField nama;
	private JTextField nilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apaweh window = new apaweh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public apaweh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNama = new JLabel("Nama:");
		lblNama.setBounds(39, 90, 46, 14);
		frame.getContentPane().add(lblNama);
		
		nama = new JTextField();
		nama.setBounds(37, 113, 86, 20);
		frame.getContentPane().add(nama);
		nama.setColumns(10);
		
		JLabel lblNilai = new JLabel("Nilai");
		lblNilai.setBounds(39, 152, 46, 14);
		frame.getContentPane().add(lblNilai);
		
		nilai = new JTextField();
		nilai.setBounds(39, 177, 86, 20);
		frame.getContentPane().add(nilai);
		nilai.setColumns(10);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namaku = nama.getText();
				String nilaiku = nilai.getText();
				String grade,keterangan;
				int nilaikuda = Integer.parseInt(nilaiku);
				
				if(nilaikuda>=90){
					grade="a";
					keterangan="pulang";
				}else if(nilaikuda>=80){
					grade="b";
					keterangan="pulag";
				}else if(nilaikuda>=70){
					grade="c";
					keterangan="pulang";
				}else if(nilaikuda>=60){
					grade="d";
					keterangan="pulang";
				}else{
					grade="e";
					keterangan="nginep";
				}
				JOptionPane.showMessageDialog(null,namaku+" "+grade+" "+keterangan);
			}
		});
		btnOk.setBounds(34, 212, 89, 23);
		frame.getContentPane().add(btnOk);
	}
}

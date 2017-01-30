package hitung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hitung extends JFrame {

	private JPanel contentPane;
	private JTextField angka1;
	private JLabel lblAngka_1;
	private JTextField angka2;
	private JRadioButton rdbtnTambah;
	private JRadioButton rdbtnBagi;
	private JRadioButton rdbtnKurang;
	private JRadioButton rdbtnKali;
	private JButton submit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hitung frame = new hitung();
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
	public hitung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka");
		lblAngka.setBounds(33, 70, 46, 14);
		contentPane.add(lblAngka);
		
		angka1 = new JTextField();
		angka1.setBounds(79, 67, 86, 20);
		contentPane.add(angka1);
		angka1.setColumns(10);
		
		lblAngka_1 = new JLabel("angka");
		lblAngka_1.setBounds(33, 117, 46, 14);
		contentPane.add(lblAngka_1);
		
		angka2 = new JTextField();
		angka2.setBounds(79, 114, 86, 20);
		contentPane.add(angka2);
		angka2.setColumns(10);
		
		rdbtnTambah = new JRadioButton("Tambah");
		rdbtnTambah.setBounds(6, 188, 109, 23);
		contentPane.add(rdbtnTambah);
		
		rdbtnBagi = new JRadioButton("Bagi");
		rdbtnBagi.setBounds(120, 188, 109, 23);
		contentPane.add(rdbtnBagi);
		
		rdbtnKurang = new JRadioButton("Kurang");
		rdbtnKurang.setBounds(6, 231, 109, 23);
		contentPane.add(rdbtnKurang);
		
		rdbtnKali = new JRadioButton("Kali");
		rdbtnKali.setBounds(120, 231, 109, 23);
		contentPane.add(rdbtnKali);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String angka11 = angka1.getText();
				String angka22 = angka2.getName();
				
				int angka111 = Integer.parseInt(angka11);
				int angka222 = Integer.parseInt(angka22);
				int nilai;
				String keterangan;
				
				if(rdbtnTambah.isSelected()){
					nilai = angka111 + angka222 ;
					keterangan="tambah";
				}else if(rdbtnKurang.isSelected()){
					nilai = angka111 - angka222 ;
					keterangan="kurang";
				}else if(rdbtnKali.isSelected()){
					nilai = angka111 * angka222 ;
					keterangan="kali";
				}else{
					nilai = angka111 / angka222;
					keterangan="bagi";
				}
				JOptionPane.showMessageDialog(null,angka11+" "+keterangan+" "+nilai);
			}
		});
		submit.setBounds(269, 208, 89, 23);
		contentPane.add(submit);
		
		
	}
}

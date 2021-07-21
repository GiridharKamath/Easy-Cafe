package project1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
public class code extends JFrame {
private JPanel contentPane;
private static final String url = "jdbc:mysql://localhost:3306/hello";
private static final String user = "root";
private static final String password = "giridhar";
private static Connection con=null;
private static Statement stmt;
private static ResultSet rs;
public static void main(String[] args) throws SQLException{
	
         EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					code frame = new code();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
 }
	public code() throws SQLException {
		setTitle("TABLE-1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1290, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JSpinner w1 = new JSpinner();
		w1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w1.setBounds(931, 185, 35, 27);
		contentPane.add(w1);
		
		JSpinner w2 = new JSpinner();
		w2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w2.setBounds(931, 215, 35, 27);
		contentPane.add(w2);
		
		JSpinner w3 = new JSpinner();
		w3.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w3.setBounds(931, 245, 35, 27);
		contentPane.add(w3);
		
		JSpinner w4 = new JSpinner();
		w4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w4.setBounds(931, 275, 35, 27);
		contentPane.add(w4);
		
		JSpinner w5 = new JSpinner();
		w5.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w5.setBounds(931, 305, 35, 27);
		contentPane.add(w5);
		
		JSpinner w6 = new JSpinner();
		w6.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w6.setBounds(931, 335, 35, 27);
		contentPane.add(w6);
		
		JSpinner w7 = new JSpinner();
		w7.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w7.setBounds(931, 365, 35, 27);
		contentPane.add(w7);
		
		JSpinner w8 = new JSpinner();
		w8.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w8.setBounds(931, 395, 35, 27);
		contentPane.add(w8);
		
		JSpinner w9 = new JSpinner();
		w9.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		w9.setBounds(931, 425, 35, 27);
		contentPane.add(w9);
		
		JButton btnNewButton_4 = new JButton("ORDER");
		btnNewButton_4.setBackground(new Color(255, 228, 196));
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				int n1=152,n2=133,n3=167,n4=200,n5=214,n6=167,n7=140,n8=148,n9=30;
				
				int n10=(int)w1.getValue();
				int n11=(int)w2.getValue();
				int n12=(int)w3.getValue();
				int n13=(int)w4.getValue();
				int n14=(int)w5.getValue();
				int n15=(int)w6.getValue();
				int n16=(int)w7.getValue();
				int n17=(int)w8.getValue();
				int n18=(int)w9.getValue();
				
				int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,s8=0,s9=0;
				s1=n10*n1;
				s2=n11*n2;
				s3=n12*n3;
				s4=n13*n4;
				s5=n14*n5;
				s6=n15*n6;
				s7=n16*n7;
				s8=n17*n8;
				s9=n18*n9;
				int sum=0;
				sum=s1+s2+s3+s4+s5+s6+s7+s8+s9;
				
				int result = JOptionPane.showConfirmDialog(null,"Press YES to confirm\nor NO to ReOrder",
						"Order Confirmation",JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null,"!BILL!\n\nTotal Amount : "
							+ ""+sum+"\nEnjoy Our Cafe\n\nThank You...\nVisit Again...");
					
					Object oo,oo1,oo2,oo3,oo4,oo5,oo6,oo7,oo8,oo9;
					oo=w1.getValue();
					oo1=w2.getValue();
					oo2=w3.getValue();
					oo3=w4.getValue();
					oo4=w5.getValue();
					oo5=w6.getValue();
					oo6=w7.getValue();
					oo7=w8.getValue();
					oo8=w9.getValue();
					oo9=sum;
					try {
				         // opening database connection to MySQL server
				         con = DriverManager.getConnection(url, user, password);
				          
				         // getting Statement object to execute query
				         stmt = con.createStatement();
				         // executing SELECT query
				        
				         String query1 = " insert into table1(Cafe_Frappe,Tropical_Iceberg,Toffee_Frappe,Dark_Frappe,Devils_Own,Rasmalai_Smoothie,Alphonso_Mango_Shake,Hot_Gourmet_Cocoa,Soft_Drinks,BILL_AMOUNT)"
				                 + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				               PreparedStatement preparedStmt = con.prepareStatement(query1);
				               preparedStmt.setInt(1,(int)oo);
				               preparedStmt.setInt(2,(int)oo1);
				               preparedStmt.setInt(3,(int)oo2);
				               preparedStmt.setInt(4,(int)oo3);
				               preparedStmt.setInt(5,(int)oo4);
				               preparedStmt.setInt(6,(int)oo5);
				               preparedStmt.setInt(7,(int)oo6);
				               preparedStmt.setInt(8,(int)oo7);
				               preparedStmt.setInt(9,(int)oo8);
				               preparedStmt.setInt(10,(int)oo9);
				               preparedStmt.execute();
				               rs = stmt.executeQuery(query1);
				               con.close();
				             }
				     catch (Exception e2)
				             {
				               //System.err.println("Got an exception!");
				               //System.err.println(e.getMessage());
				             }
					
					w1.setValue(0);
					w2.setValue(0);
					w3.setValue(0);
					w4.setValue(0);
					w5.setValue(0);
					w6.setValue(0);
					w7.setValue(0);
					w8.setValue(0);
					
		        }
				else {
					w1.setValue(0);
					w2.setValue(0);
					w3.setValue(0);
					w4.setValue(0);
					w5.setValue(0);
					w6.setValue(0);
					w7.setValue(0);
					w8.setValue(0);
				}
			}
		});
		
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton_4.setForeground(new Color(139, 0, 0));
		btnNewButton_4.setBounds(900, 462, 100, 39);
		contentPane.add(btnNewButton_4);
		
		JLabel a1 = new JLabel("..152");
		a1.setForeground(Color.WHITE);
		a1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a1.setBounds(812, 185, 49, 30);
		contentPane.add(a1);
		
		JLabel a2 = new JLabel("..133");
		a2.setForeground(Color.WHITE);
		a2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a2.setBounds(812, 215, 49, 30);
		contentPane.add(a2);
		
		JLabel a3 = new JLabel("..167");
		a3.setForeground(Color.WHITE);
		a3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a3.setBounds(812, 245, 49, 30);
		contentPane.add(a3);
		
		JLabel a4 = new JLabel("..200");
		a4.setForeground(Color.WHITE);
		a4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a4.setBounds(812, 275, 49, 30);
		contentPane.add(a4);
		
		JLabel a5 = new JLabel("..214");
		a5.setForeground(Color.WHITE);
		a5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a5.setBounds(812, 305, 49, 30);
		contentPane.add(a5);
		
		JLabel a6 = new JLabel("..167");
		a6.setForeground(Color.WHITE);
		a6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a6.setBounds(812, 335, 49, 30);
		contentPane.add(a6);
		
		JLabel a7 = new JLabel("..140");
		a7.setForeground(Color.WHITE);
		a7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a7.setBounds(812, 365, 49, 30);
		contentPane.add(a7);
		
		JLabel a8 = new JLabel("..148");
		a8.setForeground(Color.WHITE);
		a8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a8.setBounds(812, 395, 49, 30);
		contentPane.add(a8);
		
		JLabel a9 = new JLabel("..30");
		a9.setForeground(Color.WHITE);
		a9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		a9.setBounds(812, 425, 49, 30);
		contentPane.add(a9);
		
		JLabel lblNewLabel_1 = new JLabel("Cafe Frappe");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1.setBounds(311, 185, 200, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tropical Iceberg");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_2.setBounds(311, 215, 200,30 );
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Toffee Frappe");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_3.setBounds(311, 245, 200, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dark Frappe");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_4.setBounds(311, 275, 200, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Devils Own");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_5.setBounds(311, 305, 200, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rasmalai Smoothie");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_6.setBounds(311, 335, 210, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Alphonso Mango Shake");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_7.setBounds(311, 365, 230, 30);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Hot Gourmet Cocoa");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_8.setBounds(311, 395, 200, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Soft Drinks");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_9.setBounds(311, 425, 200, 30);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("NEW ORDER");
		btnNewButton_1.setBackground(new Color(255, 228, 196));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w1.setValue(0);
				w2.setValue(0);
				w3.setValue(0);
				w4.setValue(0);
				w5.setValue(0);
				w6.setValue(0);
				w7.setValue(0);
				w8.setValue(0);
			}
		});
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton_1.setForeground(Color.red);
		btnNewButton_1.setBounds(873, 512, 159, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("MENU..");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_10.setBounds(311, 135, 169, 39);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBackground(Color.PINK);
		lblNewLabel_11.setBounds(431, 129, 49, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel = new JLabel("' Welcome To Our Cafe '");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(522, 22, 261, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_12 = new JLabel("COFFEE DAY");
		lblNewLabel_12.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
		lblNewLabel_12.setBounds(454, 53, 396, 65);
		contentPane.add(lblNewLabel_12);
		JLabel lblNewLabel_14 = new JLabel("Price");
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_14.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_14.setBounds(823, 142, 61, 39);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Count");
		lblNewLabel_15.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setBounds(927, 154, 61, 14);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton_2 = new JButton("MORE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String myurl = "http://127.0.0.1:5501/index.html";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
				catch(Exception e4){
					e4.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(255, 228, 196));
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton_2.setForeground(new Color(139, 0, 0));		
		btnNewButton_2.setBounds(1148, 68, 87, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("INFO");
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String myurl = "http://127.0.0.1:5500/coffee.html";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				}
				catch(Exception e4){
					e4.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(139, 0, 0));		
		btnNewButton.setBounds(1148, 28, 87, 30);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBackground(new Color(240, 240, 240));
		Image img= new ImageIcon(this.getClass().getResource("/cup6.jpg")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(img));
		lblNewLabel_13.setBounds(0, 0, 1295, 690);
		contentPane.add(lblNewLabel_13);
		
		
		
		Thread r=new Thread(new Runnable() {
			public void run() {
				try {
					while(true) {
						lblNewLabel_12.setForeground(Color.RED);
						Thread.sleep(500);
						lblNewLabel_12.setForeground(Color.WHITE);
						Thread.sleep(500);
              }
				}
				catch(Exception e) {}
			}
		});
		r.start();
		}
}

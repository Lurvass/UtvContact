package Views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListView extends JFrame{
	
//	public static void main(String[] args) {
//		new ListView(new String[][] { 
//			{ "Roman", "070845845", "this@is.cool" }, 
//			{ "Shervin", "070648465", "school@is.cool" },
//				{ "Simon", "070989654", "bts@is.cool" } });
//	}
	JTable jt;
	String column[] = { "Name", "Phone", "Email" };
	public ListView(String data[][]) {

		setTable(data);
		setTitle("Contact book");
		setBounds(350, 200, 600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//delete this line later
		setVisible(true);
	}
	
	public void setTable(String data[][]) {
		jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		this.add(sp);
	}
}

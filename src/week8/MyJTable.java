package week8;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyJTable {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JTable3 frame = new JTable3();
				frame.setVisible(true);
			}
		});
	}
	
	public MyJTable() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 242);
		setTitle("Fruit table");
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 41, 494, 90);
		getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addColumn("No");
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Price");

		
		for(int i=0;i<fruit.length; i++)
		{
			model.addRow(new Object[0]);
			model.setValueAt(i+1, i, 0);
			model.setValueAt(fruit[i].id, i, 1);
			model.setValueAt(fruit[i].name, i, 2);
			model.setValueAt(fruit[i].price, i, 3);
		}
		
	}

}

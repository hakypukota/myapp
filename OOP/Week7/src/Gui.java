import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Gui extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GridBagConstraints constraints;
	private Carpark carpark;
	private Car car;
	
	private JLabel lblRegNo;
	private JLabel lblOwner;
	private JLabel lblModel;
	private JLabel lblStatus;
	
	private JTextField txt_RegNo;
	private JTextField txt_Owner;
	private JTextField txt_Model;
	
	private JButton btnAdd;
	private JButton btnRem;
	
	public Gui() {
		car = new Car();
		carpark = new Carpark();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		
		initComponents();
		
		layoutComponents();
		
	}
	public void initComponents() {
		lblRegNo = new JLabel("Reg.No:");
		lblOwner = new JLabel("Owner's name:");
		lblModel = new JLabel ("Model:");
		lblStatus = new JLabel("Welcome");
		
		txt_RegNo = new JTextField();
		txt_Owner = new JTextField();
		txt_Model = new JTextField();
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(this);
		btnRem = new JButton("Remove");
		
	}
	public void layoutComponents() {
		constraints.gridy=0;
		constraints.gridx=0;
				
		this.add(lblRegNo, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridy=0;
		constraints.gridx=1;
		
		this.add(txt_RegNo, constraints);
		
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridy=1;
		constraints.gridx=0;
		
		this.add(lblOwner,constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridy=1;
		constraints.gridx=1;
		
		this.add(txt_Owner,constraints);
		
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridy=2;
		constraints.gridx=0;
		
		this.add(lblModel,constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridy=2;
		constraints.gridx=1;
		
		this.add(txt_Model,constraints);
		
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridy=3;
		constraints.gridx=0;
		constraints.gridwidth=2;
		
		this.add(lblStatus,constraints);
		
		constraints.gridwidth=1;
		constraints.gridy=4;
		constraints.gridx=0;
		
		this.add(btnAdd,constraints);
		
		constraints.gridy=4;
		constraints.gridx=1;
		
		this.add(btnRem,constraints);
	}
	public void actionPerformed(ActionEvent ev) {
		
		if (ev.getSource().equals(btnAdd)){

			int RegNo = Integer.parseInt(txt_RegNo.getText());
			String Owner = txt_Owner.getText();
			String Model = txt_Model.getText();
			car.setModel(Model);
			car.setNumber(RegNo);
			car.setOwnersName(Owner);
			if(carpark.addCar(car)){
				JOptionPane.showMessageDialog(null, "Car has been added");
				txt_Owner.setText("");
				txt_RegNo.setText("");
				txt_Model.setText("");
				String numSpaces = "Carpark has "+ carpark.showInfo() +" empty spaces";
				lblStatus.setText(numSpaces);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "The carpark is full or invalid number");
			}
		}
		else if(ev.getSource().equals(btnRem)){
			
		}
	}
	public static void main(String[] args)
	{
		Gui gui = new Gui();
		gui.pack();
		gui.setVisible(true);
	}
	
}

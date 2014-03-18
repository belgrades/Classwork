package drugiee;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JComboBox;

public class JCoolerComboBox extends JComboBox{

	
	public JCoolerComboBox(Vector<String> options){
		
		for(int i=0; i < options.size(); i++)
			this.addItem("" + options.get(i) + "");
		
		//this.setSize(new Dimension(10,20));
		
	}
}

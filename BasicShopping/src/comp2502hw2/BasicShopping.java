

package comp2502hw2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
 
public class BasicShopping extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
 
    private JRadioButton tshirt;
    private JRadioButton jeans;
    private JRadioButton jacket;
    private JRadioButton sweatshirt;
    private JRadioButton shoes;
    private JButton button;
    private JButton button2;
    private ButtonGroup buttonGroup;
 
    public BasicShopping() {
        
        this.getContentPane().setLayout(new FlowLayout());
 
        tshirt = new JRadioButton("T-shirt");
        tshirt.setActionCommand("T-shirt");
 
        jeans = new JRadioButton("Jeans");
        jeans.setActionCommand("Jeans");
 
        jacket = new JRadioButton("Jacket");
        jacket.setActionCommand("Jacket");
        
        sweatshirt = new JRadioButton("Sweatshirt");
        sweatshirt.setActionCommand("Sweatshirt");
        
        shoes = new JRadioButton("Shoes");
        shoes.setActionCommand("Shoes");
 
        tshirt.setSelected(true);
 
        button = new JButton("Add To List");
        button2 = new JButton("Order");
 
        button.addActionListener(this);
        button2.addActionListener(this);
       
        buttonGroup = new ButtonGroup();
 
        buttonGroup.add(tshirt);
        buttonGroup.add(jeans);
        buttonGroup.add(jacket);
         buttonGroup.add(sweatshirt);
          buttonGroup.add(shoes);
 
        add(tshirt);
        add(jeans);
        add(jacket);
        add(sweatshirt);
        add(shoes);
        add(button);
         add(button2);
         
       }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add To List")) {
            System.out.println("Selected Product : " + buttonGroup.getSelection().getActionCommand());
             JOptionPane.showMessageDialog(BasicShopping.this, "Selected Product Added On List : " + buttonGroup.getSelection().getActionCommand()+ ".");
        }else if (e.getActionCommand().equals("Order")) {
            System.out.println("The products you marked have been ordered " );
            JOptionPane.showMessageDialog(BasicShopping.this, "You Ordered The Selected Product : " + buttonGroup.getSelection().getActionCommand()+ ".");
            
        }
       
    }
  
    private static void createAndShowGUI() {

  JFrame frame = new BasicShopping();

  frame.pack();
 
  frame.setVisible(true);
 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    public static void main(String[] args) {
 
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
 
    createAndShowGUI(); 
}
 
  });
    }
 
}
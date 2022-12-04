import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class flowlayout {
    public static void main(String args[]){
        //Layout Manager= Define the natural layout for component within a container
        // FlowLayout= places components in a row , sized at their prefferred size.
        //             If the horizontal space in the container is too small ,
        //             the FlowLayout class rses the next available row.
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);


        frame.setVisible(true);// last ko rakha coz apne ko vibility button ki bhi chahiye na and pehle rakhte to button nahi dikhta thus we did this remember!




    }
}

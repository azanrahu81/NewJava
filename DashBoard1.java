import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DashBoard1 extends JFrame implements MouseListener, ActionListener {
    JFrame win;
    JPanel p1, p2;
    JLabel l1, l2, l3, l4;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    Color color;
    Font font;

    ImageIcon icon, icon1, icon2, icon3, icon4, icon5;
    Image imageone, scaledImage, imageone1, scaledImage1, imageone2, scaledImage2, imageone3, scaledImage3, imageone4, scaledImage4;

    public DashBoard1() {
        win = new JFrame();
        win.setLayout(null);

        color = new Color(32, 178, 160);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1600, 170);
        p1.setBackground(color);
        p1.setLayout(null);
        p1.setOpaque(true);
        win.add(p1);

        p2 = new JPanel();
        color = new Color(0, 128, 128);
        p2.setBounds(0, 170, 1600, 40);
        p2.setBackground(color);
        p2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        p2.setOpaque(true);
        p2.setLayout(null);
        win.add(p2);

        l1 = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
        l1.setBounds(70, 5, 1400, 50);
        l1.setFont(new Font("", Font.BOLD, 45));
        l1.setForeground(Color.white);
        p1.add(l1);

        l2 = new JLabel("Providing Quality Healthcare Services");
        l2.setBounds(170, 70, 1200, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 35));
        l2.setForeground(Color.white);
        p1.add(l2);

        l3 = new JLabel("Contact: +92340345688 | Email: hospital@example.com");
        l3.setBounds(290, 130, 800, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 30));
        l3.setForeground(Color.white);
        p1.add(l3);

        l4 = new JLabel("DASHBOARD");
        l4.setBounds(480, 10, 500, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 40));
        l4.setForeground(Color.white);
        p2.add(l4);

        p2 = new JPanel();
        p2.setBounds(0, 210, 1550, 800);
        color = new Color(32, 178, 160);
        p2.setBackground(color);
        p2.setLayout(null);
        win.add(p2);

        b1 = new JButton("ADD DOCTOR");
        b1.setBounds(200, 260, 290, 160);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        b1.setBorder(BorderFactory.createRaisedBevelBorder());
        b1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b1.setForeground(Color.black);
        b1.setFocusable(false);
        b1.setOpaque(true);
        p2.add(b1);

        icon = new ImageIcon("path_to_doctor_icon");
        imageone = icon.getImage();
        scaledImage = imageone.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        b1.setIcon(icon);

        b2 = new JButton("MANAGE PATIENTS");
        b2.setBounds(500, 260, 290, 160);
        b2.setFont(new Font("Arial", Font.BOLD, 20));
        b2.setBorder(BorderFactory.createRaisedBevelBorder());
        b2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b2.setFocusable(false);
        b2.setForeground(Color.black);
        b2.setOpaque(true);
        p2.add(b2);

        icon1 = new ImageIcon("path_to_patient_icon");
        imageone1 = icon1.getImage();
        scaledImage1 = imageone1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(scaledImage1);
        b2.setIcon(icon1);

        b3 = new JButton("VIEW APPOINTMENTS");
        b3.setBounds(800, 260, 290, 160);
        b3.setFont(new Font("Arial", Font.BOLD, 20));
        b3.setBorder(BorderFactory.createRaisedBevelBorder());
        b3.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b3.setForeground(Color.black);
        b3.setFocusable(false);
        b3.setOpaque(true);
        p2.add(b3);

        icon2 = new ImageIcon("path_to_appointment_icon");
        imageone2 = icon2.getImage();
        scaledImage2 = imageone2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(scaledImage2);
        b3.setIcon(icon2);

        b4 = new JButton("VIEW REPORTS");
        b4.setBounds(200, 440, 290, 160);
        b4.setFont(new Font("Arial", Font.BOLD, 20));
        b4.setBorder(BorderFactory.createRaisedBevelBorder());
        b4.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b4.setForeground(Color.black);
        b4.setFocusable(false);
        b4.setOpaque(true);
        p2.add(b4);

        icon3 = new ImageIcon("path_to_report_icon");
        imageone3 = icon3.getImage();
        scaledImage3 = imageone3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(scaledImage3);
        b4.setIcon(icon3);

        b5 = new JButton("BILLING");
        b5.setBounds(500, 440, 290, 160);
        b5.setFont(new Font("Arial", Font.BOLD, 20));
        b5.setBorder(BorderFactory.createRaisedBevelBorder());
        b5.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b5.setForeground(Color.black);
        b5.setFocusable(false);
        b5.setOpaque(true);
        p2.add(b5);

        icon4 = new ImageIcon("path_to_billing_icon");
        imageone4 = icon4.getImage();
        scaledImage4 = imageone4.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(scaledImage4);
        b5.setIcon(icon4);

        b6 = new JButton("VIEW ALL RECORDS");
        b6.setBounds(800, 440, 290, 160);
        b6.setFont(new Font("Arial", Font.BOLD, 20));
        b6.setBorder(BorderFactory.createRaisedBevelBorder());
        b6.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b6.setForeground(Color.black);
        b6.setFocusable(false);
        b6.setOpaque(true);
        p2.add(b6);

        icon5 = new ImageIcon("path_to_records_icon");
        imageone4 = icon5.getImage();
        scaledImage4 = imageone4.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(scaledImage4);
        b6.setIcon(icon5);

        b7 = new JButton("LOGOUT");
        b7.setBounds(0, 620, 120, 50);
        b7.setFont(new Font("Arial", Font.BOLD, 25));
        b7.setBorder(BorderFactory.createRaisedBevelBorder());
        b7.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b7.setForeground(Color.black);
        color = new Color(0, 128, 128);
        b7.setBackground(color);
        p2.add(b7);

        b8 = new JButton("ABOUT");
        b8.setBounds(1160, 620, 120, 50);
        b8.setFont(new Font("Arial", Font.BOLD, 25));
        b8.setBorder(BorderFactory.createRaisedBevelBorder());
        b8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        b8.setForeground(Color.black);
        color = new Color(0, 128, 128);
        b8.setBackground(color);
        b8.setOpaque(true);
        p2.add(b8);

        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b5.addMouseListener(this);
        b6.addMouseListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        win.setSize(1600, 800);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
        JButton b = (JButton) e.getSource();
        b.setBackground(new Color(230, 230, 250));
    }

    public void mouseExited(MouseEvent e) {
        JButton b = (JButton) e.getSource();
        b.setBackground(UIManager.getColor("control"));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            JOptionPane.showMessageDialog(null, "Add Doctor Form");
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Manage Patients Form");
        } else if (e.getSource() == b3) {
            JOptionPane.showMessageDialog(null, "View Appointments Form");
        } else if (e.getSource() == b4) {
            JOptionPane.showMessageDialog(null, "View Reports Form");
        } else if (e.getSource() == b5) {
            JOptionPane.showMessageDialog(null, "Billing Form");
        } else if (e.getSource() == b6) {
            JOptionPane.showMessageDialog(null, "View All Records Form");
        }
    }

    public static void main(String[] args) {
        new DashBoard1();
    }
}

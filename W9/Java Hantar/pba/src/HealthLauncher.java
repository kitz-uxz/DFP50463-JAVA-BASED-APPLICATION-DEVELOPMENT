import java.awt.*;
import javax.swing.*;

public class HealthLauncher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Health Suite Launcher");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            JLabel title = new JLabel("Health Suite Launcher", SwingConstants.CENTER);
            title.setFont(new Font("Arial", Font.BOLD, 24));
            frame.add(title, BorderLayout.NORTH);

            JPanel gridJPanel = new JPanel(new GridLayout(2, 2, 20, 20));
            gridJPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            JPanel bmiCard = new JPanel(new BorderLayout());
            JLabel bmiIcon = new JLabel(new ImageIcon("bmi_icon.png"), SwingConstants.CENTER);
            JButton bmiBtn = new JButton("Open App");
            bmiBtn.setBackground(new Color(255, 165, 0));
            bmiCard.add(bmiIcon, BorderLayout.CENTER);
            bmiCard.add(bmiBtn, BorderLayout.SOUTH);
            gridJPanel.add(bmiCard);

            JPanel waterCard = new JPanel(new BorderLayout());
            JLabel waterIcon = new JLabel(new ImageIcon("water_icon.png"), SwingConstants.CENTER);
            JButton waterBtn = new JButton("Open App");
            waterBtn.setBackground(new Color(30, 144, 255));
            waterCard.add(waterIcon, BorderLayout.CENTER);
            waterCard.add(waterBtn, BorderLayout.SOUTH);
            gridJPanel.add(waterCard);

            JPanel sleepCard = new JPanel(new BorderLayout());
            JLabel sleepIcon = new JLabel(new ImageIcon("sleep.png"), SwingConstants.CENTER);
            JButton sleepBtn = new JButton("Open App");
            sleepBtn.setBackground(new Color(147, 112, 219));
            sleepCard.add(sleepIcon, BorderLayout.CENTER);
            sleepCard.add(sleepBtn, BorderLayout.SOUTH);
            gridJPanel.add(sleepCard);

            JPanel dietCard = new JPanel(new BorderLayout());
            JLabel dietIcon = new JLabel(new ImageIcon("balanced-diet.png"), SwingConstants.CENTER);
            JButton dietBtn = new JButton("Open App");
            dietBtn.setBackground(new Color(60, 179, 113));
            dietCard.add(dietIcon, BorderLayout.CENTER);
            dietCard.add(dietBtn, BorderLayout.SOUTH);
            gridJPanel.add(dietCard);

            bmiBtn.addActionListener(e -> new BMIModule().setVisible(true));
            waterBtn.addActionListener(e -> new WaterModule().setVisible(true));
            sleepBtn.addActionListener(e -> new SleepModule().setVisible(true));
            dietBtn.addActionListener(e -> new DietModule().setVisible(true));

            frame.add(gridJPanel, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class word_counter extends JFrame {

    private JTextArea textArea;
    private JButton countButton;

    public word_counter() {
        setTitle("Word Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new BorderLayout());

        // Add a label for instruction
        JLabel instructionLabel = new JLabel("Enter words here:");
        inputPanel.add(instructionLabel, BorderLayout.NORTH);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        inputPanel.add(scrollPane, BorderLayout.CENTER);

        countButton = new JButton("Count Words");
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int wordCount = countWords(text);
                JOptionPane.showMessageDialog(null, "Total words: " + wordCount, "Word Count", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(inputPanel, BorderLayout.CENTER); // Add inputPanel instead of scrollPane
        panel.add(countButton, BorderLayout.SOUTH);

        add(panel);
    }

    private int countWords(String text) {
        String[] words = text.split("\\s+|\\p{Punct}");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                word_counter gui = new word_counter();
                gui.setVisible(true);
            }
        });
    }
}

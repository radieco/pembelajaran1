import javax.swing.*;

public class TableFrom {
    private JTable tableMhs;
    public JPanel panel1;

    String[] columnNames = {"First Nama", "Lest Nama"};


    Object[] [] data = {
            {"rahadi", "2262625"},

            {"sari", "22052025"},

            {"ikan ", "2262625"},

            {"dede", "22052025"}
    };

    private void createUIComponents() {
        tableMhs  = new JTable(data,columnNames);
        // TODO: place custom component creation code here

        JScrollPane scrollPane = new JScrollPane(tableMhs);
        tableMhs.setFillsViewportHeight(true);
    }
}

import javax.swing.JOptionPane;
public class Bai_61 {

    public static void main(String[] args) {
        String[] options = {"YES", "NO"};
        int option = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?",
                "Tiêu đề",
                JOptionPane.DEFAULT_OPTION, // Loại hộp thoại mặc định
                JOptionPane.QUESTION_MESSAGE, // Loại thông báo (có biểu tượng hỏi)
                null, // Icon (null để không có biểu tượng)
                options, // Mảng tùy chọn tùy chỉnh
                options[0] // Tùy chọn mặc định được chọn
        );

        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }

}
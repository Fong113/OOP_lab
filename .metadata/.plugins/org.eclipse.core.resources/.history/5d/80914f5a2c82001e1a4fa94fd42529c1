package hust.soict.vn.lab01;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Bai_226 {
    public static void main(String[] args) {
        String strChoice;
        strChoice = JOptionPane.showInputDialog(null,"Do Van Phong 5111 : \n" +
                "1. The first-degree equation (linear equation) with one variable\n" +
                "2. The system of first-degree equations (linear system) with two variables\n" +
                "3. The second-degree equation with one variable\n" +
                "Choose your option : ","input slect", JOptionPane.INFORMATION_MESSAGE);
        int choice = Integer.parseInt(strChoice);
        switch (choice){
            case 1:
                JOptionPane.showMessageDialog(null,"Nhập hệ số cho phương trình ax + b = 0");
                String strA = JOptionPane.showInputDialog(null,
                        "nhập a : ");
                String strB = JOptionPane.showInputDialog(null,
                        "nhập b : ");
                double a = Double.parseDouble(strA);
                double b = Double.parseDouble(strB);
                if (a == 0) {
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm");
                    } else {
                        JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nghiệm của phương trình : " + (-b / a));
                }

                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Nhập hệ số của hệ phương trình : \n" +
                        "a1x + b1y = c1\n" +
                        "a2x + b2y = c2" );

                String strA1 = JOptionPane.showInputDialog(null,
                        "nhập a1 : ");
                String strB1 = JOptionPane.showInputDialog(null,
                        "nhập b1 : ");
                String strC1 = JOptionPane.showInputDialog(null,
                        "nhập c1 : ");
                String strA2 = JOptionPane.showInputDialog(null,
                        "nhập a2 : ");
                String strB2 = JOptionPane.showInputDialog(null,
                        "nhập b2 : ");
                String strC2 = JOptionPane.showInputDialog(null,
                        "nhập c2 : ");
                double a1 = Double.parseDouble(strA1);
                double b1 = Double.parseDouble(strB1);
                double c1 = Double.parseDouble(strC1);
                double a2 = Double.parseDouble(strA2);
                double b2 = Double.parseDouble(strB2);
                double c2 = Double.parseDouble(strC2);

                double det =  a1 * b2 - a2 * b1;
                if (det == 0) {
                    if (c1 == c2) {
                        JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm");
                    } else {
                        JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
                    }
                } else {
                    double x = (c1 * b2 - c2 * b1) / det;
                    double y = (a1 * c2 - a2 * c1) / det;
                    System.out.println("Nghiệm của hệ phương trình:");
                    JOptionPane.showMessageDialog(null, "Nghiem x = " + x);
                    JOptionPane.showMessageDialog(null, "Nghiem y = " + y);
                }

                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Nhập các hệ số của phương trình ax^2 + bx + c = 0:");
                String strAx = JOptionPane.showInputDialog(null,
                        "nhập a : ");
                String strBx = JOptionPane.showInputDialog(null,
                        "nhập b : ");
                String strCx = JOptionPane.showInputDialog(null,
                        "nhập c : ");
                a = Double.parseDouble(strAx);
                b = Double.parseDouble(strBx);
                double c = Double.parseDouble(strCx);

                if (a == 0) {
                    if (b == 0) {
                        if(c == 0) {
                            JOptionPane.showMessageDialog(null, "Phương trình có vô số nghiệm");
                        } else {
                            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
                        }
                    } else {
                        double root = -c / b;
                        JOptionPane.showMessageDialog(null, "Phương trình có 1 nghiệm x = " + root);
                    }
                } else {
                    double discriminant = b * b - 4 * a * c;

                    if (discriminant > 0) {
                        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                        JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm \n" +
                                "x = " + root1 + " hoặc \n" +
                                "x = " + root2 );
                    } else if (discriminant == 0) {
                        double root = -b / (2 * a);
                        JOptionPane.showMessageDialog(null, "Phương trình có 1 nghiệm kép :  \n" +
                                "x = " + root);
                    } else {
                        JOptionPane.showMessageDialog(null, "Phương trình không có nghiệm thực");
                    }
                }

                break;
        }
    }

}

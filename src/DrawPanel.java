import java.awt.Graphics;
import java.util.Locale;
import javax.swing.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {

        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g); //sistema chama automaticamente sempre q exibir o DrawPanel
        showMenu(g);
    }

    private void showMenu(Graphics g) {
        System.out.println("Opções de Formas Geométricas: ");
        String[] options = new String[7];
        StringBuilder sb = new StringBuilder("#".repeat(100));

        String forma = "rect";
        int largura = 20, altura = 40;

        sb.append("%n").append("  R : Retângulo  %n");
        options[0] = "R";

        sb.append("  Q : Quadrado  %n");
        options[1] = "Q";
        sb.append("  C : Círculo  %n");
        options[2] = "C";
        sb.append("  O : Oval  %n");
        options[3] = "O";
        sb.append("  # ").append("# ".repeat(48)).append("%n");
        sb.append("  X : Sair  %n");
        options[4] = "X";
        sb.append("#".repeat(100)).append("%n");

        String opcao = ConsoleUtils.getUserOption(sb.toString(), options).toUpperCase(Locale.getDefault());

        ShapeFactory factory = new ShapeFactory();
        int width = getWidth();
        int height = getHeight();

        switch (opcao) {
            case "R":
                forma = "rect";
                largura = 20;
                altura = 30;
                break;
            case "Q":
                forma = "quad";
                largura = 30;
                altura = 30;
                break;
            case "C":
                forma = "circ";
                largura = 40;
                altura = 40;
                break;
            case "O":
                forma = "oval";
                largura = 20;
                altura = 40;
                break;
            case "X":
                System.out.println("Obrigado!! Volte sempre.");
            default:
                System.out.println("Opção inválida!!!");
        }
        Shapes shape = factory.getShape(forma, width/2,height/2);
        shape.desenhar(g, largura, altura);
    }
}

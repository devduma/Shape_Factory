import javax.swing.*;

public class Factory_Method {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        // cria um novo quadro/frame para armazenar o painel
        JFrame application = new JFrame();

        //configura o frame para ser encerrado qdo fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); //adiciona o painel ao frame
        application.setSize(240,240); // tamanho do frame
        application.setVisible(true); // torna o frame visível
    }
}

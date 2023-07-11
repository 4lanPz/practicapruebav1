import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class aplicacion {
    String marca,anio, cilin;
    String a1[] = new String[100];
    int i=0;
    public JPanel pantalla;
    private JTextField Tmarca;
    private JTextField Tanio;
    private JTextField Tcilin;
    private JButton regresaButton;
    private JButton siguienteButton;
    private JButton guardarButton;
    private JButton VERDATOSButton;
    private JLabel ImpMarca;
    private JLabel ImpAnio;
    private JLabel ImpCilin;

    public aplicacion(String marca, String anio, String cilin) {
        this.marca = marca;
        this.anio = anio;
        this.cilin = cilin;
    }
    public String getMarca(String text) {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getCilin() {
        return cilin;
    }
    public void setCilin(String cilin) {
        this.cilin = cilin;
    }
    public aplicacion() {
    Tmarca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            marca=setMarca(String.valueOf(Tmarca));
        }
    });
    Tanio.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            anio = Tanio.getText();
        }
        //
    });
    Tcilin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cilin = Tcilin.getText();
        }
    });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        VERDATOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1[0]="xd";
                ImpMarca.setText(a1[0]);
                i++;
            }
        });
        ImpMarca.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        ImpAnio.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }
}

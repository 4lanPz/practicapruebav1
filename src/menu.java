import javax.swing.*;
import java.io.*;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
public class menu extends JFrame{
    public static void main(String[] args) throws FileNotFoundException{
        aplicacion carros=new aplicacion("awa","asd","asdad");
        JFrame frame = new JFrame("aplicacion");
        frame.setContentPane(new aplicacion().pantalla);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




        /*String filePath = "C:\\Users\\POO\\Desktop\\data.txt";

        try(
                FileOutputStream fileOut=new FileOutputStream(filePath);
                ObjectOutputStream obOut=new ObjectOutputStream(fileOut);
        ){
            obOut.writeObject(carros);
            System.out.println("archivo escrito correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //////////////////////

        try(
                FileInputStream fileIn=new FileInputStream(filePath);
                ObjectInputStream objIn=new ObjectInputStream(fileIn);
        ){
            aplicacion readObject=(aplicacion) objIn.readObject();
            System.out.println("El objeto en disco es:" +readObject);
            System.out.println(readObject.getMarca());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }
}

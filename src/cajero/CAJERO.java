package cajero;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CAJERO extends JFrame implements  ActionListener{
    
    caje datos=new caje();
    JLabel numero,nombre,login,password,deposito,retiro,total;
    JPasswordField txt_password;
    JTextField txt_nombre,txt_numero,txt_login,txt_deposito,txt_total,txt_retiro;
    JButton btn_consultar,btn_registrarlogin,btn_retirar;

    public CAJERO() {
      setTitle("Cajero");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        numero = new JLabel("Numero");
        nombre = new JLabel("Nombre");
        login =new JLabel("Login");
        password=new JLabel("Contraseña");
        deposito=new JLabel("deposito");
        total= new JLabel("Saldo");
        txt_nombre = new JTextField();
        txt_retiro=new JTextField();
        txt_numero =new JTextField();
        txt_deposito =new JTextField();
        txt_login=new JTextField();
        txt_password=new JPasswordField();
        txt_total= new JTextField();
        btn_registrarlogin = new JButton("crear login");
        btn_retirar = new JButton("retirar");
        btn_consultar = new JButton("consultar");
        
        Container contenedor = getContentPane();
        GridLayout Layout = new GridLayout(8, 2, 3, 3);
        contenedor.setLayout(Layout);
        contenedor.add(numero);
        contenedor.add(txt_numero);
        contenedor.add(nombre);
        contenedor.add(txt_nombre);
        contenedor.add(login);
        contenedor.add(txt_login);
        contenedor.add(password);
        contenedor.add(txt_password);
        contenedor.add(deposito);
        contenedor.add(txt_deposito);
        contenedor.add(retiro);
        contenedor.add(txt_retiro);
        contenedor.add(total);
        contenedor.add(txt_total);
        
        contenedor.add(btn_registrarlogin);
        contenedor.add(btn_retirar);
        contenedor.add(btn_consultar);
        
          
    }
    
    
    public static void main(String[] args) {
        CAJERO cajero = new CAJERO();
        cajero.setVisible(true);  
    
    }

    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        
        
        if(evento.getSource()==btn_registrarlogin )
        {
            datos.setNombre(txt_nombre.getText());
            datos.setLogin(txt_login.getText());
            datos.setPassword(txt_password.getText());
            JOptionPane.showMessageDialog(null, "Usuario Creado");
                     
        }
        if(evento.getSource()==btn_consultar){
            datos.getTotal1();
        }

    }
    
}

package cajero;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class CAJERO extends JFrame implements  ActionListener{
    
    caje datos=new caje();
JLabel numero,nombre,login,pass,deposito,retiro,total;
    JPasswordField txt_pass;
    JTextField txt_nombre,txt_numero,txt_login,txt_deposito,txt_total,txt_retiro;
    JTextArea block,tarea;
    JButton btn_consultar,btn_regilogin,btn_retirar,btb_consultar,btn_ingresar;

    public CAJERO() {
      setTitle("Cajero");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        numero = new JLabel("Numero");
        nombre = new JLabel("Nombre");
        login =new JLabel("Login");
        pass=new JLabel("Contraseña");
        deposito=new JLabel("deposito");
        total= new JLabel("Saldo");
        txt_nombre = new JTextField();
        txt_retiro=new JTextField();
        txt_numero =new JTextField();
        txt_deposito =new JTextField();
        txt_login=new JTextField();
        txt_pass=new JPasswordField();
        txt_total= new JTextField();
        btn_regilogin = new JButton("crear login");
        btn_ingresar = new JButton("depositar");
        btn_retirar = new JButton("retirar");
        btn_consultar = new JButton("consultar");
        
        Container contenedor = getContentPane();
        GridLayout gr = new GridLayout(8, 2, 3, 3);
        contenedor.setLayout(gr);
        contenedor.add(numero);
        contenedor.add(txt_numero);
        contenedor.add(nombre);
        contenedor.add(txt_nombre);
        contenedor.add(login);
        contenedor.add(txt_login);
        contenedor.add(pass);
        contenedor.add(txt_pass);
        contenedor.add(deposito);
        contenedor.add(txt_deposito);
        contenedor.add(retiro);
        contenedor.add(txt_retiro);
        contenedor.add(total);
        contenedor.add(txt_total);
        
        contenedor.add(btn_regilogin);
        contenedor.add(btn_retirar);
        contenedor.add(btn_consultar);
        btn_regilogin.addActionListener(this);
        btn_ingresar.addActionListener(this);
        btn_retirar.addActionListener(this);
        btn_consultar.addActionListener(this);
          
    }
    
    
    public static void main(String[] args) {
        CAJERO win2 = new CAJERO();
        win2.setVisible(true);  
    
    }

    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        
        
        if(evento.getSource()==btn_regilogin )
        {
            datos.setNombre(txt_nombre.getText());
            datos.setLogin(txt_login.getText());
            datos.setPass(txt_pass.getText());
            JOptionPane.showMessageDialog(null, "Usuario Creado");
                     
        }
        if(evento.getSource()==btn_consultar){
            datos.getTotal1();
        }

    }
    
}

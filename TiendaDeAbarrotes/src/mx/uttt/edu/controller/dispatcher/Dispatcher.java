/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.edu.controller.dispatcher;

import javax.swing.JOptionPane;
import mx.uttt.edu.front.controller.view.ProductosView;
import mx.uttt.edu.front.controller.view.VentaView;

/**
 *
 * @author karlo
 */
public class Dispatcher {
    
    
   private ProductosView produt;
   private VentaView venta;
    public Dispatcher()
    {
        produt = new ProductosView();
        venta = new VentaView();
    }
    
    public void dispatch(String request)
    {
        if (request.equalsIgnoreCase("Producto")) {
            produt.show();
        }else if(request.equalsIgnoreCase(""))
        {
          venta.show();
        }else 
        {
            JOptionPane.showMessageDialog(null,"Error","Error",0);
        }
 
    }
    
    
    
    
}

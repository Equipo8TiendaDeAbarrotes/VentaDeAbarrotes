/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uttt.edu.front.controller.front;

import javax.swing.JOptionPane;
import mx.uttt.edu.controller.dispatcher.Dispatcher;

/**
 *
 * @author Ricardo Hiram
 */
public class FrontController {
    
      private final Dispatcher dispatcher;
      
        public FrontController(){
      dispatcher = new Dispatcher();
      
   }
        
  private boolean isAuthenticProduc(){
        JOptionPane.showMessageDialog(null,"Producto Registrado Correctamente");
      
      return true;
      
   }
  
  private boolean isAuthenticVenta(){
        JOptionPane.showMessageDialog(null,"Venta  Finalizada Correctamente");
      
      return true;
      
   }

   private void trackRequest(String request){
       
       JOptionPane.showMessageDialog(null,"Peticion de la Pagina: " +request);
      
   }
   
    public void dispatchRequest(String request){
      
      trackRequest(request);
   
      if(isAuthenticProduc()){
         dispatcher.dispatch(request);
         
      }else if (isAuthenticVenta()){
           dispatcher.dispatch(request);
      }	
   }
   
}
      


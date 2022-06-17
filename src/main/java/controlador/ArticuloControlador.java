/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Articulo;
import java.util.List;
import servicio.ArticuloServicio;

/**
 *
 * @author ROG PC
 */
public class ArticuloControlador {
    
    private final ArticuloServicio articuloServicio = new ArticuloServicio();
    
        public Articulo crear(String [] args){
        
        var articulo = new Articulo(args[0],args[1],args[2],Integer.valueOf(args[3]),Integer.valueOf(args[4]));
      
        
        this.articuloServicio.crear(articulo);
        return articulo;
    }
    
    public List<Articulo> listar(){
        return this.articuloServicio.listar();
    }
    
    
    
    
}

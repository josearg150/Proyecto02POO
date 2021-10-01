/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_02;

/**
 *
 * @author Jose angel
 */
class Cultivo {
    //Atributos
    private String nombre;
    private Produccion produccionInicial;
    private Produccion produccionFinal;
    private double precio;
    //Constructores
    //por defecto
    public Cultivo(){
        nombre = "S/N";
        produccionInicial = new Produccion();
        produccionFinal = new Produccion();
        precio = 0;
    }
     //Datos definidos por usuario
     public Cultivo(String nombre, Produccion inicial, Produccion fin,double precio){
        this.nombre = nombre;
        produccionInicial = new Produccion(inicial);
        produccionFinal = new Produccion(fin);
        this.precio = precio;
    }
     //metodos get/set
     public String getNombre(){
         return nombre;
     }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     
     public Produccion getProduccionInicial(){
         return produccionInicial;
     }
     public void setProduccionInicial(Produccion Inicial){
         produccionInicial = new Produccion(Inicial);
     }
     
     public Produccion getProduccionFinal(){
         return produccionFinal;
     }
     public void setProduccionFinal(Produccion fin){
         produccionFinal = new Produccion(fin);
     }
        public double getPrecio(){
         return precio;
     }
        public void setPrecio(double precio){
         this.precio = precio;
        }
     
     //metodos de procesamiento
     public Produccion produccionMensual(){
          Produccion resultante =  produccionFinal.restar(produccionInicial);//Restar la produccion inicial a la final para obtener la produccion mensual
          return resultante;  
     }
     public double obtenerImporte(){
        return produccionMensual().librasTotales() * getPrecio();//Multiplicar todas las libras por el precio asignado 
     }

}

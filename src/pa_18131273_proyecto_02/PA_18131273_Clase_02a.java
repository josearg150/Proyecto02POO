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
class Produccion {
    //Atributos
    private int tonelada;
    private int quintal;
    private int arroba;
    private int libra;
    
    //Constructores
    //Por defecto
    public Produccion(){
        tonelada = 0;
        quintal = 0;
        arroba = 0;
        libra = 0;
    }
    //Datos definidos por usuario
        public Produccion(int tonelada, int quintal, int arroba, int libra){
        this.tonelada = tonelada;
        this.quintal = quintal;
        this.arroba = arroba;
        this.libra = libra;
    }
    //Datos de otro objeto cultivo
        public Produccion(Produccion p){
        tonelada = p.tonelada;
        quintal = p.quintal;
        arroba = p.arroba;
        libra = p.libra;
        }
        
        //Metodos get/set 
        public int getTonelada(){
            return tonelada;
        }
        public void setTonelada(int tonelada){
            this.tonelada = tonelada;
        }
        
        public int getQuintal(){
            return quintal;
        }
        public void setQuintal(int quintal){
            this.quintal = quintal;
        }        
        
        public int getArroba(){
            return arroba;
        }
        public void setArroba(int arroba){
            this.arroba = arroba;
        }
        
        public int getLibra(){
            return libra;
        }
        public void setLibra(int libra){
            this.libra = libra;
        }
        
    @Override
        public String toString(){
            return "Tonelada: "+tonelada+
                     "Quintal: "+quintal+
                     "Arroba: "+arroba+
                     "Libra: "+libra;
        }
      //Metodos de procesamiento
        public int librasTotales(){
            return  (tonelada * 2000 ) + (quintal *100) + (arroba * 25 )+ libra;
        }
        public Produccion sumar(Produccion p){
            int suma = librasTotales() + p.librasTotales();
            int toneladasS = suma / 2000;   //Conversion de unidades
            int quintalResto = suma % 2000;
            int quintalS = quintalResto / 100;
            int arrobasResto = quintalResto % 100;
            int arrobasS = arrobasResto / 25;
            int librasS = arrobasResto % 25;
            
            return new Produccion(toneladasS,quintalS,arrobasS, librasS);           
        }
        public Produccion restar(Produccion p){
            int resta = librasTotales() - p.librasTotales();//Conversion de unidades
            int toneladasS = resta / 2000;
            int quintalResto = resta % 2000;
            int quintalS = quintalResto / 100;
            int arrobasResto = quintalResto % 100;
            int arrobasS = arrobasResto / 25;
            int librasS = arrobasResto % 25;
            
            return new Produccion(toneladasS,quintalS,arrobasS,librasS);
        }
}

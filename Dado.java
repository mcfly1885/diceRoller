package giocodadi;

import java.util.Random;

public class Dado {

   
    private  int faces;
    

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }
    

    public int lanciaDado(){
        Random gen = new Random();
        return gen.nextInt(this.faces)+1; 
    }    
    
}

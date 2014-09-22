/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class Complex {
    static final int SIZE = 2;
    private int real;
    private int image;
    
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    
    public Complex Add(Complex A){
        int sumi;
        int sumr;
        sumi = A.image + this.image;
        sumr = A.real + this.real;
        
        return new Complex(sumr,sumi);
    }
    
    public Complex Sup(Complex A){
        int sumi;
        int sumr;
        sumi = this.image - A.image;
        sumr =  this.real - A.real;
        
        return new Complex(sumr,sumi);
    }
    
    public Complex Mul(Complex A){
        int sumi;
        int sumr;
        sumi = A.real * this.image + this.real * A.image;
        sumr = A.real * this.real + (A.image*this.image* -1);
        
        return new Complex(sumr,sumi);
    }
    
    public int getReal(){
        return this.real;
    }
    
    public int getImg(){
        return this.image;
    }
    public double Mag(){
        
        return Math.sqrt(Math.pow(real, 2)+Math.pow(image, 2));
        
    }
    
    public boolean Compare(Complex A){
        
        if(A.Mag() ==  this.Mag()){
            return true;
        }
        return false;
    }
    
    public void printMat(){
        int g;
        g = -this.image;
        System.out.println(this.real+" "+g);
        System.out.println(this.image+" "+this.real);
    }

    @Override
    public String toString() {
        String r="Real = "+real;
        r= String.format( "%s%n",r);
        return r+"Imagine = "+image; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

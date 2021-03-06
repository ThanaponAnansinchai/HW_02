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
    
    public Complex(int real, int image) { //กำหนดให้ตัวแปรใน Class นี้ เท่ากับตัวแปรจาก Class TestComplex
        this.real = real;
        this.image = image;
    }
    
    public Complex Add(Complex A){  // บวก Complex Number 
        int sumi;
        int sumr;
        sumi = A.image + this.image;
        sumr = A.real + this.real;
        
        return new Complex(sumr,sumi);
    }
    
    public Complex Sup(Complex A){ // ลบ Complex Number
        int sumi;
        int sumr;
        sumi = this.image - A.image;
        sumr =  this.real - A.real;
        
        return new Complex(sumr,sumi);
    }
    
    public Complex Mul(Complex A){ // คูณ Complex Number
        int sumi;
        int sumr;
        sumi = A.real * this.image + this.real * A.image;
        sumr = A.real * this.real + (A.image*this.image* -1);
        
        return new Complex(sumr,sumi);
    }
    
    public int getReal(){ // แสดงจำนวจริงของ Complex Number
        return this.real;
    }
    
    public int getImg(){ // แสดงจำนวนจินตภาพของ Complex Number
        return this.image;
    }
    public double Mag(){ // หาขนาดของ Complex Number
        
        return Math.sqrt(Math.pow(real, 2)+Math.pow(image, 2));
        
    }
    
    public boolean Compare(Complex A){ //เปรียบเทียบ Complex Number ทั้ง 2
        
        if(A.Mag() ==  this.Mag()){
            return true;
        }
        return false;
    }
    
    public void printMat(){ //ปริ้น Complex Number ในรูปของ Matrix
        int g;
        g = -this.image;
        System.out.println(this.real+" "+g);
        System.out.println(this.image+" "+this.real);
    }

    @Override
    public String toString() { //ใช้ในการปริ้น Object
        String r="Real = "+real;
        r= String.format( "%s%n",r);
        return r+"Imagine = "+image; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

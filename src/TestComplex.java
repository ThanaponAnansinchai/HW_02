
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class TestComplex {
    static final int SIZE = 2;
    public static void main(String[] argh){
        
        Scanner sc = new Scanner(System.in);
            int n[][] = new int[SIZE][SIZE]; // สร้าง Array เริ่มต้น
            
            Complex[] AA = new Complex[SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < n.length; j++) {
                    n[i][j] = sc.nextInt(); // วนรับค่า
                    
                } 
                AA[i] = new Complex(n[i][0],n[i][1]); //สร้าง Object จากอีกคลาสหนึ่ง
               
            
        }
            AA[0].printMat();                           // ปริ้น Complex Number ในรูปของ Matrix
            AA[1].printMat();
            System.out.println(AA[0].Add(AA[1]));       // บวก Complex Number
            System.out.println(AA[0].Sup(AA[1]));       // ลบ Complex Number
            System.out.println(AA[0].Mul(AA[1]));       // คูณ Complex Number
            System.out.println(AA[0].getReal());        // แสดงจำนวนจริงจาก Complex Number
            System.out.println(AA[0].getImg());         // แสดงจำนวนจินตภาพจาก Complex Number
            System.out.println(AA[1].getReal());
            System.out.println(AA[1].getImg());
            System.out.println(AA[0].Mag());            // หาขนาดของ Complex Number
            System.out.println(AA[1].Mag());
            System.out.println(AA[0].Compare(AA[1]));   // เปรียบเทียบ Complex Number ของทั้ง 2 
       
            
    }
    
}

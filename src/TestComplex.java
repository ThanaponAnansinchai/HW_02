
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
            int n[][] = new int[SIZE][SIZE];
            
            Complex[] AA = new Complex[SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < n.length; j++) {
                    n[i][j] = sc.nextInt();
                    
                } 
                AA[i] = new Complex(n[i][0],n[i][1]);
               
            
        }
            AA[0].printMat();
            AA[1].printMat();
            System.out.println(AA[0].Add(AA[1]));
            System.out.println(AA[0].Sup(AA[1]));
            System.out.println(AA[0].Mul(AA[1]));
            System.out.println(AA[0].getReal());
            System.out.println(AA[0].getImg());
            System.out.println(AA[1].getReal());
            System.out.println(AA[1].getImg());
            System.out.println(AA[0].Mag());
            System.out.println(AA[1].Mag());
            System.out.println(AA[0].Compare(AA[1]));
       
            
    }
    
}

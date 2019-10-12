/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negyedik_feladat;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Test {
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherauto [] teher)
    {
        for(int i=0;i<teher.length-1;i++)
            for(int j=i+1;j<teher.length;j++){
                if(teher[i].getMaxSzallithatoTeher()<teher[j].getMaxSzallithatoTeher()){
                    
                    Teherauto tmp=teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
                
            }
    }
    
    public static void keresmaxMotorTeljesítmény(Auto [] motor)
    {
        for(int i=0;i<motor.length-1;i++)
            for(int j=i+1;j<motor.length;j++){
                if(motor[i].getMotorTeljesitmeny()<motor[j].getMotorTeljesitmeny()){
                    Auto tmp=motor[i];
                    motor[i]=motor[j];
                    motor[j]=tmp;
                }
            }
                
    }
    
    public static void main(String[] args) {
        Teherauto [] t= new Teherauto[] {
            new Teherauto(500,"EEE-555",500),
            new Teherauto(600,"FFF-666",550),
            new Teherauto (550,"GGG-777",650),
            new Teherauto (700,"HHH-888",520),
            new Teherauto (560,"III-999",540)       
            
        };
        
        Auto [] a= new Auto[]
        {
          new Auto("ABC-123",50),
           new Auto("AAA-111",100),
           new Auto("BBB-222",200),
           new Auto("CCC-333",300),
           new Auto("DDD-444",400),
           new Teherauto(500,"EEE-555",500),
            new Teherauto(600,"FFF-666",550),
            new Teherauto (550,"GGG-777",650),
            new Teherauto (700,"HHH-888",520),
            new Teherauto (560,"III-999",540)   
        };
        
        rendezMaxSzállíthatóTeherCsökkenőleg(t);
        for(int i=0;i<t.length;i++){
        System.out.println(t[i]);}
        
        keresmaxMotorTeljesítmény(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[0]);
            break;
        }
        
    }
    
}

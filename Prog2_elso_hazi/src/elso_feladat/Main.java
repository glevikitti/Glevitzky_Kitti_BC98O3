package elso_feladat;
public class Main {
    public static void main(String[] args) {
        Pont pont1= new Pont(10,20);
        Pont pont2= new Pont(12,22);
        Pont pont3= new Pont(14,24);
        Pont pont4= new Pont(16,26);
        
        pont1.setY(pont1.getY()+5);
        pont2.setY(pont2.getY()+5);
        pont3.setX(pont3.getX()*0.75);
        pont4.setX(pont4.getX()*0.75);
        
        System.out.println("("+pont1.getX()+";"+pont1.getY()+")");
        System.out.println("("+pont2.getX()+";"+pont2.getY()+")");
        System.out.println("("+pont3.getX()+";"+pont3.getY()+")");
        System.out.println("("+pont4.getX()+";"+pont4.getY()+")");
                
        
    }
}

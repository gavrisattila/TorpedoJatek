
package main;

public class Program {

    public static void main(String[] args) {
        System.out.println("Teszt");
        assert 1==2 :"nem jó az ellenőrzés";
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált "):"nem jó a találat";
        return ("");
    }
}

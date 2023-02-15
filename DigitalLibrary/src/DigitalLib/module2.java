package DigitalLib;

public class module2 {
    public void chemistry(){
        System.out.println("");
        String chem[]={"Organic chemistry","Physical chemistry","Bio chemistry","Inorganic chemistry","Polymer chemistry"};
        System.out.println("These books available in chemistry department are as follows:");
        for (int i=0;i< chem.length;i++){
            System.out.println(chem[i]);
        }
    }
    public void physics(){
        System.out.println("");
        String phy[]={"Mechanics","Dynamics","Solid State Physics","Electromagnetism"};
        System.out.println("These books are availabele in Physics department are as follows:");
        for (int j=0;j<phy.length;j++){
            System.out.println(phy[j]);
        }
    }
    public void biology(){
        System.out.println("");
        String bio[]={"Zoology","Botany","Medical Science","xyz","abc"};
        for (int k=0;k< bio.length;k++){
            System.out.println(bio[k]);
        }
    }
}

//Nisim klasen duke percaktuar 3 variablat kyce: nisje, destinacion dhe cmimi
public class Udhetim {

    private String nisja;

    private String destinacion;


    private Double cmimi;

    public Udhetim( String nisja, String destinacion, Double cmimi) {  //konstruktori i klases
        this.destinacion = destinacion;                                //inicializimi i variablave
        this.nisja = nisja;
        this.cmimi = cmimi;
    }

    
    public Double getCmimi() {                                        //metoda set nuk perdoret pas rezervimit te biletes
        return cmimi;
    }

   public String getNisja() {
        return nisja;
    }
    public String getDestinacion() {
        return destinacion;
    }

    
}

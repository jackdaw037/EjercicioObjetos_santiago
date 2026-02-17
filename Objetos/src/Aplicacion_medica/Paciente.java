package Aplicacion_medica;

public class Paciente {

    private String nombre;
    private String apellido;
    private String fNacimiento;
    private String dni;
    private String sexo;
    private int altura;
    private int peso;
    private String alergias;
    private String medicamentos;
    private String cirugias;



    public Paciente(String nombre, String apellido, String fNacimiento,
                    String dni, String sexo, int altura, int peso, String alergias,
                    String medicamentos, String cirugias) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.cirugias = cirugias;


    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo(){
        return sexo;
    }

    public int getAltura(){
        return altura;
    }

    public int getPeso(){

        return peso;
    }

    public String getAlergias(){

        return alergias;
    }

    public String getMedicamentos(){

        return medicamentos;
    }

    public String getCirugias(){

        return cirugias;
    }

    public double Imc(){
        return peso / (altura * altura);
    }

    public String clasificacionImc(){
        double imc = Imc();

        if(imc < 18.5){
            return "peso bajo";
        } else if (imc < 25) {
            return "peso normal";
            
        } else if (imc < 30) {
            return "sobre peso";
            
        }else {
            return "obesidad";
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fNacimiento='" + fNacimiento + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", alergias='" + alergias + '\'' +
                ", medicamentos='" + medicamentos + '\'' +
                ", cirugias='" + cirugias + '\'' +
                '}';
    }

    public void mostrar(){
        System.out.println("IMC: "+ Imc() +" "+ clasificacionImc());

    }
}

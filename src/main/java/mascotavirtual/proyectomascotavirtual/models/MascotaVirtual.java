package mascotavirtual.proyectomascotavirtual.models;

public class MascotaVirtual {
    //en la carpeta models cree el archivo para hacer "MascotaVirtual" y para 
    //que me lea debo ponerle en MAYSCULAS la primera letra del archivo por que si no me
    //me da error por ejemplo para que funcione 
    // MusicaVirtual.java eso es correcto para leer el archivo y me reciba el objeto. 
    /*puede  ser tanto privado o publico dependiendo si el dato es va hacer de manera global o local */
    private String nombre;
    private int peso;
    private double conocimiento;
    private int cantidadEstudios;
    private int cantidadAcciones;
    
    


    //lo interesante de aqui encontre contro + espacio y me aparecio un listado. 
    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.peso = 500;
        this.conocimiento = 0;
        this.cantidadEstudios = 0;
        this.cantidadAcciones = 0;
       
    }
    private int getEdad(){
        int edad = (this.cantidadAcciones/3);
        return edad;
    }

    private boolean estsViva(){
        if (this.peso > 1000) return false;
        if (this.peso > 200) return false;
        if (this.getEdad () == 2)return false;
        return true;


    }
    private String getProfesion(){
        if(this.conocimiento < 1) return "Vago";
        if(this.conocimiento < 3) return "Estudiante Basica";
        if(this.conocimiento < 5) return "Estudiante Media";
        if(this.conocimiento < 7) return "Estudiante Universitario";
        if(this.conocimiento < 9) return "Profesionar";
        if(this.conocimiento < 10) return "Cientifico Loco";
        return "Dios";



    }




    public String getEstado(){
		String estado = "/n";

        if(!this.estaViva()){
            estado += "/n-------------------";
            estado += "/n    DEAD      ";
        }


		estado += "/n**********************";
		estado += "Nombre :" + this.nombre;//recordar jamas poner esto en el programa principa si no me va marcar error 
		estado += "Peso  :" + this.nombre;
        estado += "Profesion  :" + this.getProfesion();
        estado += " edad  :" + this.getEdad();
        estado += "/n------------------";
        return estado;


	}

    public String alimentar( int tipo){
        if (tipo == 1 ) peso += 30;
        if (tipo == 2 ) peso += 50;
        if (tipo == 3 ) peso += 100;
        this.cantidadEstudios = 0;
        this.cantidadAcciones ++;
        return " *____* Nam,nam";

    }
    public String ejercitar( int tipo){
        if (tipo == 1 ) peso -= 30;
        if (tipo == 2 ) peso -= 50;
        if (tipo == 3 ) peso -= 100;
        this.cantidadAcciones ++;
        return " U___U ufff";
    }
    private boolean tieneHambre(){
           if (this.cantidadEstudios >= 3) return true;
           return false;
    }
    

    
    public String estudiar(){
        if(tieneHambre ()){
            return "No puedo estudia.....tengo  hambre!";
        }
        
        
        this.cantidadEstudios ++;
        this.cantidadAcciones ++;
        this.conocimiento += 0.5;
        
        return " U___U ufff";
    }


    





}


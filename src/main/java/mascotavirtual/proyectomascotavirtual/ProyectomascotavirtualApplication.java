package mascotavirtual.proyectomascotavirtual;


import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import mascotavirtual.proyectomascotavirtual.models.MascotaVirtual;

@SpringBootApplication
public class ProyectomascotavirtualApplication {

	public static void main(String[] args) {
		

		int opcion = 0;
		do {
			opcion = opcionInicio();
			 
		

			

			if (opcion ==1){
				// crear mascota nueva
				System.out.println("");
				System.out.println("Ingrese el nombre de la mascota");
			   // String name = sc.next();
			  //  MascotaVirtual mascota = new MascotaVirtual(nombre);
			    do{
				opcion = opcionesMascota();

				if(opcion == 1){
					System.out.println("Info");
					System.out.println(mascota.getEstado());

				}
				if(opcion == 2){
					int alimento = opcionesAlimento();
					System.out.println("Alimentando....");
					System.out.println(mascota.alimentar(alimento));

				}
				if(opcion == 3){
					int ejercicio = opcionesEjercicio();
					System.out.println("Ejercitando....");
					System.out.println(mascota.ejercitar(ejercicio));

				}
				if(opcion == 4){
					System.out.println("Estudiar");
					System.out.println(mascota.estudiar());

				}




				//opcion distinta de 0 o distinta de 9
			   }while(opcion != 0 && opcion != 9 && mascota.estaViva() );
		   //aqui me genero una condicion por lo cual al acceder a la opcion uno es verdadero. 
		        System.out.println(mascota.getEstado());

			}
			

		} while (opcion != 0);
	
 

 

	}
	public static int opcionesEjercicio(){
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("");
		do{
			System.out.println("Ingrese el alimento:");
		    System.out.println("[1] Caminar");
		    System.out.println("[2] Trotar");
		    System.out.println("[3] Perseguir autos ");
	        opcion = sc.nextInt();
		}while(opcion < 1 || opcion > 3);
		return opcion;
	}
		



	public static int opcionesAlimento(){
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("");
		do{
			System.out.println("Ingrese el alimento:");
		    System.out.println("[1] Croquetas");
		    System.out.println("[2] Jamon");
		    System.out.println("[3] Pollo ");
	        opcion = sc.nextInt();
		}while(opcion < 1 || opcion > 3);
		return opcion;
	}
		


     //el return retorna ese valor 
	public static int opcionesMascota(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese su opcion:");
		System.out.println("[1] Mostrar Estado ");
		System.out.println("[2] Alimentar");
		System.out.println("[3] Ejercitar ");
		System.out.println("[2] Estudiar");
		System.out.println("[9] Resetear Mascota ");
		System.out.println("[0] Salir ");
		return sc.nextInt();


	}
	public static int opcionInicio(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese su opcion:");
		System.out.println("[1] Crear una Mascota Nueva");
		System.out.println("[0] Salir ");
		return sc.nextInt();


	}


}

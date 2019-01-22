public class Liga
{
	static byte opc, CantidadEquipos, CODIGO[]= {0,1,2,3,4,5,6,7,8,9};
	static String Nombres[]={"","","","","","","","","",""};
	public static void main(String arg[])
	{ boolean aux1=false;
		 do{
      opc=Menu();

       switch(opc)
       {
	   case 1:
	   do{
	   CantidadEquipos=CantidadEquipos();
	   if(CantidadEquipos <=2 || CantidadEquipos >10)
	   {
	   aux1=false;
	   error.MensajeError();
	   KbInput.read();
  }
	   else
	   {
	   aux1=true;
   }
   }while(aux1==false);
	   break;
	   case 2: NombreEquipo(); break;
	   case 3: Torneo(); break;
	   default:
	   if(opc!=0)
	   {
	   error.MensajeError();
	   KbInput.read();
       }//if
       }//switch
       if(opc==0)
       {System.out.println("GRACIAS, REGRESE PRONTO.");
	   }//if
       }while(opc!=0);

	}//main

	public static byte Menu()
	{
		BorrarPantalla.SCREEN();
		System.out.println("            LIGA NACIONAL");
		System.out.println("*----------------------------------*\n\n");
		System.out.println("MENU DE OPCIONES:\n");
		System.out.println("0.-SALIR DEL SISTEMA");
		System.out.println("1.-INGRESAR CANTIDAD EQUIPOS");
		System.out.println("2.-INGRESAR NOMBRE EQUIPOS");
		System.out.println("3.-COMENZAR TORNEO\n");
		return Leer.NByte("POR FAVOR INGRESE SU OPCION:");
	}//Menu

	public static byte CantidadEquipos()
	{
        BorrarPantalla.SCREEN();
		System.out.println("            LIGA NACIONAL");
		System.out.println("*----------------------------------*\n\n");
		return Leer.NByte("POR FAVOR INGRESE CANTIDAD DE EQUIPOS:");
	}//Cantidad Equipos

	public static void NombreEquipo()
	{
		BorrarPantalla.SCREEN();
		System.out.println("            LIGA NACIONAL");
		System.out.println("*----------------------------------*\n\n");
		for(int i=0; i<CantidadEquipos; i++)
		{
			System.out.println("POR FAVOR INGRESE NOMBRE DEL EQUIPO NUMERO   "+(i+1));
			Nombres[i] = KbInput.read();
            System.out.println("\nA ESTE EQUIPO SE LE HA ASIGNADO EL CODIGO:"+CODIGO[i]+"\n\n");
		}//for
		System.out.println("HA INGRESADO SATISFACTORTIAMENTE EL NOMBRE DE TODOS LOS EQUIPOS.");
		System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR");
		KbInput.read();
		return;
	}//NombreEquipo

public static void Torneo()
{byte op;
do{
	BorrarPantalla.SCREEN();
		System.out.println("            LIGA NACIONAL");
		System.out.println("*----------------------------------*\n\n");
		System.out.println("MENU DE OPCIONES:\n");
		System.out.println("0. REGRESAR MENU PRINCIPAL");
		System.out.println("1. JUGAR PARTIDO");
		System.out.println("2. TABLA DE POSICIONES\n");
		System.out.println("POR FAVOR INGRESE SU OPCION:\n");
		op=Byte.parseByte(KbInput.read());
		switch(op)
		{
			case 1:
			break;
			case 2:
			break;
		}//switch
		if(op==0)
		{
			System.out.println("USTED ESTA REGRESANDO AL MENU PRINCIPAL");
		}
}while(op!=0);
	return;
}//Torneo
}//Liga
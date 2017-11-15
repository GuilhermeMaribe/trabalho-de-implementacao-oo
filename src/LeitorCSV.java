import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeitorCSV {

	public static File csv = new File("participantes.csv");	
	   
	public static void main(String[] args) {
		int tam=10;
	 	Participantes user[]=new Participantes[tam];
	 	for (int i =0;i<user.length;i++) {
	 		user[i]=new Participantes();
	 		user[i].setNome("null");
	 		user[i].setEmail("null");
	 		user[i].setNumPart(0);
	 	}
		        
        try{
        	
			@SuppressWarnings("resource")
			Scanner ler = new Scanner(csv);
            String linha = new String();
            int cont=0;
            
            while(ler.hasNext()){
            	linha = ler.nextLine();
                String[] separa = linha.split(",");
                user[cont].setNome(separa[0]);
                user[cont].setEmail(separa[1]);
                user[cont].setNumPart(cont+1);
                System.out.println(user[cont].toString());
                cont++;
            	}
        
        	}catch(FileNotFoundException e){
            
        }
        
    
	
	
	}
	
}
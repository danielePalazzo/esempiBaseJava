public class EsempiCicli {

    public static void main(String[] args){
      /*
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        System.out.println("-----------");

        int y = 1;
        while (y < 11){
            System.out.println(y);
	    y++;
        }
	
	// se il numero è multiplo di 3 devo stampare fizz, se il numero è multiplo di 5 devo 	stampare buzz, se il numero è multiplo di 3 e di 5 devo stampare fizzbuz, altrimenti 	stampo direttamente il numero 

	for (int i = 1; i < 100; i++){
		if (i % 3 == 0 && i % 5 == 0){
			System.out.println("fizzbuzz");
		} else if (i % 5 == 0){
			System.out.println("buzz");
		  } else if (i % 3 == 0){
			System.out.println("fizz");
		    } else{
			System.out.println(i);
		      }
	}*/
      
	int[] nums = new int [5];
	/*System.out.println("Stampa array:");
	for (int i = 0; i < nums.length; i++){
		System.out.println(nums[i]);
	}*/

	nums[0] = 50;
	nums[4] = 100;
	
	for (int i = 0; i < nums.length; i++){	
			
		nums[i] = (i + 1) * 10;
		System.out.println(nums[i]);
	}
	
	System.out.println("--------");
	double sum = 0;

	System.out.println("Somma valori array:");
	for (int i = 0; i < nums.length; i++){
		sum += nums[i];
		System.out.println(sum);
	}

	System.out.println("--------");

	int max = nums[0];
	
	for (int i = 1; i < nums.length; i++){
		if (nums[i] > max){
			max = nums[i];
		}
	}
	System.out.println("Valore massimo: " + max);
	System.out.println("--------");

	int min = nums[0];
	for (int i = 1; i < nums.length; i++){
		if (nums[i] < min){
			min = nums[i];
		}
	}
	System.out.println("Valore minimo: " + min);

	for (int i = 0; i < nums.length; i++){
		sum += nums[i];
	}
	
	System.out.println("--------");
	System.out.println("Valore medio: " + sum / nums.length);

	double ss = sum(nums);
	System.out.println(ss/nums.length);
    }
	
	// FUNZIONI
	public static int sum(int x[]){
		int sum = 0;
		for (int i = 0; i < x.length; i++){
			sum += x[i];
		}

		return sum;
	}

	// CREARE UNA FUNZIONA CHE RICEVE IN INPUT UN ARRAY DI INTERI E RITORNA 	IL MASSIMO

	// CREARE UNA FUNZIONE CHE RICEVE IN INPUT UN ARRAY DI INTERI E RITORNA 	IL MASSIMO

	// CREARE UNA FUNZIONE CHE RICEVE IN INPUT UN ARRAY DI INTER E RITORNA 		UN DOUBLE CON IL SUO VALORE MEDIO

	// UNA FUNZIONE CHE RICEVE IN INPUT UN ARRAY DI INTERI E UN INTERO E 	RITORNA TRUE SE QUEL NUMERO INTERO È UN NUMERO DELL'ARRAY

	// PRENDE IN INPUT UN ARRAY DI INTERI E RITORNA IL VALORE CHE APPARE 	PIU VOLTE NELL'ARRAY, SE NON ESISTE UN VALORE CHE RITORNA PIU VOLTE, 	RITORNA IL PRIMO VALORE DELL'ARRAY
}

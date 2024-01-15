import java.util.Scanner;
public class LerNomesParte1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes da lista: ");
        String nomes  = s.nextLine();

        String [] names = nomes.split("\\s*,\\s*");
        OrdenaLista(names);
        System.out.println("***** Lista *****");
        for (String name : names) {
            System.out.println("Nome: " + name);
        }


    }
    public static void OrdenaLista(String []array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j].compareTo(array[j+1]) > 0){
                    String ss = array[j];
                    array[j] = array[j+1];
                    array[j+1] = ss;
                }
            }
        }
    }

}

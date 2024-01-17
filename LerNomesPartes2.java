import java.util.*;

public class LerNomesPartes2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes das pessoas (ex: NomeDaPessoa-SexoDaPessoa, ...): ");
        String nomes = s.nextLine();

        String[] pessoa = nomes.split(",");

        Map<String, List<String>> ListaPorSexo = new HashMap<>();
        for(String pessoas : pessoa) {
            String[] partes = pessoas.split("-");

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toLowerCase();

            if (!ListaPorSexo.containsKey(sexo)) {
                ListaPorSexo.put(sexo, new ArrayList<>());
            }
            ListaPorSexo.get(sexo).add(nome);
        }
        System.out.println("***** Lista Por Sexo *****");
        for (Map.Entry<String, List<String>> entry : ListaPorSexo.entrySet()){
            String sexo = entry.getKey();
            List<String> nome = entry.getValue();

            System.out.println("Lista do gênero: " + sexo + " || Nomes: " + nome + "\n");
        }
        System.out.println("**************************");

    }
}

package labs.labs.aula52.labs;
/**
 *
 * @author Patricia
 */
public class Contatos {
    
    private static int contador = 0;
    
    private int id;
    private String nome;
    private String telefone;
    private String email;
    
    public Contatos (){
        contador ++;
        id = contador;
    
}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

      

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

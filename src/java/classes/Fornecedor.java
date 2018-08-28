/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author glima
 */
public class Fornecedor {

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
    
    private String nome;
    private long cnpj;
    private String razao;
    private String senha;
    private String endereco;
    private String nrRua;
    private String bairro;
    private String cidade;
    private String complemento;
    private int cep;
    private String dataAbertura;
    private String telefone;
    private String email;
    
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
     * @return the cnpj
     */
    public long getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razao
     */
    public String getRazao() {
        return razao;
    }

    /**
     * @param razao the razao to set
     */
    public void setRazao(String razao) {
        this.razao = razao;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the nrRua
     */
    public String getNrRua() {
        return nrRua;
    }

    /**
     * @param nrRua the nrRua to set
     */
    public void setNrRua(String nrRua) {
        this.nrRua = nrRua;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the dataAbertura
     */
    public String getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
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
   
    
}

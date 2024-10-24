import java.time.LocalDate;

public class Cliente {
    private String nomeCompleto;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String sexo;
    private String empresa;
    private String profissao;
    private String nacionalidade;
    private String identidade;
    private String cpf;
    private String enderecoResidencial;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String ultimaProcedencia;
    private String proximoDestino;
    private String motivoViagem;
    private String meioTransporte;

    // Construtor
    public Cliente(String nomeCompleto, String email, String telefone, LocalDate dataNascimento, String sexo,
                   String empresa, String profissao, String nacionalidade, String identidade, String cpf,
                   String enderecoResidencial, String cidade, String estado, String pais, String cep,
                   String ultimaProcedencia, String proximoDestino, String motivoViagem, String meioTransporte) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.empresa = empresa;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.identidade = identidade;
        this.cpf = cpf;
        this.enderecoResidencial = enderecoResidencial;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.ultimaProcedencia = ultimaProcedencia;
        this.proximoDestino = proximoDestino;
        this.motivoViagem = motivoViagem;
        this.meioTransporte = meioTransporte;
    }

     // Get e Set
     public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUltimaProcedencia() {
        return ultimaProcedencia;
    }

    public void setUltimaProcedencia(String ultimaProcedencia) {
        this.ultimaProcedencia = ultimaProcedencia;
    }

    public String getProximoDestino() {
        return proximoDestino;
    }

    public void setProximoDestino(String proximoDestino) {
        this.proximoDestino = proximoDestino;
    }

    public String getMotivoViagem() {
        return motivoViagem;
    }

    public void setMotivoViagem(String motivoViagem) {
        this.motivoViagem = motivoViagem;
    }

    public String getMeioTransporte() {
        return meioTransporte;
    }

    public void setMeioTransporte(String meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCompleto + ", \nEmail: " + email + ", \nTelefone: " + telefone +
               "\nData de Nascimento: " + dataNascimento + ", \nSexo: " + sexo +
               "\nEmpresa: " + empresa + ", \nProfissão: " + profissao +
               "\nNacionalidade: " + nacionalidade + ", \nIdentidade: " + identidade + ", \nCPF: " + cpf +
               "\nEndereço: " + enderecoResidencial + ", \nCidade: " + cidade + ", \nEstado: " + estado + 
               ", \nPaís: " + pais + ", \nCEP: " + cep +
               "\nÚltima Procedência: " + ultimaProcedencia + ", Próximo Destino: " + proximoDestino +
               "\nMotivo da Viagem: " + motivoViagem + ", \nMeio de Transporte: " + meioTransporte;
    }
}

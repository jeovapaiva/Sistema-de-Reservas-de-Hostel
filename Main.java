import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar os clientes, quartos e reservas
        List<Cliente> clientes = new ArrayList<>();
        List<Quarto> quartos = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();

        // Criando alguns quartos
        quartos.add(new Quarto(101, 8, 50.0));
        quartos.add(new Quarto(102, 8, 50.0));
        quartos.add(new Quarto(103, 8, 50.0));
        quartos.add(new Quarto(104, 8, 50.0));
        quartos.add(new Quarto(105, 8, 50.0));
        quartos.add(new Quarto(201, 4, 100.0));
        quartos.add(new Quarto(202, 4, 100.0));
        quartos.add(new Quarto(203, 4, 100.0));
        quartos.add(new Quarto(204, 4, 100.0));
        quartos.add(new Quarto(205, 4, 100.0));


        System.out.println("Bem-vindo ao sistema de reserva de hostel!");
        
        // Loop principal
        while (true) {
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            if (opcao == 1) {
                // Menu Cliente
                while (true) {
                    System.out.println("\nMenu Cliente");
                    System.out.println("1. Cadastrar cliente");
                    System.out.println("2. Mostrar quartos disponíveis");
                    System.out.println("3. Fazer uma reserva");
                    System.out.println("4. Listas de quartos e ocupação");
                    System.out.println("5. Sair");
                    System.out.print("\nEscolha uma opção: ");
                    int opcaoCliente = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (opcaoCliente) {
                        case 1:
                            // Cadastro de cliente
                            System.out.print("Digite o nome completo: ");
                            String nomeCompleto = scanner.nextLine();
    
                            System.out.print("Digite o email: ");
                            String email = scanner.nextLine();
    
                            System.out.print("Digite o telefone fixo ou celular: ");
                            String telefone = scanner.nextLine();
    
                            System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
                            String dataNascimentoStr = scanner.nextLine();
                            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
    
                            System.out.println("Sexo:");
                            System.out.println("1. Masculino\n2. feminino");
                            int sexoOpcao = scanner.nextInt();
                            scanner.nextLine();
                            String sexoInformar = switch (sexoOpcao) {
                                case 1 -> "Masculino";
                                case 2 -> "Feminino";
                                default -> "Outros";
                            };
    
                            System.out.print("Digite a empresa onde trabalha: ");
                            String empresa = scanner.nextLine();
    
                            System.out.print("Digite a profissão: ");
                            String profissao = scanner.nextLine();
    
                            System.out.print("Digite a nacionalidade: ");
                            String nacionalidade = scanner.nextLine();
    
                            System.out.print("Digite a identidade: ");
                            String identidade = scanner.nextLine();
    
                            // Durante o cadastro do cliente:
                            System.out.print("Digite o CPF: ");
                            String cpf = scanner.nextLine().trim();  // Usando .trim() para limpar o CPF
    
    
                            System.out.print("Digite o endereço residencial: ");
                            String enderecoResidencial = scanner.nextLine();
    
                            System.out.print("Digite a cidade: ");
                            String cidade = scanner.nextLine();
    
                            System.out.print("Digite o estado: ");
                            String estado = scanner.nextLine();
    
                            System.out.print("Digite o país: ");
                            String pais = scanner.nextLine();
    
                            System.out.print("Digite o CEP: ");
                            String cep = scanner.nextLine();
    
                            System.out.print("Digite a última procedência: ");
                            String ultimaProcedencia = scanner.nextLine();
    
                            System.out.print("Digite o próximo destino: ");
                            String proximoDestino = scanner.nextLine();
    
                            System.out.println("Motivo da viagem:");
                            System.out.println("1. Lazer\n2. Negócios\n3. Congresso\n4. Saúde\n5. Estudos\n6. Compras\n7. Outros");
                            int motivoOpcao = scanner.nextInt();
                            scanner.nextLine(); // Consumir a linha nova
                            String motivoViagem = switch (motivoOpcao) {
                                case 1 -> "Lazer";
                                case 2 -> "Negócios";
                                case 3 -> "Congresso";
                                case 4 -> "Saúde";
                                case 5 -> "Estudos";
                                case 6 -> "Compras";
                                default -> "Outros";
                            };
                        
                            System.out.println("Meio de transporte:");
                            System.out.println("1. Automóvel\n2. Ônibus\n3. Motocicleta\n4. Outros");
                            int transporteOpcao = scanner.nextInt();
                            scanner.nextLine(); // Consumir a linha nova
                            String meioTransporte = switch (transporteOpcao) {
                                case 1 -> "Automóvel";
                                case 2 -> "Ônibus";
                                case 3 -> "Motocicleta";
                                default -> "Outros";
                            };
    
                            // Criar o objeto Cliente
                            Cliente novoCliente = new Cliente(nomeCompleto, email, telefone, dataNascimento, sexoInformar, 
                                                           empresa, profissao, nacionalidade, identidade, cpf, 
                                                           enderecoResidencial, cidade, estado, pais, cep, 
                                                           ultimaProcedencia, proximoDestino, motivoViagem, meioTransporte);
    
                            // Adicionar o cliente à lista de clientes
                            clientes.add(novoCliente);
                        
                            System.out.println("Cliente cadastrado com sucesso!\n");
                            break;
                        case 2:
                            // Mostrar quartos disponíveis
                            System.out.println("\nQuartos disponíveis:");
                            for (Quarto quarto : quartos) {
                               if (quarto.isDisponivel()) {
                                   System.out.println(quarto);
                                }
                        }
                        break;
    
                        case 3:
                        // Fazer uma reserva
                            System.out.print("Digite o CPF do cliente: ");
                            String cpfCliente = scanner.nextLine().trim(); // Mudança para CPF
                            Cliente clienteEncontrado = null;
                        
                        // Buscar o cliente pelo CPF
                            for (Cliente c : clientes) {
                            if (c.getCpf().equals(cpfCliente)) { // Alteração: buscando pelo CPF
                                clienteEncontrado = c;
                                break;
                                }
                            }
                    
                            if (clienteEncontrado == null) {
                                System.out.println("Cliente não encontrado. Cadastre o cliente primeiro.");
                                break;
                            }
                    
                        // Mostrar os quartos disponíveis
                            System.out.println("Escolha um quarto disponível pelo número:");
                            for (Quarto quarto : quartos) {
                                if (quarto.isDisponivel()) {
                                    System.out.println(quarto);
                                }
                            }
                      
                            int numeroQuarto = scanner.nextInt();
                            Quarto quartoEscolhido = null;
                        
                        // Buscar o quarto pelo número
                            for (Quarto quarto : quartos) {
                                if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                                   quartoEscolhido = quarto;
                                   break;
                                }
                            }
                    
                            if (quartoEscolhido == null) {
                                System.out.println("Quarto inválido ou indisponível.");
                                break;
                            }
                    
                            System.out.print("Por quantos dias deseja reservar? ");
                            int dias = scanner.nextInt();
                    
                        // Criar a reserva
                            Reserva reserva = new Reserva(clienteEncontrado, quartoEscolhido, dias);
                            reservas.add(reserva);
                    
                        // Marcar o quarto como indisponível
                            quartoEscolhido.reservar();
                    
                            System.out.println("Reserva feita com sucesso!");
                            System.out.println(reserva);
                            break;
                    
                        case 4:
                            System.out.println("Saindo do menu Cliente...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }

                    if (opcaoCliente == 4) {
                        break; // Sai do loop do menu Cliente
                    }
                }
            } else if (opcao == 2) {
                // Menu Administrador
                while (true) {
                    System.out.println("\nMenu Administrador");
                    System.out.println("1. Mostrar quartos disponíveis");
                    System.out.println("2. Mostrar reservas");
                    System.out.println("3. Mostrar lista de clientes");
                    System.out.println("4. Cadastrar senha de 3 dígitos");
                    System.out.println("5. Sair");
                    System.out.print("\nEscolha uma opção: ");
                    int opcao2 = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (opcao2) {
                        case 1:
                            // Mostrar quartos disponíveis
                            int totalQuartos = quartos.size();
                            int quartosDisponiveis = 0;
                            int camasOcupadas = 0;
                        
                            for (Quarto quarto : quartos) {
                                if (quarto.isDisponivel()) {
                                    quartosDisponiveis++;
                                }
                                camasOcupadas += quarto.getCamasOcupadas();
                            }
                        
                            System.out.println("Total de quartos: " + totalQuartos);
                            System.out.println("Quartos disponíveis: " + quartosDisponiveis);
                            System.out.println("Total de camas ocupadas: " + camasOcupadas);
                            break;
                        case 2:
                            // Mostrar reservas
                            System.out.println("\nReservas feitas:");
                            for (Reserva r : reservas) {
                                System.out.println(r);
                            }
                            break;
                        case 3:
                            // Mostrar lista de clientes
                            System.out.println("\nMostrar lista de clientes:");

                            if (clientes.isEmpty()) {
                            System.out.println("Nenhum cliente registrado.");
                            } else {
                            for (Cliente cliente : clientes) {
                            // Imprime cada cliente 
                               System.out.println(cliente);
                               }
                            }  
                            break;
                        case 4:
                            System.out.println("Digite a senha de 3 dígitos para cada quarto:");

                            // Loop para pedir a senha de cada quarto na lista estática
                            for (Quarto quarto : quartos) {
                                System.out.println("Quarto " + quarto.getNumero() + ":");
                                String senha = scanner.nextLine().trim();
                    
                            // Verificar se a senha tem exatamente 3 dígitos
                            while (senha.length() != 3 || !senha.matches("\\d{3}")) {
                                System.out.println("Senha inválida. A senha deve ter exatamente 3 dígitos. Tente novamente:");
                                senha = scanner.nextLine().trim();
                            }
                    
                            // Atribuir a senha ao quarto
                            quarto.setSenhaArmario(senha);
                            System.out.println("Senha para o quarto " + quarto.getNumero() + " cadastrada com sucesso!");
                            }
                            break;
                        case 5:
                            System.out.println("Saindo do menu Administrador...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }

                    if (opcao2 == 5) {
                        break; // Sai do loop do menu Administrador
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}


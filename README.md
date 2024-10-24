






PEX1263 - PROJETO DETALHADO DE SOFTWARE



Relatório de Levantamento de Requisitos para o Sistema de Reservas de Hostel

Introdução

Este relatório detalha o processo de levantamento de requisitos para o desenvolvimento de um sistema de reservas para um hostel e pousadas. O sistema visa modernizar e automatizar as operações do hostel/pousada, substituindo o controle manual de reservas e chaves por um sistema eletrônico eficiente e de fácil uso. As informações foram obtidas por meio de reuniões, entrevistas com os funcionários e donos do hostel, além de pesquisas com os clientes para entender melhor suas expectativas e necessidades.

Conhecimento Inicial sobre a pousada

A pousada já possui um sistema de reservas manual e busca uma solução moderna que permita:

    • Cadastro de hóspedes e gerenciamento de reservas: O sistema deve possibilitar que tanto os funcionários quanto os clientes façam reservas online, visualizem quartos disponíveis e façam o cadastro dos hóspedes com informações detalhadas.
    • Geração de senhas automáticas para armários: O hostel utiliza armários para guardar chaves dos quartos. Cada armário é protegido por uma senha, que atualmente é gerada manualmente. O sistema deve automatizar esse processo, gerando senhas eletrônicas e facilitando a liberação de chaves para os clientes após a confirmação do pagamento.

Primeira Reunião: Entrevista Inicial

Formato:

Online, com duração de 45 a 60 minutos. Participaram da reunião o dono do hostel e a equipe de desenvolvimento.

Roteiro de Perguntas:

Objetivo principal do sistema: Qual é a necessidade principal que o sistema deve atender? Usuários do sistema: O sistema será utilizado apenas por funcionários ou os clientes também poderão acessá-lo?

Formato do sistema: Há uma preferência pelo formato do sistema? (web, mobile, desktop)


Respostas das perguntas feitas ao dono:

Qual é a necessidade principal que o sistema deve atender? São 3 problemas principais, sendo: O atendimento 24h (atualmente são 11h de atendimento), a eliminação de erros e unificação na hora do cadastro e fator econômico, sendo que um atendimento 24h irá demandar 3 turnos, com a necessidade de pelo menos 4 funcionários para essa operação.
O sistema será utilizado apenas por funcionários ou os clientes também poderão acessá-lo?
O principal objetivo e de o cliente ter acesso direto na plataforma.
 Há uma preferência pelo formato do sistema? (web, mobile, desktop) A uma preferencia para um sistema mobile.
 

Objetivo da Reunião:

    • Entender as principais necessidades do hostel/pousada e como o sistema atual é utilizado.
    • Identificar quais funcionalidades são prioritárias.
    • Avaliar o escopo do projeto e as tecnologias necessárias.

Análise de Informações

Questionário:

Foi elaborado um questionário online com 10 questões que abordavam:

    • Desafios do sistema atual: Perguntas sobre dificuldades enfrentadas no controle de reservas e no gerenciamento de quartos.
    • Expectativas para o novo sistema: Coletar informações sobre as funcionalidades desejadas, como a automação da geração de senhas e a visualização de quartos disponíveis.
    • Gerenciamento de senhas dos armários: Como o processo é realizado atualmente e como ele poderia ser otimizado no novo sistema.

Participantes:

O dono da pousada e os funcionários responsáveis pela administração.
Duração:
10 a 15 minutos, para os funcionários e cerca de 2h com o dono.

Objetivo do Questionário:

Compreender os desafios enfrentados pela equipe na utilização do sistema atual e identificar as expectativas em relação ao novo sistema, especialmente no que se refere à automação e eficiência.

Roteiro de Perguntas:

Confirmação de funcionalidades: O sistema será acessado por funcionários e clientes via web? Deve funcionar offline em caso de falha de internet?
Gerenciamento de quartos: Como são gerenciados os quartos no sistema atual? Há dificuldades na inserção de informações dos hóspedes?
Fluxo de reserva: Como o cliente faz a escolha do quarto? O sistema gera automaticamente uma senha para o armário? Como o pagamento é confirmado?
Informações dos clientes: Quais informações são necessárias para cada reserva? Alguma dessas informações pode ser simplificada?
Notificações: Como a equipe gostaria de receber notificações sobre a ocupação dos quartos? Automação das senhas: Atualmente, as senhas são geradas manualmente. Gostariam de automatizar esse processo?

Relatórios: Que tipo de relatórios seriam úteis? Relatórios de ocupação mensal, hóspedes frequentes, entre outros?

Objetivo da Reunião:

Coletar informações detalhadas sobre o funcionamento diário do hostel, os processos manuais envolvidos e as expectativas da equipe para o novo sistema.

Análise do Procedimento no Hostel/pousada

Visita ao Hostel/pousada:

Após a coleta inicial de informações, foi realizada uma visita ao hostel/pousada para observar o processo atual de reservas e gerenciamento de quartos. Durante a visita, foram analisados:

    • Processo de entrega de chaves: Observação do método manual utilizado para gerar e entregar as chaves aos hóspedes.
    • Controle de reservas e ocupação: Análise de como a equipe controla a ocupação dos quartos e gerencia as reservas.
    • Distribuição de senhas dos cadeados: Observação de como as senhas dos armários são geradas e entregues aos hóspedes.

Análise:

A visita confirmou que há diversas oportunidades de automação no processo, especialmente na geração de senhas e no controle de reservas. O método atual, totalmente manual, é sujeito a falhas e ineficiências, causando prejuízos e baixa receita pelos quartos ociosos.
Solução Proposta
Com base nas informações coletadas, foi proposta a seguinte solução para o sistema de reservas do hostel/pousada:

Funcionalidades Principais:

Cadastro de Hóspedes:

        ◦ Informações detalhadas, como nome, CPF, nacionalidade, endereço e contato etc.
Controle de Quartos e Ocupação:

        ◦ Exibição em tempo real dos quartos disponíveis.
        ◦ Controle da ocupação e histórico de reservas.
Geração Automática de Senhas:

        ◦ Automação completa do processo de geração de senhas para os armários, que serão liberadas após a confirmação do pagamento.
Reservas Online:

        ◦ Os clientes poderão visualizar quartos disponíveis, fazer reservas, e receber a senha eletrônica para o armário diretamente pelo sistema.
Relatórios Mensais:

        ◦ Relatórios de ocupação dos quartos.
        ◦ Informações sobre hóspedes frequentes e estatísticas sobre a utilização do hostel/pousada.

Levantamento de Informações

Forma de Apresentar e Levantar Informações

O levantamento de informações para o desenvolvimento do aplicativo de gerenciamento de reservas para a pousada foi realizado por meio de um questionário escrito composto de 10 questões. O objetivo dessa pesquisa foi entender melhor as necessidades e expectativas dos clientes em relação ao uso de tecnologia no atendimento e reserva de hospedagens, com foco na implementação de chaves eletrônicas e reservas automatizadas.

Local de Aplicação

A pousada possui um restaurante onde a pesquisa foi realizada. Foi nesse ambiente que os questionários foram apresentados aos clientes que estavam hospedados. Para respeitar as regras da pousada, que incluem o princípio de não incomodar o hóspede durante a estadia, a abordagem direta aos hóspedes foi evitada.

Abordagem

A solução encontrada foi a confecção de 200 folhetos contendo as 10 questões sobre o aplicativo, que foram divididos em 5 lotes de 40 questionários cada. Esses folhetos foram distribuídos em cinco mesas do restaurante da pousada, juntamente com um lápis, permitindo que os hóspedes tivessem acesso ao questionário de forma discreta e sem qualquer pressão para respondê-lo.
Interação com os Hóspedes
Para que os hóspedes tomassem conhecimento da pesquisa, os garçons foram orientados a mencionar a existência do questionário ao entregar o cardápio. Dessa forma, os hóspedes tinham a liberdade de decidir se queriam ou não participar, sem sentir qualquer tipo de obrigação. O ambiente de restaurante foi escolhido por ser um local em que os hóspedes estavam relaxados, o que aumentaria as chances de participação voluntária.

Acordo com o Estabelecimento

Antes de iniciar a pesquisa, foi necessário conversar com o dono da pousada para garantir que todos os aspectos da abordagem estivessem de acordo com as normas do estabelecimento. Após uma conversa produtiva, o dono concordou com a metodologia proposta, permitindo que a pesquisa fosse realizada de forma suave e respeitosa para com os hóspedes.


Modelo do folheto:

Os folhetos foram passados para o formulário do google, um a um. Link abaixo.
https://docs.google.com/forms/d/16wjBvHwxRdQrKtDObNe1Z- uZBGmqyg_f9AMzEC3hfQM/edit?pli=1


Pergunta	Tipo de Resposta

    1 Como você costuma fazer sua reserva em um hostel/pousada?
    
    2 Você preferiria fazer a reserva de forma online, caso estivesse disponível?
    
    3 O que mais lhe agradaria em um sistema online de reservas?
    

    4 Quais recursos você considera essenciais em um sistema de reservas online? Múltipla escolha ( )Telefone ( )Presencial ( )Online via e-mail (  )Outro ( )Sim	( )Não

Pergunta aberta

Múltipla escolha: ( )Pagamento online ( )Escolha de quarto ( )Visualização de disponibilidade
( )Outro

    5 Você se sente confortável em realizar pagamentos online? ( )Sim	( )Não

    6 Você gostaria de receber a senha do armário ( )Sim	( )Não diretamente após a confirmação da reserva?
    
    7 Com que frequência você reserva hospedagem em hostels?Múltipla escolha:	( )Frequentemente ( )Ocasionalmente ( )Raramente
    
    8 Qual é sua maior dificuldade no processo de Pergunta aberta reserva atualmente?
    
    9 Você utiliza mais o celular ou o computador Múltipla escolha: ( )Celular ( )Computador para realizar suas reservas?
    
    10 Quais métodos de pagamento online você prefere utilizar? ( )Ambos Múltipla escolha: ( )Cartão de crédito ( )Cartão de débito ( )PIX ( )PayPal ( )Outro
Relatório sobre Pesquisa de Requisitos para Sistema de Reservas de Hostel e pousada
Este relatório apresenta os resultados de uma pesquisa realizada com 112 participantes sobre o processo de reservas em hostel/pousada e suas preferências em relação a um sistema de reservas online. O objetivo desta pesquisa foi compreender como os usuários fazem reservas, suas dificuldades e expectativas em relação à automação do processo.

    1. Como você costuma fazer sua reserva em um hostel?
    
Dos 112 participantes que responderam à pesquisa, a maioria absoluta (73,2%) revelou que prefere realizar suas reservas por telefone, demonstrando a predominância de métodos mais tradicionais. Uma porcentagem menor, 15,2%, afirmou que faz suas reservas presencialmente, enquanto 9,8% dos participantes utiliza o e-mail para esse fim.
Esses dados indicam uma preferência considerável por métodos não online, o que sugere uma oportunidade para modernização do processo de reservas, especialmente considerando a aceitação crescente de sistemas online em outros setores.
        ◦ Telefone: 82 (73,2%)
        ◦ Presencial: 17 (15,2%)
        ◦ Online via e-mail: 11 (9,8%)

    2. Você preferiria fazer a reserva de forma online, caso estivesse disponível?
    
A maioria dos participantes (73,9%) afirmou que preferiria realizar suas reservas online, caso essa opção estivesse disponível, enquanto 26,1% demonstrou preferência por continuar utilizando métodos tradicionais, como telefone ou presencial. Isso demonstra um alto nível de interesse em migrar para um sistema online, o que reforça a importância de implementar um sistema de reservas digital.
        ◦ Sim: 82 (73,9%)
        ◦ Não: 29 (26,1%)

    3. Quais recursos você considera essenciais em um sistema de reservas online?
    
Entre os recursos mais valorizados em um sistema de reservas online, os mais mencionados foram:
        ◦ Pagamento online: 76 respostas (67,9%)
        ◦ Escolha de quarto: 74 respostas (66,1%)
        ◦ Visualização de disponibilidade: 33 respostas (29,5%)
Esses resultados mostram que os participantes esperam que o sistema online proporcione não apenas a facilidade de escolher o quarto e visualizar a disponibilidade, mas também a capacidade de realizar o pagamento diretamente pela plataforma. Isso é um forte indicativo de que a implementação de um sistema robusto e fácil de usar, que integre essas funcionalidades, é crucial para atender às expectativas dos usuários.

    4. Você se sente confortável em realizar pagamentos online?
    
Quando questionados sobre o conforto em realizar pagamentos online, 78,9% dos participantes afirmaram se sentir confortáveis com essa forma de pagamento, enquanto 21,1% ainda têm receios.
Esse dado indica que a grande maioria já está familiarizada com o uso de transações online, um fator essencial para a implementação bem-sucedida de um sistema de reservas automatizado.
        ◦ Sim: 86 (78,9%)
        ◦ Não: 23 (21,1%)

    5. Você gostaria de receber a senha do armário diretamente após a confirmação da reserva?
    
A maioria dos respondentes (80,4%) gostaria de receber a senha do armário imediatamente após a confirmação da reserva, demonstrando a necessidade de automação não só no processo de reservas, mas também na entrega das chaves e gerenciamento dos armários.
        ◦ Sim: 90 (80,4%)
        ◦ Não: 22 (19,6%)

    6. Com que frequência você reserva hospedagem em hostels/pousadas?
    
A pesquisa também abordou a frequência com que os participantes realizam reservas em hostels/pousadas. As respostas indicaram que:
        ◦ 17,9% reservam frequentemente.
        ◦ 38,4% reservam ocasionalmente.
        ◦ 43,8% raramente reservam.
Esses dados mostram que, embora uma parte considerável dos usuários faça reservas com certa regularidade, há uma parcela significativa que utiliza os serviços de hostels/pousadas esporadicamente. Um sistema eficiente pode ajudar a captar tanto os usuários regulares quanto aqueles que fazem reservas de forma mais esporádica.

    7. Você utiliza mais o celular ou o computador para realizar suas reservas?
    
Em relação aos dispositivos utilizados para reservas, 47,3% dos participantes afirmaram utilizar ambos, celular e computador, para esse fim. Outros 34,8% usam principalmente o computador, enquanto 17,9% preferem realizar as reservas pelo celular. Estes dados destacam a importância de garantir que o sistema de reservas seja otimizado para ambos os dispositivos, especialmente para celulares, dada a crescente tendência de uso de dispositivos móveis para transações online.
        ◦ Celular: 53 (47,3%)
        ◦ Computador: 39 (34,8%)
        ◦ Ambos: 20 (17,9%)

    8. Quais métodos de pagamento online você prefere utilizar?
    
Quando questionados sobre suas preferências de pagamento, os participantes indicaram uma clara preferência por métodos digitais modernos. O Pix foi o mais citado, com 79,5% de preferência, seguido de perto pelo cartão de crédito (70,5%). Cartão de débito e PayPal também foram mencionados, mas em menor proporção.
        ◦ Pix: 89 (79,5%)
        ◦ Cartão de crédito: 79 (70,5%)
        ◦ Cartão de débito: 43 (38,4%)
        ◦ PayPal: 41 (36,6%)
Esses dados mostram que é fundamental incluir múltiplas opções de pagamento online, com destaque para o Pix, que tem se popularizado cada vez mais no Brasil devido à sua rapidez e facilidade de uso.

Conclusão

Os dados coletados mostram que há uma demanda significativa por um sistema de reservas online em hostels e pousadas. A maioria dos entrevistados já faz uso de meios digitais para reservas em outros setores e demonstrou disposição para migrar para esse formato no contexto de hostels/pousadas, desde que o sistema ofereça funcionalidades como pagamento online, escolha de quarto e visualização de disponibilidade.
A pesquisa também revelou a importância de garantir a segurança e a confiabilidade no processo de pagamento online, algo que já é aceito por grande parte dos usuários. Além disso, a automação do envio de senhas para os armários foi uma funcionalidade amplamente requisitada, indicando a necessidade de simplificar e agilizar esse aspecto da hospedagem.
Com base nos resultados da pesquisa, é evidente que a criação de um sistema de reservas online não apenas aumentaria a eficiência do hostel/pousada, mas também proporcionaria uma experiência mais prática e satisfatória para os usuários. O sucesso desse sistema depende da implementação das funcionalidades sugeridas, do suporte a múltiplos dispositivos e da oferta de métodos de pagamento online amplamente utilizados, como o Pix.
O levantamento de informações e a análise do processo atual do hostel demonstraram a necessidade de uma solução tecnológica moderna que otimize o gerenciamento de reservas e a distribuição de chaves. A proposta de sistema visa atender essas demandas com funcionalidades como geração automática de senhas, reservas online, e controle de quartos em tempo real. A pesquisa com os clientes e o diálogo com o dono do hostel ajudaram a moldar o projeto para garantir que o sistema atenda tanto às necessidades operacionais quanto às expectativas dos usuários finais.

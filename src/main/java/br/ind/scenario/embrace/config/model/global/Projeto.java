package br.ind.scenario.embrace.config.model.global;

import br.ind.scenario.embrace.config.model.classes.ReferenciaGuiaDriverBidirecional;
import br.ind.scenario.embrace.config.model.interfaces.ItemTreeView;
import br.ind.scenario.embrace.config.model.sensispacks.DadosPessoais;
import br.ind.scenario.embrace.config.model.sensispacks.NetControl;
import br.ind.scenario.embrace.config.model.sensispacks.OpcoesProjeto;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Projeto {

//    _xml: TXMLDocument;

    private DadosPessoais dadosClientes;
    private DadosPessoais dadosRevenda;
    private NetControl netControl;
    private int onlineOff;
    private int idAtual;
    private Date dataCriacao;
    private Date dataAlteracao;
    private Node moduloDiaNoite;
    private List<ItemTreeView> listaItensTreeView;
    private List<Ambiente> listaAmbientes;
    private List<ItensProjeto> listaItensProjetos;
//    _listaNosCarregar: TList<IXMLNode>;
    private String guid;
    private int versao;
    private int tempoOnlineRCC;
    private String versaoConfig;
    private Map<Integer, Link> mapaIdLink;
    private List<ReferenciaGuiaDriverBidirecional> listaDriversBidirecionais;
    private String xmlComparacao;
    private boolean usaCentral;
//    _atualizacao: IAtualizacaoProgresso;
    private boolean gerarIntegracao;
//    private TipoIntegracao tipoIntegracao;
    private boolean reiniciarContador;
    private Node projetoCompleto;
    private String macInstalacao;

    private String versaoXML;

    private Ambiente macroAtividades;
    private boolean _interface;
    private Node pastaProjetosGraficos;
    private String senhaProjetoVirtual;
    private boolean modoCompatibilidade;
    private boolean nomeGraficoCompleto;
    private boolean alexaIngles;

    private boolean visualizarCircuito;

    private OpcoesProjeto Opcoes;

    /*
      TProjeto = class(TNode, INode, IItensContainer)
      private

        procedure AbrirDriversLista(ATipoDriver: ETipoDriver; AArquivos: TStringList; ADiretorio: string);
        procedure CarregarDriversProjeto;
        procedure RenomearItem(const AItem: IItemTreeView);
        procedure CarregarDadosPessoais(AXml: IXMLNode; var ADadosPessoais: TDadosPessoais);
        procedure CarregarDadosNetControl(AXml: IXMLNode);

        procedure SalvarDadosPessoais(AXml: IXMLNode; ANomeNode: string; ADadosPessoais: TDadosPessoais);
        procedure SalvarDadosNetControl(AXml: IXMLNode);
        procedure CarregarItensProjeto(AXml: IXMLNode; AAtualizacao: IAtualizacaoProgresso);
        procedure CarregarDadosProjetos(AXml: IXMLNode);
        procedure CarregarModuloDiaNoite(AXml: IXMLNode);
        procedure OnProgressoZip(Sender: TObject; Progress: Double; Operation: TZFProcessOperation; ProgressPhase: TZFProgressPhase; var Cancel: Boolean);

        // procedure ConverterXMLDriverZIP(caminho: string; extDriver: string; listaDrivers: TStringList);
        procedure SetTempoOnlineRCC(const Value: Integer);
        function GetDadosClienteNome: string;
        function GetDadosClienteCidade: string;
        function GetDadosClienteEndereco: string;
        function GetDadosClienteFone: string;
        function GetDadosClienteCelular: string;
        function GetDadosClienteFoneComercial: string;
        function GetInterfacePasta: Boolean;

        procedure SetDadosClienteNome(const Value: string);
        procedure SetDadosClienteCidade(const Value: string);
        procedure SetDadosClienteEndereco(const Value: string);
        procedure SetDadosClienteFone(const Value: string);
        procedure SetDadosClienteCelular(const Value: string);
        procedure SetDadosClienteFoneComercial(const Value: string);

        function GetDadosRevendaCidade: string;
        function GetDadosRevendaEndereco: string;
        function GetDadosRevendaFone: string;
        function GetDadosRevendaNomeDaEmpresa: string;
        function GetDadosRevendaNomeDoFuncionario: string;

        procedure SetDadosRevendaCidade(const Value: string);
        procedure SetDadosRevendaEndereco(const Value: string);
        procedure SetDadosRevendaFone(const Value: string);
        procedure SetDadosRevendaNomeDaEmpresa(const Value: string);
        procedure SetDadosRevendaNomeDoFuncionario(const Value: string);

        // function GetNetControlIP: string;
        function GetNetControlPorta: Integer;
        // procedure SetNetControlIP(const Value: string);
        procedure SetNetControlPorta(const Value: Integer);
        function GetOnLineOff: Int64;
        procedure SetOnLineOff(const Value: Int64);
        function GetItemTreeView(const AIndice: Integer): IItemTreeView;
        function GetMacroAtividades: IItensContainer;

        procedure InserirListaAmbiente(AAmbiente: TAmbiente; AIndex: Integer);
        procedure RemoverAmbiente(AAmbiente: TAmbiente);
        procedure InserirListaItensProjeto(AItemProjeto: TItensProjeto);
        procedure RemoverItensProjeto(AItemProjeto: TItensProjeto);
        function GetUsaCentral: Boolean;
        procedure SetUsaCentral(const Value: Boolean);
        function GetNecessitaOtimizacao: Boolean;

        procedure SetNome(const Value: string); override;
        procedure SetGerarIntegracao(const Value: Boolean);
        procedure SetTipoIntegracao(const ATipoIntegracao: ETipoIntegracao);
        // function GetNetControlMAC: string;
        // procedure SetNetControlMac(const Value: string);
        procedure SetSenhaProjeto(const Value: string);
        procedure SetNomeGraficoCompleto(const Value: Boolean);

        procedure SetAlexaIngles(const Value: Boolean);
        function GetVisualizarCircuito: Boolean;
        procedure SetVisualizarCircuito(const Value: Boolean);
        function GetVersaoXML: string;
        procedure SetProjetoUsuario(const Value: TNode);
        function GetIDLeitura: Integer;
        procedure SetIdAtual(const Value: Integer);
      protected
        function GetNomeNode: string; override;
        function GetNomeTitulo: string; override;
      public

        procedure CarregarAmbientes(AXml: IXMLNode; AAtualizacao: IAtualizacaoProgresso);
        procedure AtualizarCentralProjeto();
        constructor Create; overload;
        destructor Destroy; override;
        constructor Create(AArquivoXML: TXMLDocument; AOpcoes: TOpcoesProjeto; AAtualizacao: IAtualizacaoProgresso); overload;
        procedure CriarConexoes(AProjeto: TProjeto); override;

        function RecuperarItemPorID(const AId: Integer): TNode;
        function RecuperarAmbientePorID(const AId: Integer): TAmbiente;
        function RecuperarItemPorEndereco(const AEndereco: Integer; AIP: string): TNode;
        function RecuperarItemPorIP(AIP: string): TNode;

        function RecuperarPrimeiroAmbiente(ALeft, ARigth: Integer): Integer; overload;
        function RecuperarPrimeiroAmbiente: TAmbiente; overload;
        // function InserirDriver(ADriver: TReferenciaGuiaDriver): TReferenciaGuiaDriver;
        procedure AplicarAlteracoesDriverProjeto(ADriver: TReferenciaGuiaDriver);

        function CountDriversBidirecionais: Integer;
        function RecuperarDriverBidirecional(AIndice: Integer): TReferenciaGuiaDriverBidirecional;

        function DefinirIPGerenciadorRedePorMAC(AMAC, AIP: TBytes): Boolean;

        procedure RemoverDriver(ADriver: TReferenciaGuiaDriver);
        function RecuperarDriver(ATipo: ETipoDriver; AFabricante, AModelo, ATipoDispositivo, AVersao: string): TReferenciaGuiaDriver;
        function ExisteDispositivoDriver(ADriver: TReferenciaGuiaDriver): Boolean;

        procedure InserirIdLink(const AId: Integer; const ALink: TLink);

        procedure GetListaEspecificaContainers(const ALista: TList<IItensContainer>);
        function RecuperarPasta(const AId: Integer): IItensContainer;

        procedure GetListaEspecificaInterface(AInterface: TGUID; ALista: TList<IInterface>);
        procedure GetListaEspecificaAmbiente(ALista: TList<TAmbiente>);
        procedure GetListaEspecificaItemAmbiente(AClasse: TClass; ALista: TList<TItensAmbiente>); overload;
        function GetModeloCentralProjeto: TClass;
        procedure GetListaEspecificaItemAmbiente(AClasse: string; ALista: TList<TItensAmbiente>); overload;
        procedure GetListaEspecificaItemProjeto(AClasse: TClass; ALista: TList<TItensProjeto>);
        function GerarArquivosCentral(AAtualizacao: IAtualizacaoProgresso; AProgresso: TZFProgressEvent; ACenas, AEventos, AProjetoGrafico, AUsuarios, ANotificacao,
          AOfereceuJanela: Boolean): Boolean;
        function ListaAmbienteCount: Integer;
        function GetAmbiente(AIndex: Integer): TAmbiente;
        function ProcurarDispositivo(AId: Integer; AClasse: ETipoClasse = tcNone; AOwnerID: Integer = -1; AIndicador: Boolean = False; AClasseOwner: ETipoClasse = tcNone): TNode;
        function ProcurarLink(AOwnerID: Integer; ATipoLink: ETipoLink; ATipoOwner: ETipoClasse; AIndice: Integer = -1): TLink;
        function GetIdAtual: Integer;
        function GetItemAmbienteByNome(ANome: string; AClasse: TClass): TItensAmbiente;
        function GetItemProjetoByNome(ANome: string; AClasse: TClass): TItensProjeto;
        function NovoAmbiente(AOwner: TNode; ANome: string): TAmbiente;
        function ListaItensProjetoCount: Integer;
        function GetItemProjetoByPos(APosicao: Integer): TItensProjeto;
        function GetItemProjeto(AId: Integer): TItensProjeto;
        function GetAmbienteSalaAutomacao: TAmbiente;
        function ValidaProjeto(AErros: TStringList; ANivelVerificacao: ETipoInconsistencia): Boolean; override;
        function TotalItens: Integer;
        function ListaAmbientes: TList<TAmbiente>;

        function SalvarXML(AXml: TXMLDocument; AAtualizaSalvar: IAtualizacaoProgresso = nil): string; overload;
        function GerarIDProjeto: Integer;

        function PossibilitaInsercao(const AItem: IItemTreeView): Boolean;
        procedure AdicionarItem(const AItem: IItemTreeView; const AIndice: Integer = -1);
        procedure RemoverItem(const AItem: IItemTreeView);
        procedure NotificarMovimentoItemEquipamento(const AItem: TObject);
        procedure NotificarMudancaParaAmbienteGerado(AItemGerado: TNode; ADelecao: Boolean = False);
        procedure NotificarMudancaProjetoGraficoGerado(const AId: Integer = -1);
        procedure AlterarProjetoUsuario(AProjetoVirtual: TNode);
        procedure SalvarIDAtual(AXml: TXMLDocument);

        function TratarProjetoUsuario: string;

        function ContItensTreeView: Integer;
        // function VersaoXML: string;

        property ItemTreeView[const AIndice: Integer]: IItemTreeView read GetItemTreeView;

        property DadosClienteNome: string read GetDadosClienteNome write SetDadosClienteNome;
        property DadosClienteEndereco: string read GetDadosClienteEndereco write SetDadosClienteEndereco;
        property DadosClienteFone: string read GetDadosClienteFone write SetDadosClienteFone;
        property DadosClienteFoneComercial: string read GetDadosClienteFoneComercial write SetDadosClienteFoneComercial;
        property DadosClienteCelular: string read GetDadosClienteCelular write SetDadosClienteCelular;
        property DadosClienteCidade: string read GetDadosClienteCidade write SetDadosClienteCidade;

        property DadosRevendaNomeDaEmpresa: string read GetDadosRevendaNomeDaEmpresa write SetDadosRevendaNomeDaEmpresa;
        property DadosRevendaNomeDoFuncionario: string read GetDadosRevendaNomeDoFuncionario write SetDadosRevendaNomeDoFuncionario;
        property DadosRevendaEndereco: string read GetDadosRevendaEndereco write SetDadosRevendaEndereco;
        property DadosRevendaFone: string read GetDadosRevendaFone write SetDadosRevendaFone;
        property DadosRevendaCidade: string read GetDadosRevendaCidade write SetDadosRevendaCidade;

        // property NetControlIP: string read GetNetControlIP write SetNetControlIP;
        // property NetControMAC: string read GetNetControlMAC write SetNetControlMac;
        property NetControlPorta: Integer read GetNetControlPorta write SetNetControlPorta;
        // property OnLineOff: Int64 read GetOnLineOff write SetOnLineOff;

        property NomeGraficoCompleto: Boolean read _nomeGraficoCompleto write SetNomeGraficoCompleto;
        property DataCriacao: TDateTime read _dataCriacao;
        property DataAlteracao: TDateTime read _dataAlteracao;
        property ModuloDiaNoite: TNode read _moduloDiaNoite;
        property TempoOnlineRCC: Integer read _tempoOnlineRCC write SetTempoOnlineRCC;
        property GUID: string read _guid;
        property Versao: Integer read _versao;
        property VersaoConfig: string read _versaoConfig write _versaoConfig;
        property UsaCentral: Boolean read GetUsaCentral write SetUsaCentral;

        property XMLComparacao: string read _xmlComparacao write _xmlComparacao;
        property VersaoXML: string read GetVersaoXML;
        property MacroAtividades: IItensContainer read GetMacroAtividades;
        property InterfacePasta: Boolean read GetInterfacePasta;
        property NecessitaOtimizacao: Boolean read GetNecessitaOtimizacao;

        property ProjetoUsuario: TNode read _projetoCompleto write SetProjetoUsuario;
        property PastaProjetosGraficos: TNode read _pastaProjetosGraficos;
        property GerarIntegracao: Boolean read _gerarIntegracao write SetGerarIntegracao;
        property TipoIntegracao: ETipoIntegracao read _tipoIntegracao write SetTipoIntegracao;
        property ReiniciarContador: Boolean read _reiniciarContador write _reiniciarContador;
        property SenhaProjetoGrafico: string read _senhaProjetoVirtual write SetSenhaProjeto;
        property ModoCompatibilidade: Boolean read _modoCompatibilidade write _modoCompatibilidade;
        property AlexaIngles: Boolean read _alexaIngles write SetAlexaIngles;
        property VisualizarCircuito: Boolean read GetVisualizarCircuito write SetVisualizarCircuito;
        property IDAtual: Integer read GetIDLeitura write SetIdAtual;
      end;
     */

}

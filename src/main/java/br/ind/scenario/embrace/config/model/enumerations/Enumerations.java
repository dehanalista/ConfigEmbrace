package br.ind.scenario.embrace.config.model.enumerations;

enum TipoClasse {
    tcNone, tcSensor, tcNonDimLoad, tcNode, tcProject, tcAmbiente, tcCena, tcModulo, tcLights, tcMotor, tcBotao, tcM10, tcIPM10, tcPulsador, tcTeclaPulsador,
    tcControladorCortina, tcNulo2, tcNulo3, tcNulo4, tcNulo5, tcTecVirtual, tcIphonePage, tcIphone, tcComando, tcNulo6, tcEvento, tcNulo7, tcRoomControl, tcMultiCarga, tcSensisNet,
    tcNulo8, tcIPM10Sn, tcNulo9, tcNulo10, tcLink, tcVariavel, tcControlVentilador, tcVentilador, tcOnOff, tcMacro, tcHora, tcAlarme, tcDesligaGeral, tcTimerLogico,
    tcDispositivoDriverIR, tcBotaoIR, tcNulo11, tcModuloDiaNoite, tcSensorFoto, tcSavantNet, tcCommandFusionnet, tcNULODispositivoVirtual, tcComponenteVirtual, tcNULOJoinNumber,
    tcDispositivoDriverCamera, tcControladorBanheira, tcDispositivoDriverSerial, tcDispositivoDriverIP, tcDispositivoPml, tcProjetoGrafico, tcTCL2, tcTCL3, tcTCL12, tcMiniRDM,
    tcMiniSDM, tcTCL10, tcIpm10Upg, tcTCLSensor6, tcProjetoGraficoPagina, tcProjetoGraficoGrupo, tcProjetoGraficoVisualizacao, tcProjetoGraficoComponente, tcElementoLogico,
    tcIFSEI, tcTCL1Classic, tcTCL2Classic, tcTCL3Classic, tcTCL10Classic, tcTCL12Classic, tcTCLSensor6Classic, tcIPM10Classic, tcFeedbackLuminarias,
    tcDispositivoDriverBidirecional, tcProjetoGraficoBloco, tcSensorTeto, tcDimmerVirtual, tcAcionador
}

enum TipoNotificaoPastaAmbiente {
    tnpaAlteracaoIndice, tnpaMudancaAmbiente
}

enum TipoLink {
    tlPulsadorSup, tlPulsadorInf, tlModoDormir, tlSendPresenca, tlSendOff, tlSendSleep, tlSensor, tlCanais, tlFeedback, tlEntradasCustom, tlModoAuto, tlTeclados, tlNone,
    tlOpenMomentary, tlCloseMomentary, tlOpenFull, tlCloseFull, tlStop, tlOpenJog, tlCloseJog, tl1Btn, tl2BtnUp, tl2BtnDown, tl1Speed, tl2Speed, tl3Speed, tlSpeedOff,
    tlVentiladores, tlInput, tlToggle, tlOn, tlOff, tlPanico, tlDesabilitaParcial, tlPisca, tlSirene, tlDevicesOff, tlFeedbackPresenca, tlAcionadorDia, tlAcionadorNoite,
    tlAcionadorMadrugada, tlEntradaCanal, tlAguaFria, tlAguaQuente, tlBomba, tlAux1, tlAux2, tlAux3, tlBanheiraCheia, tlSensorMaximo, tlSensorMinimo, tlEncher, tlEsvaziar,
    tlDesligar, tlLimpeza, tlAcionadorAux1, tlAcionadorAux2, tlAcionadorAux3, tlAcionadorBanheiraCheia, tlHidro, tlAcionadorHidro, tlTemperatura, tlFeedbackMaximo,
    tlFeedbackMinimo, tlDigital, tlAnalogico, tlAnalogicoTempo, tlTexto, tlRede, tlLinkPml, tlCanaisClassic, tlCenasClassic, tlSliderRC, tlGravarCenaDiaSM, tlGravarCenaDiaCM,
    tlGravarCenaNoiteSM, tlGravarCenaNoiteCM, tlGravarCenaMadrugadaSM, tlGravarCenaMadrugadaCM, tlGravarCenaDormirSM, tlGravarCenaDormirCM, tlGravarCenaOverride,
    tlGravarCenaCuston, tlML
}

enum TipoIntegracao {
    etiIntegracao1, etiIntegracao2
}

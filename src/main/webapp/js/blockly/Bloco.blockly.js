window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {


  this.cronapi.util.openReport(
  'reports/teste.report', []);
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.reportRomano = function() {
  

  this.cronapi.util.openReport(
  'reports/romano.report', [{ dateFo : null } , { doublelegal : null } , { numerox : null } , { name : null }]);
}

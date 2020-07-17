window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.openRomano = function() {


  this.cronapi.util.openReport(
  'reports/romano.report', [{ dateFo : null } , { doublelegal : null } , { numerox : null } , { name : null } , { verdOrFal : null }]);
}

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {


  this.cronapi.util.openReport(
  'reports/teste.report', []);
}

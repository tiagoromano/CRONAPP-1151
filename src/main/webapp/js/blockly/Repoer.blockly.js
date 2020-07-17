window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Repoer = window.blockly.js.blockly.Repoer || {};

/**
 * Repoer
 */
window.blockly.js.blockly.Repoer.Executar = function() {
 var item;

  this.cronapi.util.openReport(
  'reports/romano.report', [{ dateFo : null } , { doublelegal : null } , { numerox : null } , { name : null }]);
}

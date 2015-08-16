Blockly.JavaScript['do_while_loop'] = function(block) {
  var value_while = Blockly.JavaScript.valueToCode(block, 'while', Blockly.JavaScript.ORDER_ATOMIC);
  var statements_do = Blockly.JavaScript.statementToCode(block, 'do');
  //Fill in do loop with code
  var code = '...';
  return code;
};

Blockly.JavaScript['color_blue'] = function(block) {
  var colour_blue = block.getFieldValue('blue');

  var code = '#3333FF';

  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['color_red'] = function(block) {
  var colour_red = block.getFieldValue('red');

  var code = '#FF3333';

  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['color_green'] = function(block) {
  var colour_green = block.getFieldValue('green');

  var code = '#33FF33';

  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['color_black'] = function(block) {
  var colour_black = block.getFieldValue('black');

  var code = '#000000';

  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['color_white'] = function(block) {
  var colour_white = block.getFieldValue('white');

  var code = '#FFFFFF';

  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['page_text'] = function(block) {
  var text_text = block.getFieldValue('page_text');

  var code = text_text;

  return [code, Blockly.JavaScript.ORDER_NONE];
};
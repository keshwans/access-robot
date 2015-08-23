var delimeter = ',';


/*
* Constants
*/

Blockly.JavaScript['math_number_zero'] = function(block) {
  var text_num = block.getFieldValue('NUM');
  return [text_num, Blockly.JavaScript.ORDER_NONE];
};

/*
* Methods
*/

Blockly.JavaScript['fade_light'] = function(block) {
  var value_light = Blockly.JavaScript.valueToCode(block, 'Light', Blockly.JavaScript.ORDER_ATOMIC);
  var value_times = Blockly.JavaScript.valueToCode(block, 'Times', Blockly.JavaScript.ORDER_ATOMIC);
  var value_length = Blockly.JavaScript.valueToCode(block, 'Length', Blockly.JavaScript.ORDER_ATOMIC);
  var inside_arguments = (value_light + delimeter + value_times + delimeter + value_length).replace(/\(|\)/g,'')
  var code = 'fade( ' + inside_arguments + ') ';
  return code;
};

Blockly.JavaScript['blink_light'] = function(block) {
  var value_light = Blockly.JavaScript.valueToCode(block, 'Light', Blockly.JavaScript.ORDER_ATOMIC);
  var value_times = Blockly.JavaScript.valueToCode(block, 'Times', Blockly.JavaScript.ORDER_ATOMIC);
  var value_length = Blockly.JavaScript.valueToCode(block, 'Length', Blockly.JavaScript.ORDER_ATOMIC);
   var inside_arguments = (value_light + delimeter + value_times + delimeter + value_length).replace(/\(|\)/g,'')
  var code = 'blink( ' + inside_arguments +') ';
  return code;
};

Blockly.JavaScript['stop'] = function(block) {
  var code = 'x' + delimeter;
  return code;
};

Blockly.JavaScript['turn_right'] = function(block) {
  var value_turn_right = Blockly.JavaScript.valueToCode(block, 'turnRight', Blockly.JavaScript.ORDER_ATOMIC);
//  var replaceParens = value_turn_right.replace(/\(|\)/g,'')
  var code = 'tr' + value_turn_right;
  return code;
};

Blockly.JavaScript['turn_left'] = function(block) {
  var value_turn_left = Blockly.JavaScript.valueToCode(block, 'turnLeft', Blockly.JavaScript.ORDER_ATOMIC);
//  var replaceParens = value_turn_left.replace(/\(|\)/g,'')
  var code = 'tl' + value_turn_left;
  return code;
};

//Handles the function that generates the move backward function for the arduino
Blockly.JavaScript['move_backward'] = function(block) {
  var value_backward = Blockly.JavaScript.valueToCode(block, 'backward', Blockly.JavaScript.ORDER_ATOMIC);
//  var replaceParens = value_backward.replace(/\(|\)/g,'')
  var code = 'mb' + value_backward ;

  return code;
};

Blockly.JavaScript['move_forward'] = function(block) {
  var value_forward = Blockly.JavaScript.valueToCode(block, 'forward', Blockly.JavaScript.ORDER_ATOMIC);
//  var replaceParens = value_forward.replace(/\(|\)/g,'');
  var code = 'mf' + value_forward ;
  return code;
};

/*
* Colors
*/

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
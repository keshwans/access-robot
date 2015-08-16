Blockly.Blocks['do_while_loop'] = {
  init: function() {
    this.appendValueInput("while")
        .setCheck("Boolean")
        .setAlign(Blockly.ALIGN_RIGHT)
        .appendField("while");
    this.appendStatementInput("do")
        .setCheck(null)
        .setAlign(Blockly.ALIGN_CENTRE)
        .appendField("do");
    this.setColour(120);
    this.setTooltip('');
    this.setHelpUrl('http://www.example.com/');
  }
};

Blockly.Blocks['color_blue'] = {
  init: function() {
    this.setHelpUrl('http://www.example.com/');
    this.setColour(60);
    this.appendDummyInput()
        .appendField("Blue:")
        .appendField(new Blockly.FieldColour("#3333ff"), "blue");
    this.setOutput(true, "color");
    this.setTooltip('');
  }
};

Blockly.Blocks['color_red'] = {
  init: function() {
    this.setHelpUrl('http://www.example.com/');
    this.setColour(60);
    this.appendDummyInput()
        .appendField("Red:")
        .appendField(new Blockly.FieldColour("#ff3333"), "red");
    this.setOutput(true, "color");
    this.setTooltip('');
  }
};

Blockly.Blocks['color_green'] = {
  init: function() {
    this.setHelpUrl('http://www.example.com/');
    this.setColour(60);
    this.appendDummyInput()
        .appendField("Green:")
        .appendField(new Blockly.FieldColour("#33ff33"), "green");
    this.setOutput(true, "color");
    this.setTooltip('');
  }
};

Blockly.Blocks['color_black'] = {
  init: function() {
    this.setHelpUrl('http://www.example.com/');
    this.setColour(60);
    this.appendDummyInput()
        .appendField("Black:")
        .appendField(new Blockly.FieldColour("#000000"), "black");
    this.setOutput(true, "color");
    this.setTooltip('');
  }
};

Blockly.Blocks['color_white'] = {
  init: function() {
    this.setHelpUrl('http://www.example.com/');
    this.setColour(60);
    this.appendDummyInput()
        .appendField("White:")
        .appendField(new Blockly.FieldColour("#ffffff"), "white");
    this.setOutput(true, "color");
    this.setTooltip('');
  }
};
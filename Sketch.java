import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }


  // Outlines
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  // bottom section 1
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;  
        intY = 303 + intColumn * 10;
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  // Bottom section 2
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 303 + intRow * 10;  
        intY = 303 + intColumn * 10;
        
      if (intRow % 2 != 0) {
        fill(0);
      }
      else {
        fill (225);
      }
      noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Bottom section 3
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 603 + intRow * 10;  
        intY = 303 + intColumn * 10;
        
      if (intColumn % 2 != 0) {
        fill(255);
      }
      else {
        fill (0);
      }
      noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Bottom section 4
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 903 + intRow * 10;  
        intY = 303 + intColumn * 10;
        
      if (intRow % 2 != 0 || intColumn == 0 || intColumn % 2 == 0) {
        fill(0);
      }
      else {
        fill (255);
      }
      noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Top section 5
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 1; intRow <= 30; intRow++){
      for(int intColumn = 1; intColumn <= intRow; intColumn++){
        intX = 3 + (30 - intColumn) * 10;  
        intY = 3 + intRow * 10;
        
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Top section 6
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = 0; intRow <= intColumn; intRow++){
        intX = 303 + intRow * 10;  
        intY = 3 + intColumn * 10;
        
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }

  // Top section 7
  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn <= 30; intColumn++){
      for(int intRow = 0; intRow < intColumn; intRow++){
        intX = 603 + intRow * 10;  
        intY = 3 + (30 - intColumn) * 10;
        
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  // Top section 8
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn <= intRow; intColumn++){
        intX = 903 + intRow * 10;  
        intY = 3 + intColumn * 10;
        
        fill(255);
        rect(intX, intY, 5, 5);
      }
    }
  }
}

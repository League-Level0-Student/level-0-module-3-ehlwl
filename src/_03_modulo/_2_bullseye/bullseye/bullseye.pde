
void setup() {
 
  // set the size of your sketch
  size(500,500);
  for(int i = 10;i>0;i--){
    if (i%2==0){
      int m = i*10;
   fill(256,0,0);
   ellipse(250,250,m,m);
    }
    else{
      int m = i*10;
      fill(0,0,0);
      ellipse(250,250,m,m);
    }
  }
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 
  
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}

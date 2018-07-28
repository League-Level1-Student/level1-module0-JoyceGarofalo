void setup() {
  size(500, 500);
  background(225, 225, 0);
}

void draw() {
  fill(0, 225, 225);
  ellipse(random(500), random(500), 20, 40);
  getWormX(50);
  getWormY(100);
  makeMagical();
  
}

float frequency = .05;
float noiseInterval = PI + 2;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
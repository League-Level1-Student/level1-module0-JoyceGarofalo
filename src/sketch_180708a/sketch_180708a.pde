import ddf.minim.*;
 Minim minim;
 AudioPlayer song;
PImage pictureOfRecord;
void setup(){
  pictureOfRecord= loadImage("record.jpg");
   size(1200, 1200);
   minim = new Minim(this); 
   song = minim.loadFile("awesomeTrack.mp3", 512);
   song.play();
}
void draw(){
  image(pictureOfRecord, 0, 0);
  int angle = 0;
  angle += 5;
  rotateImage(pictureOfRecord, angle);
  mousePressed();
  song.play();
  song.pause();
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
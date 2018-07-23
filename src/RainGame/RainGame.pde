int y = 20;
int x = (int) random(width);
int score = 0;
void setup(){
  size(500, 500);
  
}
void draw()
{
  background(50, 100, 150);
  fill(0, 0, 255);
  stroke(0, 255, 0);
  ellipse(x, y, 20, 25);
 y++;
 if(y==500){
  y = 20;
  catchCheck(x);
  x = (int) random(width);
 }
 rect(mouseX, 450, 40, 55);
  fill(0, 0, 0);
 textSize(16);
 text("Score: " + score, 20, 20);
  
}

 void catchCheck(int x){
  if (x > mouseX && x < mouseX+100){
   score++;
  }
   else if (score > 0){
   score--;
  }
  println("Your score is now: " + score);
}
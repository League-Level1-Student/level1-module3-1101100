float birdX = 255;
float birdY = 0;

float pipeX = 500;
float pipeWidth = 60;

float birdVelocity = 0;
float gravity = 0.05;

int upperPipeHeight = (int) random(100, 400);

float pipeGap = 150;

int score = 0;

     PImage back;
     PImage pipeBottom;
     PImage pipeTop;
     PImage bird;
     
void setup(){
  size(500,700);
   back = loadImage("flappyBackground.jpg");
   back.resize(500,700);
   pipeBottom = loadImage("bottomPipe.png");
   pipeTop = loadImage("topPipe.png");
   bird = loadImage("bird.png");
   bird.resize(50,50);
}

void draw(){
  birdVelocity += gravity;
  birdY += birdVelocity;
  
  pipeX --;
  float lowerY = upperPipeHeight + pipeGap;
  
   background(back);
   image (pipeBottom,pipeX,lowerY);
   image (pipeTop,pipeX,-upperPipeHeight);
   image (bird, birdX, birdY);
  
  if(pipeX <=0){
     pipeX = 500;
  }
  
}

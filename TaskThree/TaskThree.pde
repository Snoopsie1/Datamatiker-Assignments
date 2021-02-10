color red    = color(255,0,0);
color yellow = color(255,255,0);
color green  = color(0,255,0);

void setup()
{
 size(150,320);
 background(100);
 noStroke();
 frameRate(30);
 
 rectMode(CORNERS);
 fill(0);
 rect(20,10,130,310);
 ellipseMode(CENTER);
 
  //Rød lys SLUKKET
  fill(40);
  ellipse(75,60,90,90);
  //Gul lys SLUKEKT
  fill(40);
  ellipse(75,160,90,90);
  //Grøn lys SLUKKET
  fill(40);
  ellipse(75,260,90,90);
}

void draw()
{
  if (frameCount >= 0 && frameCount <= 100) 
  {  
    fill(red);
    ellipse(75,60,90,90);
  }
  else if (frameCount >= 100 && frameCount <= 150)
  {
    fill(yellow);
    ellipse(75,160,90,90);
  }
  else if (frameCount > 150)
  {
   fill(40);
   ellipse(75,60,90,90); //Red Light
   fill(40);
   ellipse(75,160,90,90); //Yellow Light 
   fill(green);
   ellipse(75,260,90,90); //Green Light
  } 
}

public class quizz5_1{
  public static void main (String [] args){
    TV tv1 = new TV();
    tv1.turnOn();
    tv1.wtfarjarn();
    
    TV tv2 = new TV(30,3);
    tv2.turnOn();
    tv2.wtfarjarn();
    
    TV tv3 = new TV(30,1);
    tv3.turnOn();
    tv3.volumeDown();
    tv3.volumeDown();
    tv3.channelUp();
    System.out.printf("Now TV's channel is %d and volume level is %d",tv3.getChannel(),tv3.getVolume());
  }
}

class TV{
  private int channel;
  private int voluemLevel;
  private boolean on;
  public TV(){
    this.channel = 1;
    this.voluemLevel = 1;
  }
  public TV(int CH, int Vol){
    this.channel = CH;
    this.voluemLevel = Vol;
  }
  public void turnOn(){
    this.on = true;
  }
  public void turnOff(){
    this.on = false;
  }
  public void setChannel(int newChannel){
    this.channel = newChannel;

  }
  public void channelUp(){
    if(channel <30){
      channel++;
      this.channel = channel;
    }
  }
  public void channelDown(){
    if(channel <30 && channel >1){
      channel--;
      this.channel=channel;
    }
  }
  public void setVolume(int newVolumeLevel){
    this.voluemLevel = newVolumeLevel;
  }
  public void volumeUp(){
    if(voluemLevel<15){
      voluemLevel++;
      this.voluemLevel = voluemLevel;
    }
  }
  public void volumeDown(){
    if(voluemLevel>0 && voluemLevel <=15){
      voluemLevel--;
      this.voluemLevel = voluemLevel;
    }
  }
  public int getChannel(){
    return channel;
  }
  public int getVolume(){
    return voluemLevel;
  }
  public void wtfarjarn(){
    if(on){
      System.out.printf("Now TV's channel is %d and volume level is %d\n\n",channel,voluemLevel);
    }
  }
}
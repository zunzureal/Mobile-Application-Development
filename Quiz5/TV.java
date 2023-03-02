public class TV {
    private int channel;
    private int volume;
    private boolean on;
    private int maxChannel;
    private int maxVolume;

    public TV() {
        this.channel = 1;
        this.volume = 0;
        this.on = false;
        this.maxChannel = 100;
        this.maxVolume = 100;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isOn() {
        return this.on;
    }

    public int getMaxChannel() {
        return this.maxChannel;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setChannel(int someChannel) {
        if (this.on && someChannel >= 1 && someChannel <= this.maxChannel) {
            this.channel = someChannel;
        }
    }

    public void setVolume(int someVolume) {
        if (this.on && someVolume >= 0 && someVolume <= this.maxVolume) {
            this.volume = someVolume;
        }
    }

    public void setMaxChannel(int maxC) {
        if (maxC >= 1) {
            this.maxChannel = maxC;
        }
    }

    public void setMaxVolume(int maxVol) {
        if (maxVol >= 0) {
            this.maxVolume = maxVol;
        }
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        if (this.on) {
            this.channel++;
            if (this.channel > this.maxChannel) {
                this.channel = 1;
            }
        }
    }

    public void channelDown() {
        if (this.on) {
            this.channel--;
            if (this.channel < 1) {
                this.channel = this.maxChannel;
            }
        }
    }

    public void volumeUp() {
        if (this.on && this.volume < this.maxVolume) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.on && this.volume > 0) {
            this.volume--;
        }
    }

    public String toString() {
        String status = "false";
        if (this.on) {
            status = "true";
        }
        return "\tchannel: " + this.channel + "\n\tvolume: " + this.volume + "\n\ton: " + status + "\n\tmaxChannel: "+ this.maxChannel + "\n\tmaxVolume: "+ this.maxVolume;
    }

        public static void main(String[] args)
        {
            TV tv1 = new TV();
            tv1.turnOn();
            tv1.setChannel(30);
            tv1.setVolume(3);

            System.out.println("tv1:");
            System.out.println("\tChannel: "+ tv1.getChannel());
            System.out.println("\tChannel: "+ tv1.getVolume());

            TV tv2 = new TV();
            tv2.setMaxChannel(120);
            tv2.setMaxVolume(7);
            tv2.turnOn();
            tv2.channelUp();
            tv2.channelUp();
            tv2.volumeUp();
            System.out.println("tv2 State of: \n"+ tv2.toString());

            TV tv3 = new TV();
            tv3.setMaxChannel(3);
            tv3.turnOn();
            tv3.channelUp();
            tv3.channelUp();
            tv3.channelUp();
            tv3.channelUp();
            System.out.println("tv3:");
            System.out.println("\tchannel: "+ tv3.getChannel());

            TV tv4 = new TV();
            tv4.setVolume(5);
            tv4.turnOn();
            tv4.volumeDown();
            tv4.volumeDown();
            System.out.println("tv4:");
            System.out.println("\tvolume: "+ tv4.getVolume());
            System.out.println("\ton: "+ tv4.isOn());

        }
}
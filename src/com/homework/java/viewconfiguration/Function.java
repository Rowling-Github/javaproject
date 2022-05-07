package com.homework.java.viewconfiguration;

public class Function {     //功能类
    private String autoDial;    //自动拨号
    private String game;    //游戏
    private String playMusic;   //播放音乐
    public Function(){}     //无参构造方法
    public Function(String autoDial, String game, String playMusic) {//构造方法
        this.autoDial = autoDial;
        this.game = game;
        this.playMusic = playMusic;
    }
    public String getAutoDial() {
        return autoDial;
    }

    public void setAutoDial(String autoDial) {
        this.autoDial = autoDial;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getPlayMusic() {
        return playMusic;
    }

    public void setPlayMusic(String playMusic) {
        this.playMusic = playMusic;
    }
    public void read(){ //打印方法
        System.out.println("功能："+autoDial+"\t"+game+"\t"+playMusic);
    }
}

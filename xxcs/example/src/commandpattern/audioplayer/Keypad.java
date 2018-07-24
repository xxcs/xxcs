package commandpattern.audioplayer;

public class Keypad {
    private MacroCommand marcoCommand = new MacroAudioCommand();

    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public void setPlayCommand(Command playCommand){
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand){
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand){
        this.stopCommand = stopCommand;
    }

    /**
     * 执行播放方法
     */
    public void play(){
        playCommand.execute();
        marcoCommand.add(playCommand);
    }

    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.execute();
        marcoCommand.add(rewindCommand);
    }

    /**
     * 执行播放方法
     */
    public void stop(){
        stopCommand.execute();
        marcoCommand.add(stopCommand);
    }

    public void marco(){
        marcoCommand.execute();
    }
}

package interview;

import java.io.InputStream;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

interface Project{
    void doCoding();
}

class Employe implements Project{
    @Override
    public void doCoding(){
        System.out.println("工程师在编辑......");
    }
}

class Manager implements Project{
    private Project project;

    public Manager(Project project){
        this.project = project;
    }

    public void doCoding(){
        startNewWork();
        project.doCoding();
    }

    public void startNewWork(){}
}

class ManagerA extends Manager{
    public ManagerA(Project project){
        super(project);
    }

    @Override
    public void startNewWork(){
        System.out.println("开发经理开始新的工作计划");
    }
}

class ManagerB extends Manager{
    public ManagerB(Project project){
        super(project);
    }

    @Override
    public void startNewWork(){
        System.out.println("测试经理开始新的工作计划");
    }
}

public class MainTest {
    public static void main(String[] args){
        Project project = new Employe();
        Project managerA = new ManagerA(project);
        Project managerB = new ManagerB(project);
        managerA.doCoding();
        managerB.doCoding();
    }
}

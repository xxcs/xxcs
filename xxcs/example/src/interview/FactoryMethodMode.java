package interview;

interface ExportFactory{
    public ExportFile factory(String type);
}

class ExportHtmlFactory implements ExportFactory{

    @Override
    public ExportFile factory(String type){
        if ("standard".equals(type)) {
            return new ExportStandardHtmlFile();
        }else if("financial".equals(type)){
            return new ExportFinancialHtmlFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}

class ExportPdfFactory implements ExportFactory{

    @Override
    public ExportFile factory(String type){
        if ("standard".equals(type)){
            return new ExportStandardPdfFile();
        }else if ("financial".equals(type)){
            return new ExportFinancialPdfFile();
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}

interface ExportFile{
    public boolean export(String data);
}

class ExportFinancialHtmlFile implements ExportFile{

    @Override
    public boolean export(String data){
        //TODO Auto-generated method stub
        /*
        *业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }
}

class ExportFinancialPdfFile implements ExportFile{

    @Override
    public boolean export(String data){
        //TODO Auto-generated method stub
        /*
         *业务逻辑
         */
        System.out.println("导出财务版PDF文件");
        return true;
    }
}

class ExportStandardHtmlFile implements ExportFile{

    @Override
    public boolean export(String data){
        //TODO Auto-generated method stub
        /*
         *业务逻辑
         */
        System.out.println("导出标准版HTML文件");
        return true;
    }
}

class ExportStandardPdfFile implements ExportFile{

    @Override
    public boolean export(String data){
        //TODO Auto-generated method stub
        /*
         *业务逻辑
         */
        System.out.println("导出标准版PDF文件");
        return true;
    }
}

public class FactoryMethodMode {
    /**
     * @param args
     */

    public static void main(String[] args){
       //TODO Auto-generated method stub
       String data = "";
       ExportFactory exportFactory = new ExportHtmlFactory();
       ExportFile ef = exportFactory.factory("financial");
       ef.export(data);
    }
}

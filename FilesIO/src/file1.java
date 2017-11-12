import java.io.*;

public class file1 implements Serializable{
    private int height;
    private int width;

    public void setWidth(int w){
        this.width = w;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public static void main(String[] args) throws IOException {
        file1 file = new file1();
        file.setHeight(30);
        file.setWidth(20);

        try{
            FileOutputStream fo = new FileOutputStream("file.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);

            os.writeObject(file);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            BufferedReader reader = new BufferedReader(new FileReader("/home/raman/Desktop/Test_Programs/file.txt"));
            String line = reader.readLine();

            while(line != null){
                System.out.println(line);
            }
            reader.close();
            
        }

    }
}

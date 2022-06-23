import java.io.*;

class RandReadWrite{
  public static void main(String[] args){
     RandomAccessFile raFile = null;
     try{
        raFile = new RandomAccessFile("random.txt","rw");
        raFile.writeChar('J');
        raFile.writeDouble(67.345);
        raFile.writeInt(30045);
        raFile.seek(0);
        System.out.println(raFile.readChar());
        System.out.println(raFile.readDouble());
        System.out.println(raFile.readInt());
        raFile.seek(2);
        System.out.println(raFile.readDouble());
        raFile.seek(raFile.length());
        raFile.writeBoolean(false);
        raFile.seek(4);
        System.out.println(raFile.readBoolean());
        raFile.close();
     }catch(IOException e){
        System.out.println(e);
     }
  }
}

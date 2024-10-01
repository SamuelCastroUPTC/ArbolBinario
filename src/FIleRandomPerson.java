import java.io.RandomAccessFile;
import java.io.IOException;

public class FIleRandomPerson {
    
    String pathFile="person.txt";

    public void write(Person person, int pos) throws IOException {
        RandomAccessFile randomAccessFile;
        try{
            randomAccessFile= new RandomAccessFile(pathFile,"rw");
            randomAccessFile.seek(pos*person.SIZE());
            write(randomAccessFile, person);
            randomAccessFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

    public void read(int pos) throws IOException {
        RandomAccessFile randomAccessFile;
        Person person = new Person();
        try{
            randomAccessFile= new RandomAccessFile(pathFile,"r");
            randomAccessFile.seek(pos*person.SIZE());
            person=read(randomAccessFile);
            System.out.println(person.name+" "+person.age+" "+person.ciudad);      
            randomAccessFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

    public void write(RandomAccessFile rf, Person person) throws IOException{
        rf.writeChars(UtilsString.fillString(person.name, 30));
        rf.writeInt(person.age);
        rf.writeChars(UtilsString.fillString(person.ciudad, 30));
    }

    public Person read(RandomAccessFile rf) throws IOException{
        Person person = new Person();
        StringBuffer aux = new StringBuffer(); 
        for (int i = 0; i < 30; i++) {
            aux.append(rf.readChar());   
        }
        person.name=aux.toString();
        person.age=rf.readInt();
        aux = new StringBuffer();
        for (int i = 0; i < 30; i++) {
            aux.append(rf.readChar());   
        }
        person.ciudad=aux.toString();
        return person;
    }
}

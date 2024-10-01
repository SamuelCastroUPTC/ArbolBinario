public class UtilsString {

    public static String fillString(String cad, int tam){
        StringBuffer aux= new StringBuffer(cad);
        for(int i=cad.length();i<tam;i++){
            aux.append(" ");
        }
        return aux.toString();
    }
    
}

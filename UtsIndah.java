package utsindah;

public class UtsIndah {
    public static void main(String[] args) {
       String varl = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char[] c = {varl.charAt(9),
           varl.charAt(14),
           varl.charAt(4),
           varl.charAt(1),
           varl.charAt(8),
           varl.charAt(0),
           varl.charAt(8),
           varl.charAt(1),
           varl.charAt(12),
           varl.charAt(9),
           varl.charAt(13),
           varl.charAt(1),
           varl.charAt(20),
           varl.charAt(21),
           varl.charAt(19),
           varl.charAt(1),
           varl.charAt(4),
           varl.charAt(9),
           varl.charAt(1),
           varl.charAt(8),
       };
       
       for (int i=0;i<c.length;i++){
       System.out.print(c[i]);
    }
    
     System.out.println();
    }
}
